package DSST007_1_CUS13.pll;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author praveen
 */
public class Login extends javax.swing.JFrame {

    public static Login login = new Login();

    ;
    
    public Login() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instabiz Trader - Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setPreferredSize(new java.awt.Dimension(275, 79));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        txt_user.setPreferredSize(new java.awt.Dimension(200, 27));
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(txt_user, gridBagConstraints);

        txt_pass.setPreferredSize(new java.awt.Dimension(200, 27));
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(txt_pass, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 6, 255));
        jLabel4.setText("Recover Password");
        jLabel4.setFocusCycleRoot(true);
        jLabel4.setFocusTraversalPolicyProvider(true);
        jLabel4.setNextFocusableComponent(txt_user);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Username :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Password :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(24, 0, 4, 2);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btn_login.setBackground(new java.awt.Color(23, 23, 23));
        btn_login.setForeground(new java.awt.Color(254, 254, 254));
        btn_login.setText("Login");
        btn_login.setPreferredSize(new java.awt.Dimension(100, 29));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 16, 0);
        jPanel4.add(btn_login, gridBagConstraints);

        btn_clear.setBackground(new java.awt.Color(23, 23, 23));
        btn_clear.setForeground(new java.awt.Color(254, 254, 254));
        btn_clear.setText("Clear");
        btn_clear.setPreferredSize(new java.awt.Dimension(100, 29));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clearMousePressed(evt);
            }
        });
        btn_clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_clearKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 16, 0);
        jPanel4.add(btn_clear, gridBagConstraints);

        btn_close.setBackground(new java.awt.Color(23, 23, 23));
        btn_close.setForeground(new java.awt.Color(254, 254, 254));
        btn_close.setMnemonic('s');
        btn_close.setText("Close");
        btn_close.setPreferredSize(new java.awt.Dimension(100, 29));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        btn_close.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_closeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_closeKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 16, 5);
        jPanel4.add(btn_close, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel1.add(jPanel4, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DSST007_1_CUS13/InstabizTrader Logo Final 100x100.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(9, 5, 4, 0);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jSeparator1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btn_closeActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        RecoverAdminPassword rapForm = RecoverAdminPassword.getInstance();
        rapForm.setVisible(true);

        jLabel4.setForeground(Color.red);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String str_user = txt_user.getText();
            String str_pass = txt_pass.getText();
            Connection con = DatabaseConnection.createConnection();
            try {

                String sql = "SELECT * from tbl_adminreg where uname='" + str_user + "' and password='" + str_pass + "' ";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                if (str_user.equals("") || str_pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the fields");
                } else if (rs.next()) {
                    this.setVisible(false);
                    NewMDIApplication mdi = new NewMDIApplication();
                    mdi.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    Login log = new Login();
                    txt_user.setText("");
                    txt_pass.setText("");
                    txt_user.requestFocus();

                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            }
        }

//        if(evt.getKeyChar()==KeyEvent.VK_TAB)
//        {
//        btn_login.requestFocus();
//        }
    }//GEN-LAST:event_txt_passKeyPressed

    private void txt_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyPressed
//        if(evt.getKeyChar()==KeyEvent.VK_TAB)
//        {
//            txt_pass.requestFocus();
//          
//        }
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txt_pass.requestFocus();

        }
    }//GEN-LAST:event_txt_userKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("src/DSST007_1_CUS13/InstabizTrader Logo Final 256x253.png")));

    }//GEN-LAST:event_formWindowOpened

    private void btn_closeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_closeKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }

    }//GEN-LAST:event_btn_closeKeyPressed

    private void btn_clearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_clearKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

            txt_user.setText("");
            txt_pass.setText("");

        }

    }//GEN-LAST:event_btn_clearKeyPressed

    private void btn_closeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_closeKeyTyped
//  if(evt.getKeyChar()==KeyEvent.VK_TAB)
//        {  
// jLabel4.setForeground(Color.red);
// jLabel4.setFocusable(true);
// jLabel4.requestFocus();
//        }
    }//GEN-LAST:event_btn_closeKeyTyped

    private void btn_clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMousePressed
        // TODO add your handling code here:

        txt_user.setText("");
        txt_pass.setText("");

    }//GEN-LAST:event_btn_clearMousePressed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:

        logIn();

    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            logIn();

        }

    }//GEN-LAST:event_btn_loginKeyPressed

    private void logIn() {

        String str_user = txt_user.getText();
        String str_pass = txt_pass.getText();
        Connection con = DatabaseConnection.createConnection();
        try {

            String sql = "SELECT * FROM tbl_adminreg WHERE BINARY uname='" + str_user + "' and BINARY password='" + str_pass + "' ";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (str_user.equals("") || str_pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the fields");
            } else if (rs.next()) {
                this.setVisible(false);
                NewMDIApplication mdi = new NewMDIApplication();
                mdi.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                Login log = new Login();
                txt_user.setText("");
                txt_pass.setText("");
                txt_user.requestFocus();

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new Login().setVisible(true);

//                login = new Login();
//                login.setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
