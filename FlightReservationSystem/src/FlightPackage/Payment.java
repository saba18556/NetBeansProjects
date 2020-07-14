/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightPackage;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JToggleButton;

/**
 *
 * @author dua laptop
 */
public class Payment extends javax.swing.JFrame {

    Flight flight;
    ArrayList<Passenger> passengers;
    ArrayList<JToggleButton> seats;
    Customer customer;

    String securityCode;
    String creditCard;

    PreparedStatement pst;
    ResultSet rs;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date date_today;

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }

    public Payment(Flight flight, ArrayList<Passenger> passengers, Customer customer, ArrayList<JToggleButton> seats) {

        try {
            this.date_today = sdf.parse(sdf.format(new Date()));

        } catch (ParseException ex) {
            Logger.getLogger(FlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        this.flight = flight;
        this.passengers = passengers;
        this.customer = customer;
        this.seats = seats;

        Passenger1.setVisible(false);
        Passenger2.setVisible(false);
        Passenger3.setVisible(false);
        Passenger4.setVisible(false);
        Passenger5.setVisible(false);

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Flight_Database.accdb");
            double economyFare = 0;
            double businessFare = 0;
            String queryCheck = "SELECT * FROM Schedule WHERE Flight_ID = '" + flight.Flight_ID + "'";
            pst = con.prepareStatement(queryCheck);
            rs = pst.executeQuery();
            if (rs.next()) {
                economyFare = rs.getDouble("Economy_fare");
                businessFare = rs.getDouble("Business_fare");
            }

            for (int i = 0; i < passengers.size(); i++) {
                if (customer instanceof OldCustomer) {
                    if (passengers.get(i).passengerType.equals("Adult")) {
                        if (passengers.get(i).cabinType.equals("Business")) {
                            passengers.get(i).payment = (businessFare - (0.2 * businessFare));
                        } else {
                            passengers.get(i).payment = (economyFare - (0.2 * economyFare));
                        }
                    } else {
                        if (passengers.get(i).cabinType.equals("Business")) {
                            passengers.get(i).payment = 0.5 * (businessFare - (0.2 * businessFare));
                        } else {
                            passengers.get(i).payment = 0.5 * (economyFare - (0.2 * economyFare));
                        }
                    }
                } else if (customer instanceof NewCustomer) {
                    if (passengers.get(i).passengerType.equals("Adult")) {
                        if (passengers.get(i).cabinType.equals("Business")) {
                            passengers.get(i).payment = businessFare;
                        } else {
                            passengers.get(i).payment = economyFare;
                        }
                    } else {
                        if (passengers.get(i).cabinType.equals("Business")) {
                            passengers.get(i).payment = 0.5 * (businessFare);
                        } else {
                            passengers.get(i).payment = 0.5 * (economyFare);
                        }
                    }
                }
            }

            double totalAmount = 0;

            for (int i = 0; i < passengers.size(); i++) {
                if (i == 0) {
                    Passenger1.setVisible(true);
                    Passenger1.setText("Passenger 1: " + passengers.get(i).name + " | " + passengers.get(i).passengerType + " | " + passengers.get(i).cabinType + " | Rs. " + passengers.get(i).payment);
                }
                if (i == 1) {
                    Passenger2.setVisible(true);
                    Passenger2.setText("Passenger 2: " + passengers.get(i).name + " | " + passengers.get(i).passengerType + " | " + passengers.get(i).cabinType + " | Rs. " + passengers.get(i).payment);
                }
                if (i == 2) {
                    Passenger3.setVisible(true);
                    Passenger3.setText("Passenger 3: " + passengers.get(i).name + " | " + passengers.get(i).passengerType + " | " + passengers.get(i).cabinType + " | Rs. " + passengers.get(i).payment);
                }
                if (i == 3) {
                    Passenger4.setVisible(true);
                    Passenger4.setText("Passenger 4: " + passengers.get(i).name + " | " + passengers.get(i).passengerType + " | " + passengers.get(i).cabinType + " | Rs. " + passengers.get(i).payment);
                }
                if (i == 4) {
                    Passenger5.setVisible(true);
                    Passenger5.setText("Passenger 5: " + passengers.get(i).name + " | " + passengers.get(i).passengerType + " | " + passengers.get(i).cabinType + " | Rs. " + passengers.get(i).payment);
                }
                totalAmount = totalAmount + passengers.get(i).payment;
            }

            TotalAmount.setText("Total Amount: Rs " + totalAmount);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Book = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        creditCardField = new javax.swing.JTextField();
        signatureField = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ccL = new javax.swing.JLabel();
        sigL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Passenger3 = new javax.swing.JLabel();
        Passenger5 = new javax.swing.JLabel();
        Passenger4 = new javax.swing.JLabel();
        Passenger1 = new javax.swing.JLabel();
        TotalAmount = new javax.swing.JLabel();
        Passenger2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Candara Light", 3, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Billing Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 480, -1));

        Book.setBackground(new java.awt.Color(255, 255, 255));
        Book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/Ok_48px_1.png"))); // NOI18N
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        getContentPane().add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 70, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Creditcard#");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("<HTML>Signature<br>(last 3 digits)<HTML>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Expiry Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        creditCardField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        creditCardField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditCardFieldFocusLost(evt);
            }
        });
        creditCardField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                creditCardFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditCardFieldKeyTyped(evt);
            }
        });
        getContentPane().add(creditCardField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 260, 30));

        signatureField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        signatureField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signatureFieldFocusLost(evt);
            }
        });
        signatureField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                signatureFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                signatureFieldKeyTyped(evt);
            }
        });
        getContentPane().add(signatureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 260, 30));

        jDateChooser1.setMinSelectableDate(date_today );
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 260, 30));

        ccL.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        ccL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ccL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 300, -1));

        sigL.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        sigL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(sigL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 360, -1));

        dateL.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        dateL.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dateL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 360, -1));

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/Undo_52px.png"))); // NOI18N
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 70, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/blue background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 940, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/panel.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 540));

        jPanel1.setBackground(new java.awt.Color(251, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Passenger3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Passenger3.setText("Passenger3");
        jPanel1.add(Passenger3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 35));

        Passenger5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Passenger5.setText("Passenger5");
        jPanel1.add(Passenger5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 470, 32));

        Passenger4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Passenger4.setText("Passenger4");
        jPanel1.add(Passenger4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 470, 31));

        Passenger1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Passenger1.setText("Passenger1");
        jPanel1.add(Passenger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 38));

        TotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        TotalAmount.setText("Total Payment");
        jPanel1.add(TotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 38));

        Passenger2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Passenger2.setText("Passenger2");
        jPanel1.add(Passenger2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 480, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FlightPackage/images/blue background1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        ccL.setText("");
        sigL.setText("");
        dateL.setText("");

        if (creditCardField.getText().length() == 0) {
            ccL.setText("Enter the Credit Card No.");
        } else if ((creditCardField.getText().length() != 16)) {
            ccL.setText("Credit Card No. should be 16 digits");
        }

        if (signatureField.getText().length() == 0) {
            sigL.setText("Enter the signature of Credit Card");
        } else if ((signatureField.getText().length() != 3)) {
            sigL.setText("Last 3 digits of your signature are required");
        }

        if (jDateChooser1.getDate() == null) {
            dateL.setText("Please select Expiry Date");
        }
        if ((creditCardField.getText().length() == 16) && (signatureField.getText().length() == 3) && (jDateChooser1.getDate() != null)) {

            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://Flight_Database.accdb");

                //schedule update
                int prevSeats = 0;
                String queryCheck = "SELECT * FROM Schedule WHERE Flight_ID = ?";
                pst = con.prepareStatement(queryCheck);
                pst.setString(1, flight.Flight_ID);
                rs = pst.executeQuery();
                if (rs.next()) {
                    prevSeats = rs.getInt("Available_Seats");
                }

                String update = "UPDATE Schedule SET Available_Seats='" + (prevSeats - flight.totalPassengers) + "' WHERE Flight_ID='" + flight.Flight_ID + "'";
                pst = con.prepareStatement(update);
                pst.executeUpdate();

                //seat update
                for (int i = 0; i < passengers.size(); i++) {
                    try {
                        String sql = "UPDATE Seat SET " + passengers.get(i).seat + "='X' WHERE Flight_ID='" + flight.Flight_ID + "'";
                        pst = con.prepareStatement(sql);
                        pst.executeUpdate();

                    } catch (SQLException ex) {
                        Logger.getLogger(Seat.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                String capitalFlightID=flight.Flight_ID.toUpperCase();
                //customer update
                
                String capitalFirstName = customer.firstName.toUpperCase();
                String capitalLastName = customer.lastName.toUpperCase();
                String insert = "insert into Customer(CNIC,FirstName,surname,phone) values('" + customer.CNIC + "','" + capitalFirstName + "','" + capitalLastName + "','" + customer.phone + "')";
                pst = con.prepareStatement(insert);
                pst.executeUpdate();

                String maxPNR = "select * from Customer where PNR_No= (Select MAX(PNR_No) FROM Customer)";
                pst = con.prepareStatement(maxPNR);
                rs = pst.executeQuery();
                if (rs.next()) {
                    customer.PNR = rs.getInt("PNR_No");
                }

                //passenger update
                int ticketNo = 1210000000;
                
                if (customer.PNR == 1) {
                    String capitalName0 = passengers.get(0).name.toUpperCase();
                    String insert1 = "insert into Passenger(PNR_No,PassportNo,Full_Name,gender,DOB,Country,SeatNo,Cabin,PassengerType,Payment,ETKT,Flight_ID) values('" + customer.PNR + "','" + passengers.get(0).passport + "','" + capitalName0 + "','" + passengers.get(0).gender + "','" + sdf.format(passengers.get(0).date) + "','" + passengers.get(0).country + "','" + passengers.get(0).seat + "','" + passengers.get(0).cabinType + "','" + passengers.get(0).passengerType + "','" + passengers.get(0).payment + "','" + ticketNo + "','" + capitalFlightID+ "')";
                    pst = con.prepareStatement(insert1);
                    pst.executeUpdate();

                    for (int i = 1; i < passengers.size(); i++) {
                        String capitalName = passengers.get(i).name.toUpperCase();
                        ticketNo++;
                        String insert2 = "INSERT into Passenger(PNR_No,PassportNo,Full_Name,gender,DOB,Country,SeatNo,Cabin,PassengerType,Payment,ETKT,Flight_ID)values('" + customer.PNR + "','" + passengers.get(i).passport + "','" + capitalName + "','" + passengers.get(i).gender + "','" + sdf.format(passengers.get(i).date) + "','" + passengers.get(i).country + "','" + passengers.get(i).seat + "','" + passengers.get(i).cabinType + "','" + passengers.get(i).passengerType + "','" + passengers.get(i).payment + "','" + ticketNo + "','" + capitalFlightID + "')";
                        pst = con.prepareStatement(insert2);
                        pst.executeUpdate();

                    }

                } 
                else {
                        int ticketNoP=0;
                        int ticketNoCP=0;
                    String max_Ticket_NoP = "SELECT * from Passenger WHERE ETKT = (SELECT MAX(ETKT) FROM Passenger)";
                    pst = con.prepareStatement(max_Ticket_NoP);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        ticketNoP = rs.getInt("ETKT");
                    }
                    
                    
                   int check=0; 
                   Statement stmt = con.createStatement();
                   rs=stmt.executeQuery("SELECT * from CancelledPassengers WHERE ETKT = (SELECT MAX(ETKT) FROM CancelledPassengers)");
                   
                   if(rs.next()==false){
                       check=1;
                   }
                   else{
                       check=2;
                   }
                    
                    
                    if(check==2){
                    
                    String max_Ticket_NoCP = "SELECT * from CancelledPassengers WHERE ETKT = (SELECT MAX(ETKT) FROM CancelledPassengers)";
                    pst = con.prepareStatement(max_Ticket_NoCP);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        ticketNoCP = rs.getInt("ETKT");
                    }
                    }
                    
                    if(ticketNoP>ticketNoCP){
                        ticketNo=ticketNoP;
                    }
                    else{
                        ticketNo=ticketNoCP;
                    }
                    for (int i = 0; i < passengers.size(); i++) {
                        String capitalNamei = passengers.get(i).name.toUpperCase();
                        ticketNo++;
                        PreparedStatement pst1 = con.prepareStatement("INSERT into Passenger(PNR_No,PassportNo,Full_Name,gender,DOB,Country,SeatNo,Cabin,PassengerType,Payment,ETKT,Flight_ID)values('" + customer.PNR + "','" + passengers.get(i).passport + "','" + capitalNamei + "','" + passengers.get(i).gender + "','" + (sdf.format(passengers.get(i).date)) + "','" + passengers.get(i).country + "','" + passengers.get(i).seat + "','" + passengers.get(i).cabinType + "','" + passengers.get(i).passengerType + "','" + passengers.get(i).payment + "','" + ticketNo + "','" + capitalFlightID+ "')");
                        pst1.executeUpdate();
                    }
                }

                JOptionPane.showMessageDialog(this, "Your flight is booked! Use your PNR Number: " + customer.PNR + " to Cancel/Print your ticket.", "Booking Confirmed!", INFORMATION_MESSAGE);
                this.dispose();
                new MainFrame().setVisible(true);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BookActionPerformed

    private void creditCardFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditCardFieldKeyReleased
        // TODO add your handling code here:
        ccL.setText("");
    }//GEN-LAST:event_creditCardFieldKeyReleased

    private void signatureFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signatureFieldKeyReleased
        // TODO add your handling code here:
        sigL.setText("");
    }//GEN-LAST:event_signatureFieldKeyReleased

    private void creditCardFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditCardFieldKeyTyped
        // TODO add your handling code here:
        char ac = evt.getKeyChar();
        if (!(Character.isDigit(ac)) || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
            creditCardField.setEditable(true);
        }
    }//GEN-LAST:event_creditCardFieldKeyTyped

    private void signatureFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signatureFieldKeyTyped

        char ac = evt.getKeyChar();
        if (!(Character.isDigit(ac)) || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
            signatureField.setEditable(true);
        }
    }//GEN-LAST:event_signatureFieldKeyTyped

    private void creditCardFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditCardFieldFocusLost

        if (creditCardField.getText().length() == 0) {
            ccL.setText("Enter the Credit Card No.");
        } else if ((creditCardField.getText().length() != 16)) {
            ccL.setText("Credit Card No. should be 16 digits");
        }

    }//GEN-LAST:event_creditCardFieldFocusLost

    private void signatureFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signatureFieldFocusLost

        if (signatureField.getText().length() == 0) {
            sigL.setText("Enter the signature of Credit Card");
        } else if ((signatureField.getText().length() != 3)) {
            sigL.setText("Last 3 digits of your signature are required");
        }

    }//GEN-LAST:event_signatureFieldFocusLost

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        new NewCustomer(flight, passengers, customer, seats).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JLabel Passenger1;
    private javax.swing.JLabel Passenger2;
    private javax.swing.JLabel Passenger3;
    private javax.swing.JLabel Passenger4;
    private javax.swing.JLabel Passenger5;
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel ccL;
    private javax.swing.JTextField creditCardField;
    private javax.swing.JLabel dateL;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sigL;
    private javax.swing.JTextField signatureField;
    // End of variables declaration//GEN-END:variables
}
