package DSST007_1_CUS13.pll;

import DSST007_1_CUS13.bll.CutWorkOrderStatment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen
 */
public class CutWorkOrderStatementEntry extends javax.swing.JInternalFrame {

    private static CutWorkOrderStatementEntry MyInstance;
    
    public CutWorkOrderStatementEntry() {
        initComponents();
        
        ((JTextField)jobDate_jdc.getDateEditor()).setBackground(new Color(193,255,224));
        ((JTextField)jobDate_jdc.getDateEditor()).setEditable(false);
        ((JButton)jobDate_jdc.getCalendarButton()).setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        workOrder_jcb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        showWorkOrderDetails_jb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rolls_jtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rate_jtf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        amount_jtf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        saveAndPrint_jb = new javax.swing.JButton();
        saveOnly_jb = new javax.swing.JButton();
        newData_jb = new javax.swing.JButton();
        closeWindow_jb = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        remarks_jtf = new javax.swing.JTextField();
        jobDate_jdc = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        workOrderId_lbl = new javax.swing.JLabel();
        jobName_lbl = new javax.swing.JLabel();
        colour_jtf = new javax.swing.JTextField();
        supplier_jtf = new javax.swing.JTextField();
        mfr_jtf = new javax.swing.JTextField();
        gsm_jtf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        customer_lbl = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        setClosable(true);
        setTitle("Transactions > Cut Work Statement");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/DSST007_1_CUS13/InstabizTrader Logo Final 35x35.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 242, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Work Order :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        workOrder_jcb.setEditable(true);
        workOrder_jcb.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(workOrder_jcb, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Job Date :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        showWorkOrderDetails_jb.setBackground(new java.awt.Color(185, 197, 31));
        showWorkOrderDetails_jb.setText("Show");
        showWorkOrderDetails_jb.setPreferredSize(new java.awt.Dimension(80, 27));
        showWorkOrderDetails_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                showWorkOrderDetails_jbMouseClicked(evt);
            }
        });
        showWorkOrderDetails_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                showWorkOrderDetails_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(showWorkOrderDetails_jb, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Roll :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        rolls_jtf.setEditable(false);
        rolls_jtf.setBackground(new java.awt.Color(193, 255, 224));
        rolls_jtf.setPreferredSize(new java.awt.Dimension(150, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(rolls_jtf, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("GSM :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Colour :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Supplier :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Manufacturer :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Rate :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        rate_jtf.setPreferredSize(new java.awt.Dimension(150, 27));
        rate_jtf.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                rate_jtfKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                rate_jtfKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel1.add(rate_jtf, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Amount :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        amount_jtf.setEditable(false);
        amount_jtf.setBackground(new java.awt.Color(193, 255, 224));
        amount_jtf.setPreferredSize(new java.awt.Dimension(150, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel1.add(amount_jtf, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(242, 242, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        saveAndPrint_jb.setBackground(new java.awt.Color(185, 197, 31));
        saveAndPrint_jb.setText("Save&Print");
        saveAndPrint_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        saveAndPrint_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                saveAndPrint_jbMouseClicked(evt);
            }
        });
        saveAndPrint_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                saveAndPrint_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(saveAndPrint_jb, gridBagConstraints);

        saveOnly_jb.setBackground(new java.awt.Color(185, 197, 31));
        saveOnly_jb.setText("Save");
        saveOnly_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        saveOnly_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                saveOnly_jbMouseClicked(evt);
            }
        });
        saveOnly_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                saveOnly_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(saveOnly_jb, gridBagConstraints);

        newData_jb.setBackground(new java.awt.Color(86, 132, 191));
        newData_jb.setText("New");
        newData_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        newData_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                newData_jbMouseClicked(evt);
            }
        });
        newData_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                newData_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel2.add(newData_jb, gridBagConstraints);

        closeWindow_jb.setBackground(new java.awt.Color(86, 132, 191));
        closeWindow_jb.setMnemonic('c');
        closeWindow_jb.setText("Close");
        closeWindow_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        closeWindow_jb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                closeWindow_jbActionPerformed(evt);
            }
        });
        closeWindow_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                closeWindow_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel2.add(closeWindow_jb, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 4, 5);
        jPanel1.add(jSeparator2, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Remarks :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel10, gridBagConstraints);

        remarks_jtf.setPreferredSize(new java.awt.Dimension(250, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel1.add(remarks_jtf, gridBagConstraints);

        jobDate_jdc.setBackground(new java.awt.Color(242, 242, 255));
        jobDate_jdc.setDateFormatString("dd-MMM-yyyy");
        jobDate_jdc.setPreferredSize(new java.awt.Dimension(150, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jobDate_jdc, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Job Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Work Order Id :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        workOrderId_lbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        workOrderId_lbl.setText("--");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel1.add(workOrderId_lbl, gridBagConstraints);

        jobName_lbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jobName_lbl.setText("--");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel1.add(jobName_lbl, gridBagConstraints);

        colour_jtf.setEditable(false);
        colour_jtf.setBackground(new java.awt.Color(193, 255, 224));
        colour_jtf.setPreferredSize(new java.awt.Dimension(150, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(colour_jtf, gridBagConstraints);

        supplier_jtf.setEditable(false);
        supplier_jtf.setBackground(new java.awt.Color(193, 255, 224));
        supplier_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(supplier_jtf, gridBagConstraints);

        mfr_jtf.setEditable(false);
        mfr_jtf.setBackground(new java.awt.Color(193, 255, 224));
        mfr_jtf.setPreferredSize(new java.awt.Dimension(250, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(mfr_jtf, gridBagConstraints);

        gsm_jtf.setEditable(false);
        gsm_jtf.setBackground(new java.awt.Color(193, 255, 224));
        gsm_jtf.setPreferredSize(new java.awt.Dimension(150, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(gsm_jtf, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Customer :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        customer_lbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        customer_lbl.setText("--");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        jPanel1.add(customer_lbl, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
 
        Dimension desktopSize = NewMDIApplication.desktopbg_jlbl.getSize();
        Dimension jInternalFrameSize = this.getSize();
        //this.setLocation((desktopSize.width - jInternalFrameSize.width)/2,(desktopSize.height- jInternalFrameSize.height)/2);
        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2,20);
        //----------------------------

        load_workOrder_jcb();
        SearchableCombobox searchableCombobox_1 = new SearchableCombobox(workOrder_jcb);
        ((JTextField)workOrder_jcb.getEditor().getEditorComponent()).addKeyListener(searchableCombobox_1); 
        
    }//GEN-LAST:event_formInternalFrameOpened

    public static CutWorkOrderStatementEntry getInstance() // Method
    {
        if (MyInstance == null)
	{
            MyInstance = new CutWorkOrderStatementEntry();
	}
        return MyInstance;
    }

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:

        MyInstance = null;

    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        
         MyInstance = null;
        
    }//GEN-LAST:event_formInternalFrameClosing

    private void saveOnly_jbMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_saveOnly_jbMouseClicked
    {//GEN-HEADEREND:event_saveOnly_jbMouseClicked
        if(saveOnly_jb.isEnabled() == true)
        {
            saveCutOrderEstimateEntry();
        }
    }//GEN-LAST:event_saveOnly_jbMouseClicked

    private void showWorkOrderDetails_jbMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_showWorkOrderDetails_jbMouseClicked
    {//GEN-HEADEREND:event_showWorkOrderDetails_jbMouseClicked
        displayWorkOrderDetails();
    }//GEN-LAST:event_showWorkOrderDetails_jbMouseClicked

    private void rate_jtfKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_rate_jtfKeyTyped
    {//GEN-HEADEREND:event_rate_jtfKeyTyped
        String text = rate_jtf.getText();
        int lastindex = text.lastIndexOf(".");
        
        char c = evt.getKeyChar();

        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.'))
        {
            //  evt.getKeyChar() == '.' does accept point when jtextfield accepts decimal number
            evt.consume();
            getToolkit().beep();
        
        }
        else if(lastindex >= 0 && !Character.isDigit(c))
        {
            evt.consume();
        }

    }//GEN-LAST:event_rate_jtfKeyTyped

    private void rate_jtfKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_rate_jtfKeyReleased
    {//GEN-HEADEREND:event_rate_jtfKeyReleased
        if(!rolls_jtf.getText().equals(""))
        {
            if(!rate_jtf.getText().equals(""))
            {
                BigDecimal noOfRolls_bd = new BigDecimal(rolls_jtf.getText());
                BigDecimal rate_bd = new BigDecimal(rate_jtf.getText());
                BigDecimal amount_bd = noOfRolls_bd.setScale(2, RoundingMode.HALF_UP).multiply(rate_bd.setScale(2, RoundingMode.HALF_UP));
                String amount_str = (amount_bd.setScale(2, RoundingMode.HALF_UP)).toString();
                amount_jtf.setText(amount_str); 
            }
            else
            {
                amount_jtf.setText("");
            }
        }
        else
        {
            amount_jtf.setText("");
        }
    }//GEN-LAST:event_rate_jtfKeyReleased

    private void newData_jbMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_newData_jbMouseClicked
    {//GEN-HEADEREND:event_newData_jbMouseClicked
        newData();
    }//GEN-LAST:event_newData_jbMouseClicked

    private void showWorkOrderDetails_jbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_showWorkOrderDetails_jbKeyPressed
    {//GEN-HEADEREND:event_showWorkOrderDetails_jbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            displayWorkOrderDetails();
        }
    }//GEN-LAST:event_showWorkOrderDetails_jbKeyPressed

    private void saveAndPrint_jbMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_saveAndPrint_jbMouseClicked
    {//GEN-HEADEREND:event_saveAndPrint_jbMouseClicked
        if(saveAndPrint_jb.isEnabled() == true)
        {
            if(saveCutOrderEstimateEntry() == true)
            {
                printCutWorkStatement();
            }
        }
    }//GEN-LAST:event_saveAndPrint_jbMouseClicked

    private void saveAndPrint_jbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_saveAndPrint_jbKeyPressed
    {//GEN-HEADEREND:event_saveAndPrint_jbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(saveCutOrderEstimateEntry() == true)
            {
                printCutWorkStatement();
            }
        }
    }//GEN-LAST:event_saveAndPrint_jbKeyPressed

    private void newData_jbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_newData_jbKeyPressed
    {//GEN-HEADEREND:event_newData_jbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            saveCutOrderEstimateEntry();
        }
    }//GEN-LAST:event_newData_jbKeyPressed

    private void closeWindow_jbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeWindow_jbActionPerformed
    {//GEN-HEADEREND:event_closeWindow_jbActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeWindow_jbActionPerformed

    private void closeWindow_jbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_closeWindow_jbKeyPressed
    {//GEN-HEADEREND:event_closeWindow_jbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.dispose();
        }
    }//GEN-LAST:event_closeWindow_jbKeyPressed

    private void saveOnly_jbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_saveOnly_jbKeyPressed
    {//GEN-HEADEREND:event_saveOnly_jbKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            saveCutOrderEstimateEntry();
        }
    }//GEN-LAST:event_saveOnly_jbKeyPressed

    private void printCutWorkStatement()
    {
         try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy",Locale.getDefault());

            String source = "CutWorkStatement.jasper";
            InputStream is = getClass().getResourceAsStream(source);

            Map parameters = new HashMap();
            parameters.put("Date", sdf.format(jobDate_jdc.getDate()));
            parameters.put("Customer", customer_lbl.getText());
            parameters.put("JobName", jobName_lbl.getText());
            parameters.put("WorkOrderID", workOrderId_lbl.getText());
            parameters.put("Roll", rolls_jtf.getText());
            parameters.put("Gsm", gsm_jtf.getText());
            parameters.put("Colour", colour_jtf.getText());
            parameters.put("Supplier", supplier_jtf.getText());
            parameters.put("Mfr", mfr_jtf.getText());
            parameters.put("Rate", rate_jtf.getText());
            parameters.put("Amount", amount_jtf.getText());
            parameters.put("Remarks", remarks_jtf.getText());
            
            JasperPrint print = JasperFillManager.fillReport(is, parameters, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(print,false);
            jv.viewReport(print,false);

//            if(print != null)
//            {
//            JasperPrintManager.printReport(print, true);
//            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);   
        }
    }
    
    private boolean saveCutOrderEstimateEntry()
    {
        boolean error = false;
       
        if(validationBeforeSave() == true)
        {
            CutWorkOrderStatment cutWorkOrderEstimate = new CutWorkOrderStatment();
            
            try
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                cutWorkOrderEstimate.setWork_order_id(((JTextField)workOrder_jcb.getEditor().getEditorComponent()).getText());
                cutWorkOrderEstimate.setJob_name(jobName_lbl.getText());
                cutWorkOrderEstimate.setCustomer(customer_lbl.getText());
                cutWorkOrderEstimate.setJob_date(sdf.format(jobDate_jdc.getDate()));
                cutWorkOrderEstimate.setRolls(rolls_jtf.getText());
                cutWorkOrderEstimate.setGsm(gsm_jtf.getText());
                cutWorkOrderEstimate.setColour(colour_jtf.getText());
                cutWorkOrderEstimate.setSupplier(supplier_jtf.getText());
                cutWorkOrderEstimate.setManufacturer(mfr_jtf.getText());
                cutWorkOrderEstimate.setRate(rate_jtf.getText());
                cutWorkOrderEstimate.setAmount(amount_jtf.getText());
                cutWorkOrderEstimate.setRemarks(remarks_jtf.getText());
                cutWorkOrderEstimate.insertCutWorkOrderEstimateData(cutWorkOrderEstimate);
                error = cutWorkOrderEstimate.returnErrorStatus();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "saveCutOrderEstimatEntry() : "+e);
                error = true;
            }
            
            if(error == false)
            {
                JOptionPane.showMessageDialog(this, "Operation Successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
                saveAndPrint_jb.setEnabled(false);
                saveOnly_jb.setEnabled(false);
                newData_jb.requestFocusInWindow();
            }
            
            cutWorkOrderEstimate.setErrorStatus();
            
        }
        
        return error;
    }
    
    private void load_workOrder_jcb()
    {
        workOrder_jcb.removeAllItems();
        
        try
        {
            CutWorkOrderStatment cutWorkOrderEstimate = new CutWorkOrderStatment();
            List<String> workOrderList = cutWorkOrderEstimate.getWorkOrderIds();
            
            for (int i = 0; i < workOrderList.size(); i++)
            {
                String workOrderIds = workOrderList.get(i);
                workOrder_jcb.addItem(workOrderIds);
            }
            workOrder_jcb.setSelectedItem("");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "load_workOrder_jcb() : "+e);
        }
    }
    
    private void displayWorkOrderDetails()
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat sdf_ = new SimpleDateFormat("yyyy-MM-dd");
            
            CutWorkOrderStatment cutWorkOrderEstimate = new CutWorkOrderStatment();
            String cutWorkOrderId = ((JTextField)workOrder_jcb.getEditor().getEditorComponent()).getText();
            List<CutWorkOrderStatment> workOrderDetList = cutWorkOrderEstimate.getCutWorkOrderDetails(cutWorkOrderId);
            for (int i = 0; i < workOrderDetList.size(); i++)
            {
                String workOrderId = workOrderDetList.get(i).getWork_order_id();
                String customer = workOrderDetList.get(i).getCustomer();
                String jobName = workOrderDetList.get(i).getJob_name();
                Date jobDate = sdf.parse(sdf.format(sdf_.parse(workOrderDetList.get(i).getJob_date())));
                String roll = workOrderDetList.get(i).getRolls();
                String gsm = workOrderDetList.get(i).getGsm();
                String colour = workOrderDetList.get(i).getColour();
                String supplier = workOrderDetList.get(i).getSupplier();
                String mfr = workOrderDetList.get(i).getManufacturer();
                String rate = workOrderDetList.get(i).getRate();
                
                workOrderId_lbl.setText(workOrderId);
                customer_lbl.setText(customer);
                jobName_lbl.setText(jobName);
                jobDate_jdc.setDate(jobDate);
                rolls_jtf.setText(roll);
                gsm_jtf.setText(gsm);
                colour_jtf.setText(colour);
                supplier_jtf.setText(supplier);
                mfr_jtf.setText(mfr);
                rate_jtf.setText(rate);
                
                BigDecimal noOfRolls_bd = new BigDecimal(rolls_jtf.getText());
                BigDecimal rate_bd = new BigDecimal(rate_jtf.getText());
                BigDecimal amount_bd = noOfRolls_bd.setScale(2, RoundingMode.HALF_UP).multiply(rate_bd.setScale(2, RoundingMode.HALF_UP));
                String amount_str = (amount_bd.setScale(2, RoundingMode.HALF_UP)).toString();
                amount_jtf.setText(amount_str);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "displayWorkOrderDetails() : "+e);
        }
    }
    
    private boolean validationBeforeSave()
    {
        boolean valid = true;
        
        if(workOrderId_lbl.getText().equals("--"))
        {
            JOptionPane.showMessageDialog(this,"No details displayed.","Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if(rate_jtf.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter Rate.","Error",JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
       
        return valid;
    }
    
    private void newData()
    {
        ((JTextField)workOrder_jcb.getEditor().getEditorComponent()).setText("");
        workOrderId_lbl.setText("--");
        customer_lbl.setText("--");
        jobName_lbl.setText("--");
        jobDate_jdc.setDate(null);
        rolls_jtf.setText("");
        gsm_jtf.setText("");
        colour_jtf.setText("");
        supplier_jtf.setText("");
        mfr_jtf.setText("");
        rate_jtf.setText("");
        amount_jtf.setText("");
        remarks_jtf.setText("");
        saveAndPrint_jb.setEnabled(true);
        saveOnly_jb.setEnabled(true);
        workOrder_jcb.requestFocusInWindow();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_jtf;
    private javax.swing.JButton closeWindow_jb;
    private javax.swing.JTextField colour_jtf;
    private javax.swing.JLabel customer_lbl;
    private javax.swing.JTextField gsm_jtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jobDate_jdc;
    private javax.swing.JLabel jobName_lbl;
    private javax.swing.JTextField mfr_jtf;
    private javax.swing.JButton newData_jb;
    private javax.swing.JTextField rate_jtf;
    private javax.swing.JTextField remarks_jtf;
    private javax.swing.JTextField rolls_jtf;
    private javax.swing.JButton saveAndPrint_jb;
    private javax.swing.JButton saveOnly_jb;
    private javax.swing.JButton showWorkOrderDetails_jb;
    private javax.swing.JTextField supplier_jtf;
    private javax.swing.JLabel workOrderId_lbl;
    private javax.swing.JComboBox<String> workOrder_jcb;
    // End of variables declaration//GEN-END:variables
}
