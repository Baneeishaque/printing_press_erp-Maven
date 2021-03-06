package DSST007_1_CUS13.pll;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen
 */
public class Customers_Report extends javax.swing.JInternalFrame {

    private static Customers_Report myInstance;
    
    public Customers_Report() {
        initComponents();
 
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        totalcount_jtf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchresults_jt = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        fromdate_jdc = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        todate_jdc = new com.toedter.calendar.JDateChooser();
        search_jb = new javax.swing.JButton();
        writetoexcel_jb = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Reports - > Customers");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/DSST007_1_CUS13/InstabizTrader Logo Final 35x35.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
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

        jPanel3.setBackground(new java.awt.Color(242, 242, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setText("Total Count :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel2, gridBagConstraints);

        totalcount_jtf.setEditable(false);
        totalcount_jtf.setBackground(new java.awt.Color(255, 255, 153));
        totalcount_jtf.setPreferredSize(new java.awt.Dimension(130, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        jPanel3.add(totalcount_jtf, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 5);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(242, 242, 255));
        jPanel4.setFocusable(false);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(773, 385));
        jScrollPane2.setRequestFocusEnabled(false);

        searchresults_jt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchresults_jt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        searchresults_jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "SNo", "Customer Name", "Customer ID", "Reg Date", "Location"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        searchresults_jt.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        searchresults_jt.setFillsViewportHeight(true);
        searchresults_jt.setRowHeight(23);
        searchresults_jt.setSelectionBackground(new java.awt.Color(86, 132, 191));
        jScrollPane2.setViewportView(searchresults_jt);
        if (searchresults_jt.getColumnModel().getColumnCount() > 0)
        {
            searchresults_jt.getColumnModel().getColumn(0).setMinWidth(50);
            searchresults_jt.getColumnModel().getColumn(0).setPreferredWidth(50);
            searchresults_jt.getColumnModel().getColumn(1).setMinWidth(200);
            searchresults_jt.getColumnModel().getColumn(1).setPreferredWidth(200);
            searchresults_jt.getColumnModel().getColumn(2).setMinWidth(200);
            searchresults_jt.getColumnModel().getColumn(2).setPreferredWidth(200);
            searchresults_jt.getColumnModel().getColumn(3).setMinWidth(100);
            searchresults_jt.getColumnModel().getColumn(3).setPreferredWidth(100);
            searchresults_jt.getColumnModel().getColumn(4).setMinWidth(200);
            searchresults_jt.getColumnModel().getColumn(4).setPreferredWidth(200);
        }
        searchresults_jt.getAccessibleContext().setAccessibleName("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        jPanel4.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(242, 242, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setNextFocusableComponent(fromdate_jdc);
        jPanel5.setLayout(new java.awt.GridBagLayout());

        fromdate_jdc.setBackground(new java.awt.Color(242, 242, 255));
        fromdate_jdc.setDateFormatString("d-MMM-yyyy");
        fromdate_jdc.setPreferredSize(new java.awt.Dimension(140, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 2, 0);
        jPanel5.add(fromdate_jdc, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("From :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 0);
        jPanel5.add(jLabel9, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("To :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 0);
        jPanel5.add(jLabel1, gridBagConstraints);

        todate_jdc.setBackground(new java.awt.Color(242, 242, 255));
        todate_jdc.setDateFormatString("d-MMM-yyyy");
        todate_jdc.setPreferredSize(new java.awt.Dimension(140, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 2, 0);
        jPanel5.add(todate_jdc, gridBagConstraints);

        search_jb.setBackground(new java.awt.Color(185, 197, 31));
        search_jb.setText("Search");
        search_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        search_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                search_jbMousePressed(evt);
            }
        });
        search_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                search_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 2, 0);
        jPanel5.add(search_jb, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel5, gridBagConstraints);

        writetoexcel_jb.setBackground(new java.awt.Color(86, 132, 191));
        writetoexcel_jb.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        writetoexcel_jb.setText("Write to Excel");
        writetoexcel_jb.setPreferredSize(new java.awt.Dimension(125, 20));
        writetoexcel_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                writetoexcel_jbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                writetoexcel_jbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                writetoexcel_jbMousePressed(evt);
            }
        });
        writetoexcel_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                writetoexcel_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 2, 0);
        jPanel1.add(writetoexcel_jb, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(242, 242, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton3.setBackground(new java.awt.Color(86, 132, 191));
        jButton3.setMnemonic('s');
        jButton3.setText("Close");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton3KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 15, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Reports > Customers");

        setBounds(0, 0, 775, 547);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        
        this.setLocation(218,2);
        
        //--------------------------------------------------------------
                  
        ((JTextField)fromdate_jdc.getDateEditor().getUiComponent()).setEditable(false);

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(12);
        
        getfirstDate();

        todate_jdc.setDate(new Date());
        
    }//GEN-LAST:event_formInternalFrameOpened

    public static Customers_Report getInstance() // Method
    {
        if (myInstance == null)
	{
            myInstance = new Customers_Report();
	}
        return myInstance;
    }
    
    private void getfirstDate()
    {
        
        Connection con = DatabaseConnection.createConnection();
           
        try
        {
             
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault());

            Date stockdateval;
             
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer_registration");
            
            if(rs.first())
            {
                 
                Date regdate = sdf2.parse(sdf2.format(sdf1.parse(rs.getString("regdate"))));
                //stockdateval = sdf.parse(stockdate);
                fromdate_jdc.setDate(regdate);

            }    
             
        }
        catch(Exception e)
        {
             
            JOptionPane.showMessageDialog(null, e);
             
        }
        finally
                {
                    
                    if(con!=null)
                    {
                        try {
                            con.close();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                        
                    }
                    
                }
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        
       myInstance = null;
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void writeToExcel()
    {
        
        try
        {
        
            if(searchresults_jt.getRowCount()==0)
            {

                JOptionPane.showMessageDialog(this,"There are no table data to export.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else
            {

                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy",Locale.getDefault());
                
                String filename = "Customers_Report-From_" + sdf1.format(fromdate_jdc.getDate()) + "_To_" + sdf1.format(todate_jdc.getDate());
                
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setSelectedFile(new File(filename+".xls"));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Microsoft Excel", ".xls");
                fileChooser.addChoosableFileFilter(filter);
//                fileChooser.setAcceptAllFileFilterUsed(false);
               
                FileWriter fw = null;

                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                //System.out.println(new File(System.getProperty("user.dir")));
                
                int result = fileChooser.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) 
                {
                    File path = fileChooser.getSelectedFile();
                    
                    if(path!=null)
                    {

                        fw = new FileWriter(path);
                        
                        fw.write("\n");

                        TableModel tm = searchresults_jt.getModel();

                        for (int i = 0; i < tm.getColumnCount(); i++) {
                            
                           // if(i!=9)
                           // {
                                fw.write(tm.getColumnName(i) + "\t");
                               
                           // }    
                        }

                        fw.write("\n");

                        for (int i = 0; i < tm.getRowCount(); i++) {
                            for (int j = 0; j < tm.getColumnCount(); j++) {   
                                //if(j!=9)
                               // {
                                    
                                    String cellValue;
                                    
                                    if(tm.getValueAt(i, j)!=null)
                                    {
                                     
                                        cellValue = tm.getValueAt(i, j).toString();
                                        
                                    }
                                    else
                                    {
                                        
                                        cellValue = "";
                                        
                                    }

                                    fw.write(cellValue + "\t");
                                    
                               // }
                            }
                            fw.write("\n");
                        }
                    }
        
                   fw.close();
                }
            }
            
        }
        catch(Exception e)
        {
            
             JOptionPane.showMessageDialog(null,e);
            
        }
        
    }
    
    private void searchResults()
    {
        
        Connection con = DatabaseConnection.createConnection();

        try
        {

            if(((JTextField)fromdate_jdc.getDateEditor().getUiComponent()).getText().equals(""))
            {

                JOptionPane.showMessageDialog(this,"Please specify From Date.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else if(((JTextField)todate_jdc.getDateEditor().getUiComponent()).getText().equals(""))
            {

                JOptionPane.showMessageDialog(this,"Please specify To Date.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else if(todate_jdc.getDate().compareTo(fromdate_jdc.getDate())==-1)
            {

                JOptionPane.showMessageDialog(this,"'From Date' should be lower than 'To Date'.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else
            {

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy",Locale.getDefault());
                DefaultTableModel jTableModel1 = (DefaultTableModel)searchresults_jt.getModel();

                jTableModel1.setRowCount(0);

                String fromdate = sdf1.format(fromdate_jdc.getDate());
                String todate = sdf1.format(todate_jdc.getDate());
                
                int nextqnty = 0;
                BigDecimal nextreturnedqnty = new BigDecimal("0");

                String[] strarr = null;

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM customer_registration WHERE regdate BETWEEN '"+fromdate+"' AND '"+todate+"'  ");

                while(rs.next())
                {

                    String cusname = rs.getString("name");
                    String cusid = rs.getString("customerid");
                    String regdate = sdf2.format(sdf1.parse(rs.getString("regdate")));
                    String city = rs.getString("city");
                    

                    int rowcnt = searchresults_jt.getRowCount();

                    strarr = new String[]{Integer.toString(rowcnt+1),cusname,cusid,regdate,city};
                    jTableModel1.addRow(strarr);

                    String itemcount = Integer.toString(rowcnt+1);
                    totalcount_jtf.setText(itemcount);


                }

            }

        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null,e);

        }
        finally
        {

            if(con!=null)
            {
                try {
                    con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            }

        }
        
    }
    
    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_jButton3KeyPressed

    private void writetoexcel_jbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_writetoexcel_jbKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
           writeToExcel();
            
        }
        
    }//GEN-LAST:event_writetoexcel_jbKeyPressed

    private void writetoexcel_jbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writetoexcel_jbMousePressed
        // TODO add your handling code here:
        
        writeToExcel();
        
    }//GEN-LAST:event_writetoexcel_jbMousePressed

    private void search_jbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_jbKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            searchResults();
            
        }
        
    }//GEN-LAST:event_search_jbKeyPressed

    private void search_jbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_jbMousePressed
        // TODO add your handling code here:
        
        searchResults();
        
    }//GEN-LAST:event_search_jbMousePressed

    private void writetoexcel_jbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writetoexcel_jbMouseEntered
        // TODO add your handling code here:
        
        writetoexcel_jb.setForeground(Color.RED);
        
    }//GEN-LAST:event_writetoexcel_jbMouseEntered

    private void writetoexcel_jbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writetoexcel_jbMouseExited
        // TODO add your handling code here:
        
        writetoexcel_jb.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_writetoexcel_jbMouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromdate_jdc;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton search_jb;
    public static javax.swing.JTable searchresults_jt;
    private com.toedter.calendar.JDateChooser todate_jdc;
    private javax.swing.JTextField totalcount_jtf;
    private javax.swing.JButton writetoexcel_jb;
    // End of variables declaration//GEN-END:variables
}

