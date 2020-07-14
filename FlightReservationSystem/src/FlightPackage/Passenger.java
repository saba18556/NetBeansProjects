/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightPackage;

import java.sql.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JToggleButton;

/**
 *
 * @author dua laptop
 */
public class Passenger extends javax.swing.JFrame {

    Flight flight;
    ArrayList<JToggleButton> seats;

    ArrayList<Passenger> passengers;

    String name, passport, gender, country, seat, cabinType, passengerType;
    Date date;
    double payment;

    DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date date_today;
    
    Passenger p1;
    Passenger p2;
    Passenger p3;
    Passenger p4;
    Passenger p5;

    
    private static final long MILLISECONDS_IN_YEAR = 1000L * 60L * 60L * 24L * 365L;
    private static final int AGE_LIMIT = 8;

    public Passenger() {
        initComponents();
    }

    public Passenger(Flight flight, ArrayList<JToggleButton> seats) {
        this.flight = flight;
        this.seats = seats;
        passengers = new ArrayList<>();
        try {
            this.date_today = sdf.parse(sdf.format(new Date()));
        } catch (ParseException ex) {
            Logger.getLogger(FlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        switch (seats.size()) {
            case 1:
                jPanel2.setVisible(false);
                jPanel3.setVisible(false);
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 2:
                jPanel3.setVisible(false);
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 3:
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 4:
                jPanel5.setVisible(false);
                break;
        }
    }

    public Passenger(Flight flight, ArrayList<JToggleButton> seats, ArrayList<Passenger> passengers) {

        this.flight = flight;
        this.seats = seats;
        this.passengers = passengers;
        initComponents();
        switch (seats.size()) {
            case 1:
                jPanel2.setVisible(false);
                jPanel3.setVisible(false);
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 2:
                jPanel3.setVisible(false);
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 3:
                jPanel4.setVisible(false);
                jPanel5.setVisible(false);
                break;
            case 4:
                jPanel5.setVisible(false);
                break;
        }

        for (int i = 0; i < passengers.size(); i++) {
            if (i == 0) {
                nameField1.setText(this.passengers.get(i).name);
                passportField1.setText(this.passengers.get(i).passport);
                if (this.passengers.get(i).gender.equals("Male")) {
                    jRadioButton1.setSelected(true);
                } else {
                    jRadioButton2.setSelected(true);
                }
                jDateChooser1.setDate(this.passengers.get(i).date);
                jComboBox1.setSelectedItem(this.passengers.get(i).country);
            }
            if (i == 1) {
                nameField2.setText(this.passengers.get(i).name);
                passportField2.setText(this.passengers.get(i).passport);
                if (this.passengers.get(i).gender.equals("Male")) {
                    jRadioButton4.setSelected(true);
                } else {
                    jRadioButton5.setSelected(true);
                }
                jDateChooser2.setDate(this.passengers.get(i).date);
                jComboBox2.setSelectedItem(this.passengers.get(i).country);
            }
            if (i == 2) {
                nameField3.setText(this.passengers.get(i).name);
                passportField3.setText(this.passengers.get(i).passport);
                if (this.passengers.get(i).gender.equals("Male")) {
                    jRadioButton6.setSelected(true);
                } else {
                    jRadioButton7.setSelected(true);
                }
                jDateChooser3.setDate(this.passengers.get(i).date);
                jComboBox3.setSelectedItem(this.passengers.get(i).country);
            }
            if (i == 3) {
                nameField3.setText(this.passengers.get(i).name);
                passportField3.setText(this.passengers.get(i).passport);
                if (this.passengers.get(i).gender.equals("Male")) {
                    jRadioButton8.setSelected(true);
                } else {
                    jRadioButton9.setSelected(true);
                }
                jDateChooser3.setDate(this.passengers.get(i).date);
                jComboBox3.setSelectedItem(this.passengers.get(i).country);
            }

            if (i == 4) {
                nameField5.setText(this.passengers.get(i).name);
                passportField5.setText(this.passengers.get(i).passport);
                if (this.passengers.get(i).gender.equals("Male")) {
                    jRadioButton10.setSelected(true);
                } else {
                    jRadioButton11.setSelected(true);
                }
                jDateChooser5.setDate(this.passengers.get(i).date);
                jComboBox5.setSelectedItem(this.passengers.get(i).country);
            }

        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nameField3 = new javax.swing.JTextField();
        passportField3 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        nameL3 = new javax.swing.JLabel();
        passL3 = new javax.swing.JLabel();
        dobL3 = new javax.swing.JLabel();
        countryL3 = new javax.swing.JLabel();
        genderL3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        passportField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        nameL = new javax.swing.JLabel();
        passL = new javax.swing.JLabel();
        dobL = new javax.swing.JLabel();
        countryL = new javax.swing.JLabel();
        genderL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nameField2 = new javax.swing.JTextField();
        passportField2 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        nameL2 = new javax.swing.JLabel();
        passL2 = new javax.swing.JLabel();
        dobL2 = new javax.swing.JLabel();
        countryL2 = new javax.swing.JLabel();
        genderL2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nameField4 = new javax.swing.JTextField();
        passportField4 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        nameL4 = new javax.swing.JLabel();
        passL4 = new javax.swing.JLabel();
        dobL4 = new javax.swing.JLabel();
        countryL4 = new javax.swing.JLabel();
        genderL4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        nameField5 = new javax.swing.JTextField();
        passportField5 = new javax.swing.JTextField();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        nameL5 = new javax.swing.JLabel();
        passL5 = new javax.swing.JLabel();
        dobL5 = new javax.swing.JLabel();
        countryL5 = new javax.swing.JLabel();
        genderL5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel32.setText("jLabel32");

        jLabel35.setText("jLabel35");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 550));
        setSize(new java.awt.Dimension(1030, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(576, 1886));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(197, 208, 223));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel4.setText("Passenger#3");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 5, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel15.setText("Name");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 69, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel16.setText("Passport");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 134, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel17.setText("Date of Birth");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 204, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel18.setText("Gender");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 265, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel19.setText("Country");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 316, 107, 40));

