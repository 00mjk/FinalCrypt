package rdj;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends javax.swing.JFrame implements UI
{
    FinalCrypt finalCrypt;
    GUI gui;

    public GUI()
    {
        gui = this;
        
//        SwingUtilities.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
                
                
        initComponents();
//        initComponents();
        try
        { UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); }
        catch (ClassNotFoundException ex) { }
        catch (InstantiationException ex) { }
        catch (IllegalAccessException ex) { }
        catch (UnsupportedLookAndFeelException ex) { }
        
        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
        int winWidth = (int)getWidth();
        int winHeight = (int)getHeight();
        int posX = Math.round((screenDim.width / 2) - (winWidth / 2));
        int posY = Math.round((screenDim.height / 2) - (winHeight / 2));
        setLocation(posX, posY);

//        disableSomeComponents(inputFileChooser);
//        disableSomeComponents(cipherFileChooser);
        
        finalCrypt = new FinalCrypt(gui);
        finalCrypt.start();
        
        
//            }
//        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        logoLabel = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        encryptPanel = new javax.swing.JPanel();
        inputFilePane = new javax.swing.JPanel();
        inputFileChooserLabel = new javax.swing.JLabel();
        inputFileChooser = new javax.swing.JFileChooser();
        cipherFilePane = new javax.swing.JPanel();
        cipherFileChooserLabel = new javax.swing.JLabel();
        cipherFileChooser = new javax.swing.JFileChooser();
        logPane = new javax.swing.JPanel();
        logScroller = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        bottomPanel = new javax.swing.JPanel();
        buttonPanel1 = new javax.swing.JPanel();
        encryptButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        buttonPanel2 = new javax.swing.JPanel();
        logButton = new javax.swing.JToggleButton();
        printButton = new javax.swing.JToggleButton();
        textButton = new javax.swing.JToggleButton();
        binButton = new javax.swing.JToggleButton();
        decButton = new javax.swing.JToggleButton();
        hexButton = new javax.swing.JToggleButton();
        charButton = new javax.swing.JToggleButton();
        verboseButton = new javax.swing.JToggleButton();
        debugButton = new javax.swing.JToggleButton();
        bufferSlider = new javax.swing.JSlider();
        progressPanel = new javax.swing.JPanel();
        filesProgressBar = new javax.swing.JProgressBar();
        fileProgressBar = new javax.swing.JProgressBar();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1039, 709));

        logoLabel.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("FinalCrypt");
        logoLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tab.setBackground(new java.awt.Color(0, 0, 0));
        tab.setFont(tab.getFont().deriveFont(tab.getFont().getSize()+4f));
        tab.setMinimumSize(new java.awt.Dimension(1000, 29));
        tab.setPreferredSize(new java.awt.Dimension(1000, 100));

        encryptPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        encryptPanel.setPreferredSize(new java.awt.Dimension(1000, 524));
        encryptPanel.setLayout(new java.awt.GridLayout());

        inputFilePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        inputFileChooserLabel.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        inputFileChooserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputFileChooserLabel.setText("Select Data Files");
        inputFileChooserLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inputFileChooser.setControlButtonsAreShown(false);
        inputFileChooser.setCurrentDirectory(null);
        inputFileChooser.setToolTipText("Right mousclick for Refresh");
        inputFileChooser.setMultiSelectionEnabled(true);
        inputFileChooser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                inputFileChooserActionPerformed(evt);
            }
        });
        inputFileChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                inputFileChooserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout inputFilePaneLayout = new javax.swing.GroupLayout(inputFilePane);
        inputFilePane.setLayout(inputFilePaneLayout);
        inputFilePaneLayout.setHorizontalGroup(
            inputFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(inputFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputFilePaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(inputFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputFileChooserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        inputFilePaneLayout.setVerticalGroup(
            inputFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(inputFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputFilePaneLayout.createSequentialGroup()
                    .addComponent(inputFileChooserLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(inputFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        encryptPanel.add(inputFilePane);

        cipherFilePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cipherFileChooserLabel.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        cipherFileChooserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cipherFileChooserLabel.setText("Select Cipher File");
        cipherFileChooserLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cipherFileChooser.setControlButtonsAreShown(false);
        cipherFileChooser.setCurrentDirectory(null);
        cipherFileChooser.setToolTipText("");
        cipherFileChooser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cipherFileChooserActionPerformed(evt);
            }
        });
        cipherFileChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                cipherFileChooserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout cipherFilePaneLayout = new javax.swing.GroupLayout(cipherFilePane);
        cipherFilePane.setLayout(cipherFilePaneLayout);
        cipherFilePaneLayout.setHorizontalGroup(
            cipherFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(cipherFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cipherFilePaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cipherFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cipherFileChooserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cipherFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        cipherFilePaneLayout.setVerticalGroup(
            cipherFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(cipherFilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cipherFilePaneLayout.createSequentialGroup()
                    .addComponent(cipherFileChooserLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cipherFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        encryptPanel.add(cipherFilePane);

        tab.addTab("Encrypt", encryptPanel);

        logScroller.setAutoscrolls(true);
        logScroller.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logTextArea.setColumns(20);
        logTextArea.setFont(new java.awt.Font("Courier 10 Pitch", 0, 18)); // NOI18N
        logTextArea.setRows(5);
        logScroller.setViewportView(logTextArea);

        javax.swing.GroupLayout logPaneLayout = new javax.swing.GroupLayout(logPane);
        logPane.setLayout(logPaneLayout);
        logPaneLayout.setHorizontalGroup(
            logPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPaneLayout.createSequentialGroup()
                .addComponent(logScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                .addContainerGap())
        );
        logPaneLayout.setVerticalGroup(
            logPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        tab.addTab("Log", logPane);

        bottomPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonPanel1.setLayout(new java.awt.GridLayout(1, 3));

        encryptButton.setFont(new java.awt.Font("Arimo", 0, 18)); // NOI18N
        encryptButton.setText("Encrypt");
        encryptButton.setEnabled(false);
        encryptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                encryptButtonActionPerformed(evt);
            }
        });
        buttonPanel1.add(encryptButton);

        pauseButton.setFont(new java.awt.Font("Arimo", 0, 18)); // NOI18N
        pauseButton.setText("Pause");
        pauseButton.setEnabled(false);
        buttonPanel1.add(pauseButton);

        stopButton.setFont(new java.awt.Font("Arimo", 0, 18)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        buttonPanel1.add(stopButton);

        buttonPanel2.setLayout(new java.awt.GridLayout(1, 3));

        logButton.setText("Log");
        logButton.setToolTipText("Enable Data Logging");
        logButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(logButton);

        printButton.setText("Print");
        printButton.setToolTipText("Log Overal Data");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                printButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(printButton);

        textButton.setText("Text");
        textButton.setToolTipText("Log Text Data");
        textButton.setEnabled(false);
        textButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(textButton);

        binButton.setText("Bin");
        binButton.setToolTipText("Log Binary Data");
        binButton.setEnabled(false);
        binButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                binButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(binButton);

        decButton.setText("Dec");
        decButton.setToolTipText("Log Decimal Data");
        decButton.setEnabled(false);
        decButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(decButton);

        hexButton.setText("Hex");
        hexButton.setToolTipText("Log Hexadecimal Data");
        hexButton.setEnabled(false);
        hexButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hexButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(hexButton);

        charButton.setText("Char");
        charButton.setToolTipText("Log Character Data");
        charButton.setEnabled(false);
        charButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                charButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(charButton);

        verboseButton.setText("Verbose");
        verboseButton.setToolTipText("Logs more run details");
        verboseButton.setEnabled(false);
        verboseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                verboseButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(verboseButton);

        debugButton.setText("Debug");
        debugButton.setToolTipText("Log Debug Data");
        debugButton.setEnabled(false);
        debugButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                debugButtonActionPerformed(evt);
            }
        });
        buttonPanel2.add(debugButton);

        bufferSlider.setMinimum(1);
        bufferSlider.setPaintLabels(true);
        bufferSlider.setToolTipText("Sets buffersize in MB");
        buttonPanel2.add(bufferSlider);

        progressPanel.setLayout(new java.awt.GridLayout(3, 0));
        progressPanel.add(filesProgressBar);
        progressPanel.add(fileProgressBar);

        statusLabel.setBackground(new java.awt.Color(255, 0, 0));
        statusLabel.setForeground(new java.awt.Color(50, 50, 50));
        statusLabel.setText("Status");
        statusLabel.setBorder(null);
        progressPanel.add(statusLabel);

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bottomPanelLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                    .addContainerGap(99, Short.MAX_VALUE)
                    .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFileChooserPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_inputFileChooserPropertyChange
    {//GEN-HEADEREND:event_inputFileChooserPropertyChange
        if ((inputFileChooser != null) && (cipherFileChooser != null) && (inputFileChooser.getSelectedFiles() != null) && (cipherFileChooser.getSelectedFile() != null))
        {
            if (
                    ( inputFileChooser.getSelectedFiles().length > 0 ) && 
                    ( cipherFileChooser.getSelectedFile().length() > (long)0 )
               )
            { encryptButton.setEnabled(true); } else { encryptButton.setEnabled(false); }
        } else { encryptButton.setEnabled(false); }
    }//GEN-LAST:event_inputFileChooserPropertyChange

    private void inputFileChooserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_inputFileChooserActionPerformed
    {//GEN-HEADEREND:event_inputFileChooserActionPerformed
    }//GEN-LAST:event_inputFileChooserActionPerformed

    private void cipherFileChooserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cipherFileChooserActionPerformed
    {//GEN-HEADEREND:event_cipherFileChooserActionPerformed
    }//GEN-LAST:event_cipherFileChooserActionPerformed

    private void cipherFileChooserPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_cipherFileChooserPropertyChange
    {//GEN-HEADEREND:event_cipherFileChooserPropertyChange
        if ((inputFileChooser != null) && (cipherFileChooser != null) && (inputFileChooser.getSelectedFiles() != null) && (cipherFileChooser.getSelectedFile() != null))
        {
            if ( 
                    ( inputFileChooser.getSelectedFiles().length > 0 ) && 
                    ( cipherFileChooser.getSelectedFile().length() > (long)0 )
               ) 
            { encryptButton.setEnabled(true); } else { encryptButton.setEnabled(false); }
        } else { encryptButton.setEnabled(false); }
    }//GEN-LAST:event_cipherFileChooserPropertyChange

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_encryptButtonActionPerformed
    {//GEN-HEADEREND:event_encryptButtonActionPerformed
        Path outputFilePath = null;

        ArrayList<Path> inputFilesPathList = new ArrayList<>();

        // Add the inputFilesPath to List from inputFileChooser
        for (File file:inputFileChooser.getSelectedFiles()) { inputFilesPathList.add(file.toPath()); }

        // Validate and create output files
        for(Path inputFilePathItem : inputFilesPathList)
        {
            
            if ( finalCrypt.isValidFile(inputFilePathItem, false, true) ) {} else   { error("Error input\n"); }
            
            // Compare inputfile to cipherfile
            if ( inputFilePathItem.compareTo(cipherFileChooser.getSelectedFile().toPath()) == 0 )      { error("Skipping inputfile: equal to cipherfile!\n"); }

            // Validate output file
            outputFilePath = inputFilePathItem.resolveSibling(inputFilePathItem.getFileName() + ".dat");
            if ( finalCrypt.isValidFile(outputFilePath, true, false) ) {} else  { error("Error cipher\n"); }
        }
                
        finalCrypt.setInputFilesPathList(inputFilesPathList);
        finalCrypt.setCipherFilePath(cipherFileChooser.getSelectedFile().toPath());
 
        // Resize file Buffers to size smalles file
        try 
        {
            if ( Files.size(finalCrypt.getCipherFilePath()) < finalCrypt.getBufferSize())
            {
                finalCrypt.setBufferSize((int) (long) Files.size(finalCrypt.getCipherFilePath()));
                if ( finalCrypt.getVerbose() ) { log("Alert: BufferSize limited to cipherfile size: " + finalCrypt.getBufferSize()); }
            }
        }
        catch (IOException ex) { error("Files.size(cfp)" + ex); }

        filesProgressBar.setValue(0);
        fileProgressBar.setValue(0);
        
        finalCrypt.encryptFiles();
    }//GEN-LAST:event_encryptButtonActionPerformed

    public void setProgressBarsMax(int filesMax, int fileMax)
    {        
//        filesProgressBar.setMaximum(finalCrypt.filesBytesTotal);
//        fileProgressBar.setMaximum(finalCrypt.fileBytesTotal);
        filesProgressBar.setMaximum(filesMax);
        fileProgressBar.setMaximum(fileMax);
    }
    
    private void logButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_logButtonActionPerformed
    {//GEN-HEADEREND:event_logButtonActionPerformed
        printButton.setEnabled(logButton.isSelected());
        textButton.setEnabled(logButton.isSelected());
        binButton.setEnabled(logButton.isSelected());
        decButton.setEnabled(logButton.isSelected());
        hexButton.setEnabled(logButton.isSelected());
        charButton.setEnabled(logButton.isSelected());
        verboseButton.setEnabled(logButton.isSelected());
        debugButton.setEnabled(logButton.isSelected());
        tab.setSelectedIndex((logButton.isSelected()) ? 1 : 0);
        setOptions();
    }//GEN-LAST:event_logButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_printButtonActionPerformed
    {//GEN-HEADEREND:event_printButtonActionPerformed
//        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_printButtonActionPerformed

    private void textButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textButtonActionPerformed
    {//GEN-HEADEREND:event_textButtonActionPerformed
        printButton.setSelected(false);
//        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_textButtonActionPerformed

    private void binButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_binButtonActionPerformed
    {//GEN-HEADEREND:event_binButtonActionPerformed
        printButton.setSelected(false);
        textButton.setSelected(false);
//        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_binButtonActionPerformed

    private void decButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_decButtonActionPerformed
    {//GEN-HEADEREND:event_decButtonActionPerformed
        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
//        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_decButtonActionPerformed

    private void hexButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hexButtonActionPerformed
    {//GEN-HEADEREND:event_hexButtonActionPerformed
        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
//        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_hexButtonActionPerformed

    private void charButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_charButtonActionPerformed
    {//GEN-HEADEREND:event_charButtonActionPerformed
//        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
//        charButton.setSelected(false);
        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_charButtonActionPerformed

    private void verboseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_verboseButtonActionPerformed
    {//GEN-HEADEREND:event_verboseButtonActionPerformed
        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
//        verboseButton.setSelected(false);
        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_verboseButtonActionPerformed

    private void debugButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_debugButtonActionPerformed
    {//GEN-HEADEREND:event_debugButtonActionPerformed
        printButton.setSelected(false);
        textButton.setSelected(false);
        binButton.setSelected(false);
        decButton.setSelected(false);
        hexButton.setSelected(false);
        charButton.setSelected(false);
        verboseButton.setSelected(false);
//        debugButton.setSelected(false);
        setOptions();
    }//GEN-LAST:event_debugButtonActionPerformed

    private void setOptions()
    {
        finalCrypt.setPrint(logButton.isSelected() & printButton.isSelected());
        finalCrypt.setPrint(logButton.isSelected() & printButton.isSelected());
        finalCrypt.setTXT(logButton.isSelected() & textButton.isSelected());
        finalCrypt.setBin(logButton.isSelected() & binButton.isSelected());
        finalCrypt.setDec(logButton.isSelected() & decButton.isSelected());
        finalCrypt.setHex(logButton.isSelected() & hexButton.isSelected());
        finalCrypt.setChr(logButton.isSelected() & charButton.isSelected());
        finalCrypt.setVerbose(logButton.isSelected() & verboseButton.isSelected());
        finalCrypt.setDebug(logButton.isSelected() & debugButton.isSelected());
    }
    
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }
    
    public boolean disableSomeComponents(Container container)
    {
        Component[] components = container.getComponents();
        for (Component component : components)
        {
            if (component instanceof JTextField)
            {
                ((JTextField)component).setEnabled(false);
                ((JTextField)component).setVisible(false);                
//                return true;
            }
            if (component instanceof JComboBox)
            {
                if ( ((JComboBox)component).getSelectedItem().toString().toLowerCase().contains("BasicFileChooserUI".toLowerCase()) )
                {
                    ((JComboBox)component).setEnabled(false);
                    ((JComboBox)component).setVisible(false);                
                }
//                return true;
            }
            if (component instanceof JLabel)
            {
                ((JLabel)component).setEnabled(false);
                ((JLabel)component).setVisible(false);                
//                return true;
            }
            if (component instanceof JToggleButton)
            {
                if (   ! ((JToggleButton)component).isSelected()   )
                {
                    ((JToggleButton)component).doClick();
                }
            }
            if (component instanceof Container)
            {
                if(disableSomeComponents((Container) component)) return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton binButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JSlider bufferSlider;
    private javax.swing.JPanel buttonPanel1;
    private javax.swing.JPanel buttonPanel2;
    private javax.swing.JToggleButton charButton;
    private javax.swing.JFileChooser cipherFileChooser;
    private javax.swing.JLabel cipherFileChooserLabel;
    private javax.swing.JPanel cipherFilePane;
    private javax.swing.JToggleButton debugButton;
    private javax.swing.JToggleButton decButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JPanel encryptPanel;
    private javax.swing.JProgressBar fileProgressBar;
    private javax.swing.JProgressBar filesProgressBar;
    private javax.swing.JToggleButton hexButton;
    private javax.swing.JFileChooser inputFileChooser;
    private javax.swing.JLabel inputFileChooserLabel;
    private javax.swing.JPanel inputFilePane;
    private javax.swing.JToggleButton logButton;
    private javax.swing.JPanel logPane;
    private javax.swing.JScrollPane logScroller;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton pauseButton;
    private javax.swing.JToggleButton printButton;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton stopButton;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JToggleButton textButton;
    private javax.swing.JToggleButton verboseButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void log(final String message)
    {
        logTextArea.append(message);
        Thread logThread = new Thread(new Runnable()
        {
            @Override
            @SuppressWarnings({"static-access"})
            public void run()
            {
                logScroller.getVerticalScrollBar().setValue(logScroller.getVerticalScrollBar().getMaximum());
            }
        });
        logThread.setName("updateProgressThread");
        logThread.setDaemon(false);
        logThread.start();
    }

    @Override
    public void error(final String message)
    {
        status(message);
    }

    @Override
    synchronized public void status(final String status)
    {
        statusLabel.setText(status);
        log(status);
    }

    @Override
    synchronized public void updateEncryptionDiffStats(final int value)
    {
        Thread updateGraphThread = new Thread(new Runnable()
        {
            @Override
            @SuppressWarnings({"static-access"})
            public void run()
            {
            }
        });
        updateGraphThread.setName("updateProgressThread");
        updateGraphThread.setDaemon(true);
        updateGraphThread.start();
    }

    @Override
    public void updateProgress(final int filesProgress, final int fileProgress)
    {
//        Thread updateProgressThread = new Thread(new Runnable()
//        {
//            @Override
//            @SuppressWarnings({"static-access"})
//            public void run()
//            {
//                filesProgressBar.setValue(filesProgress);
//                fileProgressBar.setValue(fileProgress);
//            }
//        });
//        updateProgressThread.setName("updateProgressThread");
//        updateProgressThread.setDaemon(true);
//        updateProgressThread.setPriority(Thread.MAX_PRIORITY);
//        updateProgressThread.start();
    
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                filesProgressBar.setValue(filesProgress);
//                fileProgressBar.setValue(fileProgress);
            }
        });
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
//                filesProgressBar.setValue(filesProgress);
                fileProgressBar.setValue(fileProgress);
            }
        });
    }

    @Override
    synchronized public void encryptionEnded()
    {
        Thread encryptionEndedThread = new Thread(new Runnable()
        {
            @Override
            @SuppressWarnings({"static-access"})
            public void run()
            {
                status("Encryption Finished\n");
                filesProgressBar.setValue(0);
                fileProgressBar.setValue(0);
                inputFileChooser.rescanCurrentDirectory();
                cipherFileChooser.rescanCurrentDirectory();
            }
        });
        encryptionEndedThread.setName("updateProgressThread");
        encryptionEndedThread.setDaemon(true);
        encryptionEndedThread.start();
    }

    @Override
    synchronized public void updateProgressMax(final int filesProgressMax, final int fileProgressMax)
    {
        Thread updateProgressMaxThread = new Thread(new Runnable()
        {
            @Override
            @SuppressWarnings({"static-access"})
            public void run()
            {
                filesProgressBar.setMaximum(filesProgressMax);
                fileProgressBar.setMaximum(fileProgressMax);
            }
        });
        updateProgressMaxThread.setName("updateProgressThread");
        updateProgressMaxThread.setDaemon(true);
        updateProgressMaxThread.start();
    }
}
