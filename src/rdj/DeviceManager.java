/*
 * Copyright © 2017 Ron de Jong (ronuitzaandam@gmail.com).
 *
 * This is free software; you can redistribute it 
 * under the terms of the Creative Commons License
 * Creative Commons License: (CC BY-NC-ND 4.0) as published by
 * https://creativecommons.org/licenses/by-nc-nd/4.0/ ; either
 * version 4.0 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 * Creative Commons Attribution-NonCommercial-NoDerivatives 4.0
 * International Public License for more details.
 *
 * You should have received a copy of the Creative Commons 
 * Public License License along with this software;
 */
package rdj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeviceManager extends Thread
{
    private final UI ui;
        
    public DeviceManager(UI ui) { this.ui = ui; }
    
    public void createCipherDevice(Path cipherFilePath, Device targetDevice)
    {
	if ( isValidFile(targetDevice.getPath(), false, false, true) )
	{
	    GPT gpt = new GPT(ui);
	    gpt.create(GPT.getCipherFileSize(ui, cipherFilePath), targetDevice);
	    gpt.write(targetDevice);
	    gpt.writeCipher(cipherFilePath, targetDevice);
	    gpt.print();
	    try { Thread.sleep(250); } catch (InterruptedException ex) {  }
	}
    }

    public void cloneCipherDevice(Device cipherDevice, Device targetDevice)
    {
	if ( ( isValidFile(cipherDevice.getPath(), false, false, true) ) && ( isValidFile(targetDevice.getPath(), false, false, true) ) )
	{
	    GPT gpt = new GPT(ui);
	    
//	    Either read (clone diskGUIDs & partitionGUIDs) or create (new diskGUIDs & partitionGUIDs)
//            gpt.read(cipherDeviceFilePath); // Copies currentLBA and backupLBA which causes invalid headers on a different size USB Stick
	    gpt.create(DeviceController.getCipherPartitionSize(ui, cipherDevice), targetDevice);
	    
	    gpt.write(targetDevice);
	    gpt.cloneCipher(cipherDevice, targetDevice);
	    gpt.print();
	    try { Thread.sleep(250); } catch (InterruptedException ex) {  }
	}
    }

//  Used by --gpt option
    public void printGPT(Device cipherDevice)
    {
	if ( isValidFile(cipherDevice.getPath(), false, false, true) )
	{
	    GPT gpt = new GPT(ui);
	    gpt.read(cipherDevice);
	    gpt.print();
	}
    }
    
    public void deleteGPT(Device targetDevice)
    {
	if ( isValidFile(targetDevice.getPath(), false, false, true) )
	{
	    GPT gpt = new GPT(ui);
	    gpt.write(targetDevice);
	    gpt.read(targetDevice);
	    gpt.print();
	}
    }

    public boolean isValidDir(Path path, boolean symlink, boolean report)
    {
        boolean validdir = true; String conditions = "";        String exist = ""; String read = ""; String write = ""; String symbolic = "";
        if ( ! Files.exists(path))                              { validdir = false; exist = "[not found] "; conditions += exist; }
        if ( ! Files.isReadable(path) )                         { validdir = false; read = "[not readable] "; conditions += read;  }
        if ( ! Files.isWritable(path) )                         { validdir = false; write = "[not writable] "; conditions += write;  }
        if ( (! symlink) && (Files.isSymbolicLink(path)) )      { validdir = false; symbolic = "[symlink]"; conditions += symbolic;  }
        if ( validdir ) {  } else { if ( report )               { ui.error("Warning: Invalid Dir: " + path.toString() + ": " + conditions + "\r\n"); } }
        return validdir;
    }

    public boolean isValidFile(Path path, boolean readSize, boolean symlink, boolean report)
    {
        boolean validfile = true; String conditions = "";       String size = ""; String exist = ""; String dir = ""; String read = ""; String write = ""; String symbolic = "";
        long fileSize = 0;					if ( readSize ) { try { fileSize = Files.size(path); } catch (IOException ex) { } }

        if ( ! Files.exists(path))                              { validfile = false; exist = "[not found] "; conditions += exist; }
        else
        {
            if ( Files.isDirectory(path))                       { validfile = false; dir = "[is directory] "; conditions += dir; }
            if ((readSize) && ( fileSize == 0 ))                { validfile = false; size = "[empty] "; conditions += size; }
            if ( ! Files.isReadable(path) )                     { validfile = false; read = "[not readable] "; conditions += read; }
            if ( ! Files.isWritable(path) )                     { validfile = false; write = "[not writable] "; conditions += write; }
            if ( (! symlink) && (Files.isSymbolicLink(path)) )  { validfile = false; symbolic = "[symlink]"; conditions += symbolic; }
        }
        if ( ! validfile ) { if ( report )			{ ui.error("Warning: DevMgr: Invalid File: " + path.toAbsolutePath().toString() + ": " + conditions + "\r\n"); } }                    
        return validfile;
    }

}