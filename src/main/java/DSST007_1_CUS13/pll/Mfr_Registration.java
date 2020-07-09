package DSST007_1_CUS13.pll;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praveen
 */
public class Mfr_Registration extends javax.swing.JInternalFrame {

    private static Mfr_Registration mfr_Registration_Instance;
    
    public Mfr_Registration() {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        state_jcb = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pincode_jtf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        country_jcb = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        city_jtf = new javax.swing.JTextField();
        address1_jtf = new javax.swing.JTextField();
        address2_jtf = new javax.swing.JTextField();
        district_jtf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone1_jtf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phone2_jtf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        fax_jtf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        email_jtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        website_jtf = new javax.swing.JTextField();
        regdate_jdc = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        mfrname_jcb = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        save_jb = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        setClosable(true);
        setTitle("Create - > Manufacturer");
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

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Manufacturer :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 2, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(242, 242, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Address Line 2 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 2);
        jPanel3.add(jLabel9, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("District :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel11, gridBagConstraints);

        state_jcb.setEditable(true);
        state_jcb.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(state_jcb, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Address Line 1 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 2);
        jPanel3.add(jLabel8, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("City :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel10, gridBagConstraints);

        pincode_jtf.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(pincode_jtf, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("State :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel12, gridBagConstraints);

        country_jcb.setEditable(true);
        country_jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas, The", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei ", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Curacao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (see Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia, The", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway", "Oman", "Pakistan", "Palau", "Palestinian Territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa ", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain ", "Sri Lanka", "Sudan", "Suriname", "Swaziland ", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand ", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        country_jcb.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(country_jcb, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Country :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel13, gridBagConstraints);

        city_jtf.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(city_jtf, gridBagConstraints);

        address1_jtf.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(address1_jtf, gridBagConstraints);

        address2_jtf.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(address2_jtf, gridBagConstraints);

        district_jtf.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(district_jtf, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Pincode :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel14, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Phone 1 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel7, gridBagConstraints);

        phone1_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(phone1_jtf, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Phone 2 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel15, gridBagConstraints);

        phone2_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(phone2_jtf, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("FAX :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel16, gridBagConstraints);

        fax_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(fax_jtf, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("E-Mail :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel17, gridBagConstraints);

        email_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(email_jtf, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Website :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel1, gridBagConstraints);

        website_jtf.setPreferredSize(new java.awt.Dimension(200, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(website_jtf, gridBagConstraints);

        regdate_jdc.setBackground(new java.awt.Color(242, 242, 255));
        regdate_jdc.setDateFormatString("d-MMM-yyyy");
        regdate_jdc.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel3.add(regdate_jdc, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Reg Date :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel3.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(jPanel3, gridBagConstraints);

        mfrname_jcb.setEditable(true);
        mfrname_jcb.setMaximumRowCount(10);
        mfrname_jcb.setPreferredSize(new java.awt.Dimension(300, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 2, 5);
        jPanel1.add(mfrname_jcb, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(242, 242, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        save_jb.setBackground(new java.awt.Color(185, 197, 31));
        save_jb.setText("Save");
        save_jb.setPreferredSize(new java.awt.Dimension(100, 27));
        save_jb.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                save_jbMousePressed(evt);
            }
        });
        save_jb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                save_jbKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 15, 0);
        jPanel2.add(save_jb, gridBagConstraints);

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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 15, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setBounds(0, 0, 389, 452);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
 
    Dimension desktopSize = NewMDIApplication.desktopbg_jlbl.getSize();
    Dimension jInternalFrameSize = this.getSize();
    this.setLocation((desktopSize.width - jInternalFrameSize.width)/2,(desktopSize.height- jInternalFrameSize.height)/2);
   
    getMfrNames();
    AutoCompleteDecorator.decorate(mfrname_jcb);

    Date date = new Date();
    regdate_jdc.setDate(date);
    
    //getCountries();
    AutoCompleteDecorator.decorate(country_jcb);
    country_jcb.setSelectedItem("");
    
    getStates();
    AutoCompleteDecorator.decorate(state_jcb);
        
    }//GEN-LAST:event_formInternalFrameOpened

    public static Mfr_Registration getInstance() // Method
    {
        if (mfr_Registration_Instance == null)
	{
            mfr_Registration_Instance = new Mfr_Registration();
	}
        return mfr_Registration_Instance;
    }
    
    
    public static void getStates()
    {
 
        state_jcb.removeAllItems();
        Connection con = DatabaseConnection.createConnection();
         
        try
        {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT DISTINCT state FROM mfr_registration ");
            
            while(rs.next())
            {

                if(rs.getString("state") != null && !rs.getString("state").equals(""))
                {

                    String state = rs.getString("state");
                    state_jcb.addItem(state);

                }
  
            }  
            
            state_jcb.addItem("");
            state_jcb.setSelectedItem("");
             
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
    
    private void clearAll()
    {
        
        address1_jtf.setText("");
        address2_jtf.setText("");
        city_jtf.setText("");
        district_jtf.setText("");
        state_jcb.setSelectedItem("");
        country_jcb.setSelectedItem("");
        pincode_jtf.setText("");
        phone1_jtf.setText("");
        phone2_jtf.setText("");
        fax_jtf.setText("");
        email_jtf.setText("");
        regdate_jdc.setDate(new Date());
        website_jtf.setText("");
        
    }
    
    public static void getMfrNames()
    {

        mfrname_jcb.removeAllItems();
        Connection con = DatabaseConnection.createConnection();

        try
        {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT DISTINCT mfrname FROM mfr_registration ");
            
            while(rs.next())
            {
                 
                String mfrname = rs.getString("mfrname");
            
                mfrname_jcb.addItem(mfrname);
                  
            }    
             
            mfrname_jcb.addItem("");
            mfrname_jcb.setSelectedItem("");
            
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
    
    private void saveData()
    {
     
        boolean error = false;
        boolean status = false;
        
        Connection con = DatabaseConnection.createConnection();
        
        try
        {

            if(mfrname_jcb.getSelectedItem()==null)
            {

                JOptionPane.showMessageDialog(this,"Please enter Name.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else if(mfrname_jcb.getSelectedItem().toString().equals(""))
            {
                
                JOptionPane.showMessageDialog(this,"Please enter Manufacturer Name.","Error",JOptionPane.ERROR_MESSAGE);
                
            }
            else if(mfrname_jcb.getSelectedIndex()!=-1)
            {
                
                JOptionPane.showMessageDialog(this,"Duplicate entry:'"+mfrname_jcb.getSelectedItem().toString()+"' ","Error",JOptionPane.ERROR_MESSAGE);
                
            }
//            else if(address1_jtf.getText().equals(""))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please enter Address Line 1.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(city_jtf.getText().equals(""))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please enter City.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(district_jtf.getText().equals(""))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please enter District.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(state_jcb.getSelectedItem().equals("-Select-"))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please select State.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(pincode_jtf.getText().equals(""))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please enter Pincode.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(age_jtf.getText().equals(""))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please enter Age.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(bloodgrp_jcb.getSelectedItem().equals("-Select-"))
//            {
//
//                JOptionPane.showMessageDialog(this,"Please select Blood Group.","Error",JOptionPane.ERROR_MESSAGE);
//
//            }
            else if(((JTextField)regdate_jdc.getDateEditor().getUiComponent()).getText().equals(""))
            {

                 JOptionPane.showMessageDialog(this,"Please specify the Registration Date.","Error",JOptionPane.ERROR_MESSAGE);

            }
            else
            {

               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());

               String name = mfrname_jcb.getSelectedItem().toString();
               String address1 = address1_jtf.getText();
               String address2 = address2_jtf.getText();
               String city = city_jtf.getText();
               String district = district_jtf.getText();
               String state = state_jcb.getSelectedItem().toString();
               String country = country_jcb.getSelectedItem().toString();
               String pincode = pincode_jtf.getText();
               String regdate = sdf.format(regdate_jdc.getDate());
               String phone1 = phone1_jtf.getText();
               String phone2 = phone2_jtf.getText();
               String fax = fax_jtf.getText();
               String email = email_jtf.getText();
               String website = website_jtf.getText();

               String sql="INSERT into mfr_registration(mfrname,address1,address2,city,district,state,country,pincode,phone1,phone2,fax,email,website,regdate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               stmt.setString(1,name);
               stmt.setString(2,address1);
               stmt.setString(3,address2);
               stmt.setString(4,city);
               stmt.setString(5,district);
               stmt.setString(6,state);
               stmt.setString(7,country);
               stmt.setString(8,pincode);
               stmt.setString(9,phone1);
               stmt.setString(10,phone2);
               stmt.setString(11,fax);
               stmt.setString(12,email);
               stmt.setString(13,website);
               stmt.setString(14,regdate);
               
               stmt.executeUpdate();
               
               getMfrNames();
               
               status = true;

            }
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(null, e);
             error = true;

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
        if(error==false && status==true)
        {

            JOptionPane.showMessageDialog(this,"Operation Successful.","Success",JOptionPane.INFORMATION_MESSAGE);

            clearAll();

            if(Mfr_Registration_Edit.name_jcb != null)
            {

               Mfr_Registration_Edit.getMfrNames();
               Mfr_Registration_Edit.getStates();

            }
 
        }
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:

        mfr_Registration_Instance = null;

    }//GEN-LAST:event_formInternalFrameClosed

    private void save_jbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_save_jbKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            saveData();

        }
        
    }//GEN-LAST:event_save_jbKeyPressed

    private void save_jbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_jbMousePressed
        // TODO add your handling code here:
        
        saveData();

        
    }//GEN-LAST:event_save_jbMousePressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            this.dispose();
            
        }
        
    }//GEN-LAST:event_jButton3KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1_jtf;
    private javax.swing.JTextField address2_jtf;
    private javax.swing.JTextField city_jtf;
    public static javax.swing.JComboBox country_jcb;
    private javax.swing.JTextField district_jtf;
    private javax.swing.JTextField email_jtf;
    private javax.swing.JTextField fax_jtf;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JComboBox mfrname_jcb;
    private javax.swing.JTextField phone1_jtf;
    private javax.swing.JTextField phone2_jtf;
    private javax.swing.JTextField pincode_jtf;
    private com.toedter.calendar.JDateChooser regdate_jdc;
    private javax.swing.JButton save_jb;
    public static javax.swing.JComboBox state_jcb;
    private javax.swing.JTextField website_jtf;
    // End of variables declaration//GEN-END:variables
}
