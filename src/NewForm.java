
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class NewForm extends javax.swing.JFrame {

    /**
     * Creates new form NewForm
     */
    java.util.Date date;
    java.sql.Date sqldate;
    Connection conn=null;
    PreparedStatement st=null;
     ResultSet rs=null;
    public NewForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dphone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DAddress = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        Bgroup = new javax.swing.JComboBox<>();
        DName = new javax.swing.JTextField();
        Gender = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        Bgroup1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        totalRec = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        searchbutton1 = new javax.swing.JButton();
        Bgroup2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DName1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Bgroup3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DAddress1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        male1 = new javax.swing.JRadioButton();
        female1 = new javax.swing.JRadioButton();
        Gender1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Dphone1 = new javax.swing.JTextField();
        add1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchtable1 = new javax.swing.JTable();
        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood Donar Records");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Blood Donation Records");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 440, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shield-cross.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 70, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shield-cross.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, 50));

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Donar Entry");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 400, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Phone");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, 30));

        Dphone.setBackground(new java.awt.Color(102, 102, 102));
        Dphone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Dphone.setForeground(new java.awt.Color(255, 255, 255));
        Dphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dphone.setDoubleBuffered(true);
        Dphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DphoneKeyTyped(evt);
            }
        });
        jPanel2.add(Dphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 210, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Birth Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 160, 30));

        male.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        male.setForeground(java.awt.Color.white);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        female.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        female.setForeground(java.awt.Color.white);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 90, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DAddress.setBackground(new java.awt.Color(102, 102, 102));
        DAddress.setColumns(20);
        DAddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DAddress.setForeground(new java.awt.Color(255, 255, 255));
        DAddress.setLineWrap(true);
        DAddress.setRows(5);
        DAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(DAddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 90));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Blood Group");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 160, 30));

        Bgroup.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        Bgroup.setToolTipText("AB+");
        Bgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgroupActionPerformed(evt);
            }
        });
        jPanel2.add(Bgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 64, 220, 30));

        DName.setBackground(new java.awt.Color(102, 102, 102));
        DName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DName.setForeground(new java.awt.Color(255, 255, 255));
        DName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DName.setDoubleBuffered(true);
        jPanel2.add(DName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 30));

        Gender.setEditable(false);
        Gender.setBackground(new java.awt.Color(102, 102, 102));
        Gender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        jPanel2.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 30));

        add.setBackground(new java.awt.Color(0, 102, 102));
        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        add.setText("Add Donor");
        add.setBorder(null);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 180, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 280, 10));

        Date.setDateFormatString("yyyy-MM-dd");
        Date.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 220, 30));

        jLabel20.setForeground(new java.awt.Color(255, 153, 51));
        jLabel20.setText("( * Digits Only )");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 90, -1));

        jTabbedPane1.addTab("Add Donor", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Records Found :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 130, 30));

        searchbutton.setBackground(new java.awt.Color(0, 102, 102));
        searchbutton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(255, 255, 255));
        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        searchbutton.setText("Search");
        searchbutton.setBorder(null);
        searchbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 110, 30));

        Bgroup1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bgroup1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        Bgroup1.setToolTipText("AB+");
        Bgroup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bgroup1ActionPerformed(evt);
            }
        });
        jPanel3.add(Bgroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 220, 30));

        searchtable.setAutoCreateRowSorter(true);
        searchtable.setBackground(new java.awt.Color(102, 102, 102));
        searchtable.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(searchtable);

        jScrollPane5.setViewportView(jScrollPane2);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1060, 290));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("            Blood Group :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 170, 30));

        totalRec.setEditable(false);
        totalRec.setBackground(new java.awt.Color(102, 102, 102));
        totalRec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalRec.setForeground(java.awt.Color.white);
        totalRec.setBorder(null);
        jPanel3.add(totalRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 60, 30));

        jTabbedPane1.addTab("Search", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbutton1.setBackground(new java.awt.Color(0, 102, 102));
        searchbutton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchbutton1.setForeground(new java.awt.Color(255, 255, 255));
        searchbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        searchbutton1.setText("Search");
        searchbutton1.setBorder(null);
        searchbutton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutton1ActionPerformed(evt);
            }
        });
        jPanel4.add(searchbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 30));

        Bgroup2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bgroup2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        Bgroup2.setToolTipText("AB+");
        Bgroup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bgroup2ActionPerformed(evt);
            }
        });
        jPanel4.add(Bgroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 220, -1));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("            Blood Group :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 170, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Name");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 80, 30));

        DName1.setBackground(new java.awt.Color(102, 102, 102));
        DName1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DName1.setForeground(new java.awt.Color(255, 255, 255));
        DName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DName1.setDoubleBuffered(true);
        DName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DName1ActionPerformed(evt);
            }
        });
        jPanel4.add(DName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 210, 30));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Blood Group");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 160, 30));

        Bgroup3.setEditable(true);
        Bgroup3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bgroup3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        Bgroup3.setToolTipText("");
        Bgroup3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bgroup3ActionPerformed(evt);
            }
        });
        jPanel4.add(Bgroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 220, 30));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Address");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, 30));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DAddress1.setBackground(new java.awt.Color(102, 102, 102));
        DAddress1.setColumns(20);
        DAddress1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DAddress1.setForeground(new java.awt.Color(255, 255, 255));
        DAddress1.setLineWrap(true);
        DAddress1.setRows(5);
        DAddress1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(DAddress1);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 210, 90));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Birth Date");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 160, 30));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Gender");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 30));

        male1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(male1);
        male1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        male1.setForeground(java.awt.Color.white);
        male1.setText("Male");
        male1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male1ActionPerformed(evt);
            }
        });
        jPanel4.add(male1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        female1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(female1);
        female1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        female1.setForeground(java.awt.Color.white);
        female1.setText("Female");
        female1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female1ActionPerformed(evt);
            }
        });
        jPanel4.add(female1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, -1));

        Gender1.setEditable(false);
        Gender1.setBackground(new java.awt.Color(102, 102, 102));
        Gender1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Gender1.setForeground(new java.awt.Color(255, 255, 255));
        Gender1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Gender1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender1ActionPerformed(evt);
            }
        });
        jPanel4.add(Gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 30));

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Phone");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 80, 30));

        Dphone1.setBackground(new java.awt.Color(102, 102, 102));
        Dphone1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Dphone1.setForeground(new java.awt.Color(255, 255, 255));
        Dphone1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dphone1.setDoubleBuffered(true);
        Dphone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Dphone1KeyTyped(evt);
            }
        });
        jPanel4.add(Dphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 220, 30));

        add1.setBackground(new java.awt.Color(0, 102, 102));
        add1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update1.png"))); // NOI18N
        add1.setText("Update Donor");
        add1.setBorder(null);
        add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel4.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 180, 40));

        delete.setBackground(new java.awt.Color(0, 102, 102));
        delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete (Custom).png"))); // NOI18N
        delete.setText("Delete");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 110, 40));

        searchtable1.setAutoCreateRowSorter(true);
        searchtable1.setBackground(new java.awt.Color(102, 102, 102));
        searchtable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        searchtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        searchtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(searchtable1);

        jScrollPane6.setViewportView(jScrollPane3);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1050, 120));

        Date1.setDateFormatString(" yyyy-MM-dd");
        Date1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel4.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 220, 30));

        jLabel21.setForeground(new java.awt.Color(255, 153, 51));
        jLabel21.setText("( * Digits Only )");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 90, -1));

        jTabbedPane1.addTab("Update / Delete", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1080, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 560));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setForeground(new java.awt.Color(255, 247, 10));
        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button_plus_red (Custom)_1.png"))); // NOI18N
        jMenuItem1.setText("New Entry");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search (Custom).png"))); // NOI18N
        jMenuItem2.setText("Search");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jMenuItem3.setText("Uptade/Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit (Custom).png"))); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu2.setForeground(new java.awt.Color(255, 247, 10));
        jMenu2.setText("About");

        jMenuItem6.setText("About Product");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1076, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgroupActionPerformed
        // TODO add your handling code here:
        String choice = Bgroup.getSelectedItem() +"";
        
    }//GEN-LAST:event_BgroupActionPerformed
   
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
       String str = male.getText();
       Gender.setText(str);
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        String str = female.getText();
       Gender.setText(str);
    }//GEN-LAST:event_femaleActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      
      
        try {
            
            String date=((JTextField)Date.getDateEditor().getUiComponent()).getText();
            String dname =DName.getText();
            String daddress = DAddress.getText();
            String gender = Gender.getText();
            String phone = Dphone.getText();
            String bgroup = (String) Bgroup.getSelectedItem();
            String dob = date;
            
            if(dname.equals("") || phone.equals("") || bgroup.equals("") || daddress.equals("")) {
               JOptionPane.showMessageDialog(null, " Specify all fields !"); 
            }
            else{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/SignUp_table","root","");
            
            Statement st;
            
            st = conn.createStatement();
            String query1;
            query1 = "insert into donardb (Name,Address,Gender,Phone,BloodGroup,DOB)"
                    + " values('"+dname+"','"+daddress+"','"+gender+"','"+phone+"','"+bgroup+"','"+dob+"')";
            
            
            st.execute(query1);
            
            JOptionPane.showMessageDialog(null, " Donar Added !");
            
            DName.setText("");
            DAddress.setText("");
            Gender.setText("");
            Dphone.setText("");
            Bgroup.setSelectedIndex(-1);
            
            
        }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
               
                String bgroup1 = (String) Bgroup1.getSelectedItem();   
                
                
          try{
               String sql= "select * from donardb where BloodGroup = ? ";
               conn=DriverManager.getConnection("jdbc:mysql://localhost/SignUp_table","root","");
               st = conn.prepareStatement(sql);
              st.setString(1, (String) Bgroup1.getSelectedItem());
                   rs = st.executeQuery();
                
             searchtable.setModel(DbUtils.resultSetToTableModel(rs));
             int row = searchtable.getRowCount();
              totalRec.setText(Integer.toString(row));
                searchtable.setBackground(Color.LIGHT_GRAY);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void Bgroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bgroup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bgroup1ActionPerformed

    private void searchbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutton1ActionPerformed
        // TODO add your handling code here:
              String bgroup1 = (String) Bgroup1.getSelectedItem();   
                
          try{
               String sql2= "select * from donardb where BloodGroup = ? ";
               conn=DriverManager.getConnection("jdbc:mysql://localhost/SignUp_table","root","");
               st = conn.prepareStatement(sql2);
              st.setString(1, (String) Bgroup2.getSelectedItem());
            
                rs = st.executeQuery();
             
             searchtable1.setModel(DbUtils.resultSetToTableModel(rs));
                searchtable1.setBackground(Color.LIGHT_GRAY);
            
             
        } catch (SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_searchbutton1ActionPerformed

    private void Bgroup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bgroup2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bgroup2ActionPerformed

    private void Bgroup3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bgroup3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bgroup3ActionPerformed

    private void DName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DName1ActionPerformed

    private void male1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male1ActionPerformed
        // TODO add your handling code here:
        String str = male.getText();
        Gender1.setText(str);
    }//GEN-LAST:event_male1ActionPerformed

    private void female1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female1ActionPerformed
        // TODO add your handling code here:
         String str = female.getText();
        Gender1.setText(str);
    }//GEN-LAST:event_female1ActionPerformed

    private void Gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender1ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            String date=((JTextField)Date1.getDateEditor().getUiComponent()).getText();
            String dname1 =DName1.getText();
            String daddress1 = DAddress1.getText();
            String gender1 = Gender1.getText();
            String phone1 = Dphone1.getText();
            String bgroup1 = (String) Bgroup3.getSelectedItem();
           String dob1 = date;
            if (dname1.equals("")||daddress1.equals("")) {
              JOptionPane.showMessageDialog(null, " Select donar to update !");
          } else {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/SignUp_table","root","");
         
             int row = searchtable1.getSelectedRow();
        String n= searchtable1.getModel().getValueAt(row,0).toString();
            
            Statement st = conn.createStatement();
            String query1;
            query1 = "update donardb set Name='"+dname1+"',Address='"+daddress1+"',Gender='"+gender1+"',Phone='"+phone1+"',"
                    + "BloodGroup='"+bgroup1+"',DOB='"+dob1+"' where DonarID='"+n+"' ";
          
            st.execute(query1);
            
            JOptionPane.showMessageDialog(null, " Donar Updated Successfully !");
            
            DName1.setText("");
            DAddress1.setText("");
            Gender1.setText("");
            Dphone1.setText("");
            Bgroup3.setSelectedIndex(-1);
           
         
          }
                  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_add1ActionPerformed

    private void searchtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtable1MouseClicked
        // TODO add your handling code here:
         String DOB1 = Date1.getDateFormatString();
        int row = searchtable1.getSelectedRow();
       String n= searchtable1.getModel().getValueAt(row,0).toString();
       
        String query="select * from donardb where DonarID='"+n+"'";
        
        try {
            PreparedStatement st4 = conn.prepareStatement(n);
           ResultSet rs4=st4.executeQuery(query);
           
           while(rs4.next()) {
            DName1.setText(rs4.getString("Name"));
            DAddress1.setText(rs4.getString("Address"));
            Gender1.setText(rs4.getString("Gender"));
            Dphone1.setText(rs4.getString("Phone"));
            Bgroup3.setSelectedItem(rs4.getString("BloodGroup"));
            Date1.setDate(rs4.getDate("DOB"));
            
          }
        } catch (SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchtable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            // TODO add your handling code here:
            LogIn2 lg2 = new LogIn2();
            this.dispose();
            lg2.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new about().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
            String date=((JTextField)Date1.getDateEditor().getUiComponent()).getText();
            String dname1 =DName1.getText();
            String daddress1 = DAddress1.getText();
            String gender1 = Gender1.getText();
            String phone1 = Dphone1.getText();
            String bgroup1 = (String) Bgroup3.getSelectedItem();
         
          
            if (dname1.equals("")||daddress1.equals("")||date.equals("")) {
              JOptionPane.showMessageDialog(null, " Select donar to delete !");
        } else{
             int confirmed = JOptionPane.showConfirmDialog(null, "Delete Record ?","EXIT",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION) {
          
           try { 
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/SignUp_table","root","");
            
           int row = searchtable1.getSelectedRow();
        String n= searchtable1.getModel().getValueAt(row,0).toString();
            
            Statement st = conn.createStatement();
            String query1;
            query1 = "delete from donardb where DonarID='"+n+"' ";
                              
            
            st.execute(query1);
            
            JOptionPane.showMessageDialog(null, " Deleted Successfully !");
            
            DName1.setText("");
            DAddress1.setText("");
            Gender1.setText("");
            Dphone1.setText("");
            Bgroup3.setSelectedIndex(-1);
            Date1.setDateFormatString(" ");
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
      }
    }//GEN-LAST:event_deleteActionPerformed

    private void DphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DphoneKeyTyped
         char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || ch==KeyEvent.VK_BACK_SPACE || ch==KeyEvent.VK_DELETE) {
            evt.consume();
       }
    }//GEN-LAST:event_DphoneKeyTyped

    private void Dphone1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Dphone1KeyTyped
         char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch)) || ch==KeyEvent.VK_BACK_SPACE || ch==KeyEvent.VK_DELETE) {
            evt.consume();
       }
    }//GEN-LAST:event_Dphone1KeyTyped

     
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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bgroup;
    private javax.swing.JComboBox<String> Bgroup1;
    private javax.swing.JComboBox<String> Bgroup2;
    private javax.swing.JComboBox<String> Bgroup3;
    private javax.swing.JTextArea DAddress;
    private javax.swing.JTextArea DAddress1;
    private javax.swing.JTextField DName;
    private javax.swing.JTextField DName1;
    private com.toedter.calendar.JDateChooser Date;
    private com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JTextField Dphone;
    private javax.swing.JTextField Dphone1;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Gender1;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton female1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton male1;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton searchbutton1;
    private javax.swing.JTable searchtable;
    private javax.swing.JTable searchtable1;
    private javax.swing.JTextField totalRec;
    // End of variables declaration//GEN-END:variables
}