        nameField3.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        nameField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameField3KeyReleased(evt);
            }
        });
        jPanel3.add(nameField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 68, 217, -1));

        passportField3.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        passportField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passportField3KeyReleased(evt);
            }
        });
        jPanel3.add(passportField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 131, 217, -1));

        jDateChooser3.setMaxSelectableDate(date_today);
        jPanel3.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 197, 217, 37));

        jRadioButton6.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton6.setText("Male");
        jRadioButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 256, 82, -1));

        jRadioButton7.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton7.setText("Female");
        jRadioButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton7MouseClicked(evt);
            }
        });
        jPanel3.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 256, 115, -1));

        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jComboBox3.setModel(getComboBoxModel());
        jComboBox3.setSelectedItem("Pakistan");
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox3MouseReleased(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 314, 217, -1));

        nameL3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nameL3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(nameL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 106, 240, -1));

        passL3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        passL3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(passL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 166, 250, -1));

        dobL3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dobL3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(dobL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 236, 250, -1));

        countryL3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        countryL3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(countryL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 346, 250, -1));

        genderL3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        genderL3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(genderL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 20));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 883, 485, 373));

        jPanel1.setBackground(new java.awt.Color(197, 208, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel2.setText("Passenger#1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel6.setText("Passport");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, -1, -1));

        jDateChooser1.setMaxSelectableDate(date_today);
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 205, 215, 36));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel9.setText("Country");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 355, -1, -1));

        nameField1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        nameField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameField1KeyReleased(evt);
            }
        });
        jPanel1.add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 55, 215, 32));

        passportField1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        passportField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passportField1KeyReleased(evt);
            }
        });
        jPanel1.add(passportField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 125, 215, -1));

        jRadioButton1.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 285, 90, -1));

        jRadioButton2.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 285, -1, -1));

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jComboBox1.setModel(getComboBoxModel());
        jComboBox1.setSelectedItem("Pakistan");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox1MouseReleased(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 355, 210, -1));

        nameL.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 85, 244, -1));

        passL.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        passL.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 165, 261, -1));

        dobL.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dobL.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(dobL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 245, 277, -1));

        countryL.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        countryL.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(countryL, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 385, 260, -1));

        genderL.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        genderL.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(genderL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, -1));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 10, 482, 414));

        jPanel2.setBackground(new java.awt.Color(197, 208, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel3.setText("Passenger#2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel11.setText("Passport");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 145, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setText("Date of Birth");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel14.setText("Country");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 355, -1, -1));

        nameField2.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        nameField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameField2KeyReleased(evt);
            }
        });
        jPanel2.add(nameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 66, 215, -1));

        passportField2.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        passportField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passportField2KeyReleased(evt);
            }
        });
        jPanel2.add(passportField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 135, 215, -1));

        jRadioButton4.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton4.setText("Male");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 285, 80, -1));

        jRadioButton5.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton5.setText("Female");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 285, -1, -1));

        jDateChooser2.setMaxSelectableDate(date_today);
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 212, 40));

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jComboBox2.setModel(getComboBoxModel());
        jComboBox2.setSelectedItem("Pakistan");
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox2MouseReleased(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 345, 220, 40));

        nameL2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nameL2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(nameL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 105, -1, -1));

        passL2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        passL2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(passL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 175, -1, -1));

        dobL2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dobL2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(dobL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        countryL2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        countryL2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(countryL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        genderL2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        genderL2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(genderL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 210, -1));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 440, 482, 425));

        jPanel4.setBackground(new java.awt.Color(197, 208, 223));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel20.setText("Passenger#4");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel21.setText("Name");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 63, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel22.setText("Passport#");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 130, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel23.setText("Date of Birth");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 198, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel24.setText("Gender");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel25.setText("Country");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 325, -1, -1));

        nameField4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        nameField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameField4KeyReleased(evt);
            }
        });
        jPanel4.add(nameField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 62, 215, -1));

        passportField4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        passportField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passportField4KeyReleased(evt);
            }
        });
        jPanel4.add(passportField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 129, 215, -1));

        jDateChooser4.setMaxSelectableDate(date_today);
        jPanel4.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 195, 215, 39));

        jRadioButton8.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton8.setText("Male");
        jRadioButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton8MouseClicked(evt);
            }
        });
        jPanel4.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 261, 94, -1));

        jRadioButton9.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton9.setText("Female");
        jRadioButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton9MouseClicked(evt);
            }
        });
        jPanel4.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 261, -1, -1));

        jComboBox4.setEditable(true);
        jComboBox4.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jComboBox4.setModel(getComboBoxModel());
        jComboBox4.setSelectedItem("Pakistan");
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox4MouseReleased(evt);
            }
        });
        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 315, 210, -1));

        nameL4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nameL4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(nameL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 104, 250, -1));

        passL4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        passL4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(passL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 165, 240, -1));

        dobL4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dobL4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(dobL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 235, 250, -1));

        countryL4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        countryL4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(countryL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 345, 250, -1));

        genderL4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        genderL4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(genderL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 240, 30));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 1282, 485, 375));

        jPanel5.setBackground(new java.awt.Color(197, 208, 223));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel26.setText("Passenger#5");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 5, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel27.setText("Name");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 74, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel28.setText("Passport#");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 134, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel29.setText("Date of Birth");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 194, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel30.setText("Gender");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 264, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel31.setText("Country");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 324, -1, -1));

        nameField5.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        nameField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameField5KeyReleased(evt);
            }
        });
        jPanel5.add(nameField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 64, 215, -1));

        passportField5.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        passportField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passportField5KeyReleased(evt);
            }
        });
        jPanel5.add(passportField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 124, 215, -1));

        jDateChooser5.setMaxSelectableDate(date_today);
        jPanel5.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 194, 215, 35));

        jRadioButton10.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup5.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton10.setText("Male");
        jRadioButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton10MouseClicked(evt);
            }
        });
        jPanel5.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 264, -1, -1));

        jRadioButton11.setBackground(new java.awt.Color(197, 208, 223));
        buttonGroup5.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jRadioButton11.setText("Female");
        jRadioButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton11MouseClicked(evt);
            }
        });
        jPanel5.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 264, -1, -1));

        jComboBox5.setEditable(true);
        jComboBox5.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        jComboBox5.setModel(getComboBoxModel());
        jComboBox5.setSelectedItem("Pakistan");
        jComboBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox5MouseReleased(evt);
            }
        });
        jPanel5.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 324, 215, -1));

        nameL5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nameL5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(nameL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 95, 270, -1));

        passL5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        passL5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(passL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 154, 270, -1));

        dobL5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        dobL5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(dobL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 234, 290, -1));

        countryL5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        countryL5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(countryL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 354, 280, 20));

        genderL5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        genderL5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(genderL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 260, 30));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 1687, 485, 389));

        jScrollPane1.setViewportView(jPanel6);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 590, 420));

        jLabel37.setBackground(new java.awt.Color(0, 0, 102));
        jLabel37.setFont(new java.awt.Font("Candara Light", 3, 55)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 102));
        jLabel37.setText("Passenger Information");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 620, 70));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/blue background.jpg"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 940, 90));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/panel.jpg"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 530));

        OKButton.setBackground(new java.awt.Color(255, 255, 255));
        OKButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/Redo_52px.png"))); // NOI18N
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 70, 60));

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setFont(new java.awt.Font("Candara", 3, 55)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/Undo_52px.png"))); // NOI18N
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 70, 60));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/blue background1.jpg"))); // NOI18N
        jLabel33.setMaximumSize(new java.awt.Dimension(1030, 550));
        jLabel33.setMinimumSize(new java.awt.Dimension(1030, 550));
        jLabel33.setPreferredSize(new java.awt.Dimension(1030, 550));
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 550));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        p1 = new Passenger();
        p2 = new Passenger();
        p3 = new Passenger();
        p4 = new Passenger();
        p5 = new Passenger();
        passengers.clear();

        for (int i = 0; i < seats.size(); i++) {
            if (i == 0) {

                if (nameField1.getText().trim().isEmpty()) {
                    nameL.setText("Enter Name");
                }if (passportField1.getText().trim().isEmpty()) {
                    passL.setText("Enter Passport No.");
                }if (jDateChooser1.getDate() == null) {
                    dobL.setText("Please select Date of Birth");
                }if (!(jRadioButton1.isSelected()) && !(jRadioButton2.isSelected())) {
                    genderL.setText("Please select Gender");
                } 
                if (!(nameField1.getText().trim().isEmpty()) && !(passportField1.getText().trim().isEmpty()) && (jDateChooser1.getDate() != null) && ((jRadioButton1.isSelected()) || (jRadioButton2.isSelected()))){
                    p1.name = nameField1.getText();
                    p1.passport = passportField1.getText();
                    p1.gender = getSelectedButtonText(buttonGroup1);
                    p1.date = jDateChooser1.getDate();
                    p1.country = (String) jComboBox1.getSelectedItem();
                    p1.seat = seats.get(0).getText();
                    p1.cabinType = setCabinType(p1);
                    p1.passengerType = setPassengerType(p1);
                    passengers.add(p1);
                }

            }

            if (i == 1) {

                if (nameField2.getText().trim().isEmpty()) {
                    nameL2.setText("Enter Name");
                }if (passportField2.getText().trim().isEmpty()) {
                    passL2.setText("Enter Passport No.");
                } if (jDateChooser2.getDate() == null) {
                    dobL2.setText("Please select Date of Birth from the Calender");
                } if (!(jRadioButton4.isSelected()) && !(jRadioButton5.isSelected())) {
                    genderL2.setText("Please select Gender");
                }
                if (!(nameField2.getText().trim().isEmpty()) && !(passportField2.getText().trim().isEmpty()) && (jDateChooser2.getDate() != null) && ((jRadioButton4.isSelected()) || (jRadioButton5.isSelected()))){
                    p2.name = nameField2.getText();
                    p2.passport = passportField2.getText();
                    p2.gender = getSelectedButtonText(buttonGroup2);
                    p2.date = jDateChooser2.getDate();
                    p2.country = (String) jComboBox2.getSelectedItem();
                    p2.seat = seats.get(1).getText();
                    p2.cabinType = setCabinType(p2);
                    p2.passengerType = setPassengerType(p2);
                    passengers.add(p2);
                }
            }    

                if (i == 2) {

                    if (nameField3.getText().trim().isEmpty()) {
                        nameL3.setText("Enter Name");
                    } if (passportField3.getText().trim().isEmpty()) {
                        passL3.setText("Enter Passport No.");
                    } if (jDateChooser3.getDate() == null) {
                        dobL3.setText("Please select Date of Birth");
                    } if (!(jRadioButton6.isSelected()) && !(jRadioButton7.isSelected())) {
                        genderL3.setText("Please select Gender");
                    } 
                    if (!(nameField3.getText().trim().isEmpty()) && !(passportField3.getText().trim().isEmpty()) && (jDateChooser3.getDate() != null) && ((jRadioButton6.isSelected()) || (jRadioButton7.isSelected()))){
                        p3.name = nameField3.getText();
                        p3.passport = passportField3.getText();
                        p3.gender = getSelectedButtonText(buttonGroup3);
                        p3.date = jDateChooser3.getDate();
                        p3.country = (String) jComboBox3.getSelectedItem();
                        p3.seat = seats.get(2).getText();
                        p3.cabinType = setCabinType(p3);
                        p3.passengerType = setPassengerType(p3);
                        passengers.add(p3);
                    }
                }

                if (i == 3) {

                    if (nameField4.getText().trim().isEmpty()) {
                        nameL4.setText("Enter Name");
                    } if (passportField4.getText().trim().isEmpty()) {
                        passL4.setText("Enter Passport No.");
                    } if (jDateChooser4.getDate() == null) {
                        dobL4.setText("Please select Date of Birth");
                    } if (!(jRadioButton8.isSelected()) && !(jRadioButton9.isSelected())) {
                        genderL4.setText("Please select Gender");
                    } 
                    if (!(nameField4.getText().trim().isEmpty()) && !(passportField4.getText().trim().isEmpty()) && (jDateChooser4.getDate() != null) && ((jRadioButton8.isSelected()) || (jRadioButton9.isSelected()))){
                        p4.name = nameField4.getText();
                        p4.passport = passportField4.getText();
                        p4.gender = getSelectedButtonText(buttonGroup4);
                        p4.date = jDateChooser4.getDate();
                        p4.country = (String) jComboBox4.getSelectedItem();
                        p4.seat = seats.get(3).getText();
                        p4.cabinType = setCabinType(p4);
                        p4.passengerType = setPassengerType(p4);
                        passengers.add(p4);
                    }
                }

                if (i == 4) {

                    if (nameField5.getText().trim().isEmpty()) {
                        nameL5.setText("Enter Name");
                    }if (passportField5.getText().trim().isEmpty()) {
                        passL5.setText("Enter Passport No.");
                    } if (jDateChooser5.getDate() == null) {
                        dobL5.setText("Please select Date of Birth");
                    } if (!(jRadioButton10.isSelected()) && !(jRadioButton11.isSelected())) {
                        genderL5.setText("Please select Gender");
                    } 
                    if (!(nameField5.getText().trim().isEmpty()) && !(passportField5.getText().trim().isEmpty()) && (jDateChooser5.getDate() != null) && ((jRadioButton10.isSelected()) || (jRadioButton11.isSelected()))){
                        p5.name = nameField5.getText();
                        p5.passport = passportField5.getText();
                        p5.gender = getSelectedButtonText(buttonGroup5);
                        p5.date = jDateChooser5.getDate();
                        p5.country = (String) jComboBox5.getSelectedItem();
                        p5.seat = seats.get(4).getText();
                        p5.cabinType = setCabinType(p5);
                        p5.passengerType = setPassengerType(p5);
                        passengers.add(p5);
                    }
                }

             if (passengers.size() == seats.size()) {
                new NewCustomer(flight, passengers, seats).setVisible(true);
                this.setVisible(false);
            
        }

           
            }
        
    }//GEN-LAST:event_OKButtonActionPerformed

    private void jComboBox5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox5MouseReleased
        countryL5.setText("");
    }//GEN-LAST:event_jComboBox5MouseReleased

    private void passportField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passportField5KeyReleased
        passL5.setText("");
    }//GEN-LAST:event_passportField5KeyReleased

    private void nameField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField5KeyReleased
        nameL5.setText("");
    }//GEN-LAST:event_nameField5KeyReleased

    private void nameField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField4KeyReleased
        nameL4.setText("");
    }//GEN-LAST:event_nameField4KeyReleased

    private void passportField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passportField4KeyReleased
        passL4.setText("");
    }//GEN-LAST:event_passportField4KeyReleased

    private void jComboBox4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseReleased
        countryL4.setText("");
    }//GEN-LAST:event_jComboBox4MouseReleased

    private void nameField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField3KeyReleased
        nameL3.setText("");
    }//GEN-LAST:event_nameField3KeyReleased

    private void passportField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passportField3KeyReleased
        passL3.setText("");
    }//GEN-LAST:event_passportField3KeyReleased

    private void jComboBox3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseReleased
        countryL3.setText("");
    }//GEN-LAST:event_jComboBox3MouseReleased

    private void nameField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField2KeyReleased
         nameL2.setText("");
    }//GEN-LAST:event_nameField2KeyReleased

    private void passportField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passportField2KeyReleased
        passL2.setText("");
    }//GEN-LAST:event_passportField2KeyReleased

    private void jComboBox2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseReleased
        countryL2.setText("");
    }//GEN-LAST:event_jComboBox2MouseReleased

    private void nameField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField1KeyReleased
        nameL.setText("");
    }//GEN-LAST:event_nameField1KeyReleased

    private void passportField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passportField1KeyReleased
        passL.setText("");
    }//GEN-LAST:event_passportField1KeyReleased

    private void jComboBox1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseReleased
        countryL.setText("");
    }//GEN-LAST:event_jComboBox1MouseReleased

    private void nameField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField1KeyPressed
       
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            nameField1.setEditable(true);
        } else {
            nameField1.setEditable(false);
        }

    }//GEN-LAST:event_nameField1KeyPressed

    private void nameField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField2KeyPressed
        
        char c1 = evt.getKeyChar();
        if (Character.isLetter(c1) || Character.isWhitespace(c1) || Character.isISOControl(c1)) {
            nameField2.setEditable(true);
        } else {
            nameField2.setEditable(false);
        }
    }//GEN-LAST:event_nameField2KeyPressed

    private void nameField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField3KeyPressed
      
        char c2 = evt.getKeyChar();
        if (Character.isLetter(c2) || Character.isWhitespace(c2) || Character.isISOControl(c2)) {
            nameField3.setEditable(true);
        } else {
            nameField3.setEditable(false);
        }
    }//GEN-LAST:event_nameField3KeyPressed

    private void nameField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField4KeyPressed
    
        char c3 = evt.getKeyChar();
        if (Character.isLetter(c3) || Character.isWhitespace(c3) || Character.isISOControl(c3)) {
            nameField4.setEditable(true);
        } else {
            nameField4.setEditable(false);
        }
    }//GEN-LAST:event_nameField4KeyPressed

    private void nameField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameField5KeyPressed

        char c4 = evt.getKeyChar();
        if (Character.isLetter(c4) || Character.isWhitespace(c4) || Character.isISOControl(c4)) {
            nameField5.setEditable(true);
        } else {
            nameField5.setEditable(false);
        }
    }//GEN-LAST:event_nameField5KeyPressed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed

        this.setVisible(false);
        new Seat(flight).setVisible(true);

    }//GEN-LAST:event_backbuttonActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        genderL.setText("");
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        genderL.setText("");
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        genderL2.setText("");
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        genderL2.setText("");
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton6MouseClicked
        genderL3.setText("");
    }//GEN-LAST:event_jRadioButton6MouseClicked

    private void jRadioButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton7MouseClicked
        genderL3.setText("");
    }//GEN-LAST:event_jRadioButton7MouseClicked

    private void jRadioButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton8MouseClicked
        genderL4.setText("");
    }//GEN-LAST:event_jRadioButton8MouseClicked

    private void jRadioButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton9MouseClicked
        genderL4.setText("");
    }//GEN-LAST:event_jRadioButton9MouseClicked

    private void jRadioButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton10MouseClicked
        genderL5.setText("");
    }//GEN-LAST:event_jRadioButton10MouseClicked

    private void jRadioButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton11MouseClicked
        genderL5.setText("");
    }//GEN-LAST:event_jRadioButton11MouseClicked

    public String setCabinType(Passenger p) {
        String cabin = "Economy";
        String[] business_cabin = {"A1", "A2", "A3", "A4", "A5", "A6", "B1", "B2", "B3", "B4", "B5", "B6"};
        for (String cabins : business_cabin) {
            if (cabins.equals(p.seat)) {
                cabin = "Business";
                break;
            }
        }

        return cabin;
    }

    public String setPassengerType(Passenger p) {
        boolean above8;
        String passenger;
        long yearLimitInLong = AGE_LIMIT * MILLISECONDS_IN_YEAR;
        Date date1 = new Date();
        Date dateThreshold = new Date(date1.getTime() - yearLimitInLong);

        above8 = p.date.before(dateThreshold);

        if (above8 == true) {
            passenger = "Adult";
        } else {
            passenger = "Child";
        }
        return passenger;
    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public String[] getAllCountries() {
        String[] countries = new String[Locale.getISOCountries().length];
        String[] countryCodes = Locale.getISOCountries();
        for (int i = 0; i < countryCodes.length; i++) {
            Locale obj = new Locale("", countryCodes[i]);
            countries[i] = obj.getDisplayCountry();
        }
        return countries;
    }

    public DefaultComboBoxModel getComboBoxModel() {
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        dml.addElement("Select");
        for (String allCountries : getAllCountries()) {
            dml.addElement(allCountries);
        }
        return dml;
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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JButton backbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel countryL;
    private javax.swing.JLabel countryL2;
    private javax.swing.JLabel countryL3;
    private javax.swing.JLabel countryL4;
    private javax.swing.JLabel countryL5;
    private javax.swing.JLabel dobL;
    private javax.swing.JLabel dobL2;
    private javax.swing.JLabel dobL3;
    private javax.swing.JLabel dobL4;
    private javax.swing.JLabel dobL5;
    private javax.swing.JLabel genderL;
    private javax.swing.JLabel genderL2;
    private javax.swing.JLabel genderL3;
    private javax.swing.JLabel genderL4;
    private javax.swing.JLabel genderL5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField nameField2;
    private javax.swing.JTextField nameField3;
    private javax.swing.JTextField nameField4;
    private javax.swing.JTextField nameField5;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameL2;
    private javax.swing.JLabel nameL3;
    private javax.swing.JLabel nameL4;
    private javax.swing.JLabel nameL5;
    private javax.swing.JLabel passL;
    private javax.swing.JLabel passL2;
    private javax.swing.JLabel passL3;
    private javax.swing.JLabel passL4;
    private javax.swing.JLabel passL5;
    private javax.swing.JTextField passportField1;
    private javax.swing.JTextField passportField2;
    private javax.swing.JTextField passportField3;
    private javax.swing.JTextField passportField4;
    private javax.swing.JTextField passportField5;
    // End of variables declaration//GEN-END:variables
}
