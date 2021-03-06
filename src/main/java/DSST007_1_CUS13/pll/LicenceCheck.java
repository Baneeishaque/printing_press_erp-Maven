package DSST007_1_CUS13.pll;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.Character.isDigit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

public class LicenceCheck extends javax.swing.JFrame {

    static boolean firstlinehaserror = false;
    static boolean secondlinehaserror = false;
    static String identifier = "";
    static int trialperiod = 43200;
    public static boolean istrial = false;

    public LicenceCheck() {
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
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        useastrial_jchkbx = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        daysremaining_jl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instabiz - Enter Key");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(jTextField2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 80);
        jPanel1.add(jTextField1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Code :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 80, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(86, 132, 191));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jButton1KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Enter The Key From Manufacturer :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 80, 2, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Activate Product");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel1.add(jSeparator1, gridBagConstraints);

        useastrial_jchkbx.setBackground(new java.awt.Color(255, 255, 255));
        useastrial_jchkbx.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        useastrial_jchkbx.setText("Use As Trial");
        useastrial_jchkbx.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                useastrial_jchkbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 80, 0, 0);
        jPanel1.add(useastrial_jchkbx, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Days Remaining: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 80, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        daysremaining_jl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        daysremaining_jl.setForeground(new java.awt.Color(204, 0, 0));
        daysremaining_jl.setText("--");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 0);
        jPanel1.add(daysremaining_jl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 15, 5);
        jPanel1.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 10, 5);
        jPanel1.add(jSeparator3, gridBagConstraints);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String encryptdata(String data) {

        String rawdata = data;
        String encrypted;
        String temp;
        String result = "";

        for (int i = 0; i < rawdata.length(); i++) {

            if (rawdata.charAt(i) == '1') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#H2K#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '2') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#$98#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '3') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#K&TR#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '4') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#9KU6#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '5') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#78#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '6') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#TR4#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '7') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#90#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '8') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#UI#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '9') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#F#");
                result = result + temp;

            }
            if (rawdata.charAt(i) == '0') {

                temp = (rawdata.substring(i, i + 1)).replace(rawdata.charAt(i) + "", "#0#");
                result = result + temp;

            }
        }

        encrypted = result;
        return encrypted;
    }

    public static String decryptdata(String data) {

        String rawdata = data;
        String decrypted;

        decrypted = rawdata.replace("H2K", "1");
        decrypted = decrypted.replace("$98", "2");
        decrypted = decrypted.replace("K&TR", "3");
        decrypted = decrypted.replace("9KU6", "4");
        decrypted = decrypted.replace("78", "5");
        decrypted = decrypted.replace("TR4", "6");
        decrypted = decrypted.replace("90", "7");
        decrypted = decrypted.replace("UI", "8");
        decrypted = decrypted.replace("F", "9");
        decrypted = decrypted.replace("0", "0");

        decrypted = decrypted.replaceAll("#", "");
        return decrypted;
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/DSST007_1_CUS13/InstabizTrader Logo Final 256x253.png")));
    }//GEN-LAST:event_formWindowOpened

    private static void checkfile() {

        try {
            File f = new File(System.getProperty("user.home") + File.separator + "firstrun.txt");
            if (f.exists() && !f.isDirectory()) {

                checkvalidity();

            } else {

                generatecode();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void generatecode() {

        try {
            Random rand = new Random();
            int max = 99999999;
            int min = 10000000;

            int randomNum = rand.nextInt((max - min) + 1) + min;
            String string = Integer.toString(randomNum);
            String newStr;

            newStr = string;

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '1') {

                    newStr = newStr.replace(string.charAt(i), 'H') + "71";

                }
                if (string.charAt(i) == '2') {

                    newStr = newStr.replace(string.charAt(i), '#');

                }
                if (string.charAt(i) == '3') {

                    newStr = newStr.replace(string.charAt(i), 'K');

                }
                if (string.charAt(i) == '4') {

                    newStr = newStr.replace(string.charAt(i), 'R') + "9";

                }
                if (string.charAt(i) == '5') {

                    newStr = newStr.replace(string.charAt(i), '&');

                }
                if (string.charAt(i) == '6') {

                    newStr = newStr.replace(string.charAt(i), 'J') + "29";

                }
                if (string.charAt(i) == '7') {

                    newStr = newStr.replace(string.charAt(i), '5');

                }
                if (string.charAt(i) == '8') {

                    newStr = newStr.replace(string.charAt(i), 'W') + "73";

                }
                if (string.charAt(i) == '9') {

                    newStr = newStr.replace(string.charAt(i), 'F');

                }
                if (string.charAt(i) == '0') {

                    newStr = newStr.replace(string.charAt(i), '0') + "45";

                }

            }

            PrintWriter writer;
            writer = new PrintWriter(System.getProperty("user.home") + File.separator + "firstrun.txt", "UTF-8");
            writer.println(string);
            writer.close();

            replacesecondlineandcheck();

        } catch (FileNotFoundException | UnsupportedEncodingException e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    private static void checkRegistration() {

        Connection con = DatabaseConnection.createConnection();
        try {

            String sql = "SELECT * FROM tbl_adminreg";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                new Login().setVisible(true);
            } else {
                new Admin_Registration().setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException se) {

                System.out.println(se.getLocalizedMessage());
            }
        }

    }

    private static void checkvalidity() {

        try {

            FileInputStream fs = new FileInputStream(System.getProperty("user.home") + File.separator + "firstrun.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));

            String line1 = br.readLine();

            boolean isdigit = true;
            int line1_len = line1.length();

            if (line1_len == 8) {

                for (int i = 0; i < line1.length(); ++i) {

                    isdigit = isDigit(line1.charAt(i));

                    if (isdigit == false) {

                        break;
                    }
                }

                if (isdigit == false) {

                    replacefirstlineandcheck();

                } else {

                    replacesecondlineandcheck();

                }
            } else {
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void replacefirstlineandcheck() {

        try {

            Random rand = new Random();
            int max = 99999999;
            int min = 10000000;

            int randomNum = rand.nextInt((max - min) + 1) + min;
            String randnum = Integer.toString(randomNum);

            PrintWriter writer;
            writer = new PrintWriter(System.getProperty("user.home") + File.separator + "firstrun.txt", "UTF-8");
            writer.println(randnum);
            writer.close();

            FileInputStream fs = new FileInputStream(System.getProperty("user.home") + File.separator + "firstrun.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));

            String line1 = br.readLine();
            String line2 = br.readLine();
            String encrypted;

            encrypted = line1;

            for (int i = 0; i < line1.length(); i++) {
                if (line1.charAt(i) == '1') {

                    encrypted = encrypted.replace(line1.charAt(i), 'H') + "71";

                }
                if (line1.charAt(i) == '2') {

                    encrypted = encrypted.replace(line1.charAt(i), '#');

                }
                if (line1.charAt(i) == '3') {

                    encrypted = encrypted.replace(line1.charAt(i), 'K');

                }
                if (line1.charAt(i) == '4') {

                    encrypted = encrypted.replace(line1.charAt(i), 'R') + "9";

                }
                if (line1.charAt(i) == '5') {

                    encrypted = encrypted.replace(line1.charAt(i), '&');

                }
                if (line1.charAt(i) == '6') {

                    encrypted = encrypted.replace(line1.charAt(i), 'J') + "29";

                }
                if (line1.charAt(i) == '7') {

                    encrypted = encrypted.replace(line1.charAt(i), '5');

                }
                if (line1.charAt(i) == '8') {

                    encrypted = encrypted.replace(line1.charAt(i), 'W') + "73";

                }
                if (line1.charAt(i) == '9') {

                    encrypted = encrypted.replace(line1.charAt(i), 'F');

                }
                if (line1.charAt(i) == '0') {

                    encrypted = encrypted.replace(line1.charAt(i), '0') + "45";

                }
            }

            if (encrypted.equals(line2)) {

                checkRegistration();

            } else {

                firstlinehaserror = true;

                new LicenceCheck().setVisible(true);
                jTextField2.setText(line1);

            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void replacesecondlineandcheck() {

        try {

            FileInputStream fs = new FileInputStream(System.getProperty("user.home") + File.separator + "firstrun.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));

            String line1 = br.readLine();
            String line2 = br.readLine();
            String encrypted;

            encrypted = line1;

            for (int i = 0; i < line1.length(); i++) {
                if (line1.charAt(i) == '1') {

                    encrypted = encrypted.replace(line1.charAt(i), 'H') + "71";

                }
                if (line1.charAt(i) == '2') {

                    encrypted = encrypted.replace(line1.charAt(i), '#');

                }
                if (line1.charAt(i) == '3') {

                    encrypted = encrypted.replace(line1.charAt(i), 'K');

                }
                if (line1.charAt(i) == '4') {

                    encrypted = encrypted.replace(line1.charAt(i), 'R') + "9";

                }
                if (line1.charAt(i) == '5') {

                    encrypted = encrypted.replace(line1.charAt(i), '&');

                }
                if (line1.charAt(i) == '6') {

                    encrypted = encrypted.replace(line1.charAt(i), 'J') + "29";

                }
                if (line1.charAt(i) == '7') {

                    encrypted = encrypted.replace(line1.charAt(i), '5');

                }
                if (line1.charAt(i) == '8') {

                    encrypted = encrypted.replace(line1.charAt(i), 'W') + "73";

                }
                if (line1.charAt(i) == '9') {

                    encrypted = encrypted.replace(line1.charAt(i), 'F');

                }
                if (line1.charAt(i) == '0') {

                    encrypted = encrypted.replace(line1.charAt(i), '0') + "45";

                }
            }

            if (encrypted.equals(line2)) {

                checkRegistration();

            } else {

                secondlinehaserror = true;

                new LicenceCheck().setVisible(true);
                jTextField2.setText(line1);

            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        activate();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void getremainingtrialdays() {

        Connection con = DatabaseConnection.createConnection();

        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT * FROM trialcheck ");
            if (rs.first() == false) {

                JOptionPane.showMessageDialog(this, "Cannot Proceed. Someone Tampered With The Database!!", "Error", JOptionPane.ERROR_MESSAGE);

            } else {

                if (!rs.getString("checkstring").equals("#check#")) {

                    JOptionPane.showMessageDialog(this, "Incorrect String Value. Someone Tampered With The Database!!", "Error", JOptionPane.ERROR_MESSAGE);

                } else {

                    Statement stmt1 = con.createStatement();
                    ResultSet rs1 = stmt1.executeQuery(" SELECT value FROM trialcheck ");
                    if (rs1.first()) {

                        int newtimevalue = Integer.parseInt(decryptdata(rs1.getString("value")));
                        int day = (newtimevalue / (24 * 60)) + 1;
                        int trialperiod_to_days = (trialperiod / (24 * 60)) + 1;
                        int remaining_days = trialperiod_to_days - day;
                        daysremaining_jl.setText(Integer.toString(remaining_days));
                    }

                }

            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }

    private void activate() {

        if (useastrial_jchkbx.isSelected() == true) {
            Connection con = DatabaseConnection.createConnection();

            try {

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(" SELECT * FROM trialcheck ");
                if (rs.first() == false) {

                    JOptionPane.showMessageDialog(this, "Cannot Proceed. Someone Tampered With The Database!!", "Error", JOptionPane.ERROR_MESSAGE);

                } else {

                    if (!rs.getString("checkstring").equals("#check#")) {

                        JOptionPane.showMessageDialog(this, "Incorrect String Value. Someone Tampered With The Database!!", "Error", JOptionPane.ERROR_MESSAGE);

                    } else {

                        Statement stmt1 = con.createStatement();
                        ResultSet rs1 = stmt1.executeQuery(" SELECT value FROM trialcheck ");
                        if (rs1.first()) {

                            int newtimevalue = Integer.parseInt(decryptdata(rs1.getString("value")));

                            if (newtimevalue >= trialperiod) {

                                JOptionPane.showMessageDialog(this, "Cannot Proceed. Trial Period Over.", "Error", JOptionPane.ERROR_MESSAGE);

                            } else {

                                this.dispose();
                                checkRegistration();

                            }
                        }
                    }
                }

            } catch (HeadlessException | NumberFormatException | SQLException e) {

                JOptionPane.showMessageDialog(null, e);

            } finally {

                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
            }

        } else {
            if (secondlinehaserror == true || firstlinehaserror == true) {

                try {

                    FileInputStream fs = new FileInputStream(System.getProperty("user.home") + File.separator + "firstrun.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(fs));

                    String line1 = br.readLine();
                    String encrypted;

                    encrypted = line1;

                    for (int i = 0; i < line1.length(); i++) {
                        if (line1.charAt(i) == '1') {

                            encrypted = encrypted.replace(line1.charAt(i), 'H') + "71";

                        }
                        if (line1.charAt(i) == '2') {

                            encrypted = encrypted.replace(line1.charAt(i), '#');

                        }
                        if (line1.charAt(i) == '3') {

                            encrypted = encrypted.replace(line1.charAt(i), 'K');

                        }
                        if (line1.charAt(i) == '4') {

                            encrypted = encrypted.replace(line1.charAt(i), 'R') + "9";

                        }
                        if (line1.charAt(i) == '5') {

                            encrypted = encrypted.replace(line1.charAt(i), '&');

                        }
                        if (line1.charAt(i) == '6') {

                            encrypted = encrypted.replace(line1.charAt(i), 'J') + "29";

                        }
                        if (line1.charAt(i) == '7') {

                            encrypted = encrypted.replace(line1.charAt(i), '5');

                        }
                        if (line1.charAt(i) == '8') {

                            encrypted = encrypted.replace(line1.charAt(i), 'W') + "73";

                        }
                        if (line1.charAt(i) == '9') {

                            encrypted = encrypted.replace(line1.charAt(i), 'F');

                        }
                        if (line1.charAt(i) == '0') {

                            encrypted = encrypted.replace(line1.charAt(i), '0') + "45";

                        }
                    }

                    String inputkey = jTextField1.getText();

                    if (inputkey.equals(encrypted)) {

                        JOptionPane.showMessageDialog(null, "Key Accepted");

                        PrintWriter writer;
                        writer = new PrintWriter(System.getProperty("user.home") + File.separator + "firstrun.txt", "UTF-8");
                        writer.println(line1);
                        writer.println(encrypted);

                        writer.close();
                        this.dispose();

                        checkRegistration();

                    } else {

                        JOptionPane.showMessageDialog(this, "Invalid Key. Please Try Again.", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (HeadlessException | IOException e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }


    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            activate();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void useastrial_jchkbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useastrial_jchkbxActionPerformed

        if (useastrial_jchkbx.isSelected() == true) {

            getremainingtrialdays();
            istrial = true;

        } else {

            daysremaining_jl.setText("---");
        }

    }//GEN-LAST:event_useastrial_jchkbxActionPerformed

    private static boolean checktableexists() {

        boolean exist = false;

        try {

            Connection con = DatabaseConnection.createConnection();
            DatabaseMetaData dbm = con.getMetaData();
            // check if "employee" table is there
            ResultSet tables = dbm.getTables(null, null, "employee", null);
            exist = tables.first() == true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        }

        return exist;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.put("MenuItem.background", new Color(242,242,255));
                    //javax.swing.UIManager.put("MenuItem.background",Color.WHITE);
                    //javax.swing.UIManager.put("MenuItem.opaque", true);
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LicenceCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new LicenceCheck().setVisible(true);
                LicenceCheck lc = null;

                try {
                    Connection con = DatabaseConnection.createConnection();

                    if (con == null) {
                        JOptionPane.showMessageDialog(lc, "Application Cannot Start. Database Not Found.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {

                        if (checktableexists() == false) {
                            String OSName = System.getProperty("os.name");
                            if (OSName.contains("Wind")) {
                                checkfile();
                            } else {
                                checkfile();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Required database tables not found. Application exiting.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel daysremaining_jl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox useastrial_jchkbx;
    // End of variables declaration//GEN-END:variables
}

class WindowsReqistry {

    /**
     *
     * @param location path in the registry
     * @param key registry key
     * @return registry value or null if not found
     */
    public static final String readRegistry(String location, String key) {
        try {
            // Run reg query, then read output with StreamReader (internal class)
            Process process = Runtime.getRuntime().exec("reg query "
                    + '"' + location + "\" /v " + key);

            StreamReader reader = new StreamReader(process.getInputStream());
            reader.start();
            process.waitFor();
            reader.join();

            // Parse out the value
            String[] parsed = reader.getResult().split("\\s+");
            if (parsed.length > 1) {
                return parsed[parsed.length - 1];
            }
        } catch (IOException | InterruptedException e) {
        }

        return null;
    }

    static class StreamReader extends Thread {

        private final InputStream is;
        private final StringWriter sw = new StringWriter();

        public StreamReader(InputStream is) {
            this.is = is;
        }

        @Override
        public void run() {
            try {
                int c;
                while ((c = is.read()) != -1) {
                    sw.write(c);
                }
            } catch (IOException e) {
            }
        }

        public String getResult() {
            return sw.toString();
        }
    }
}
