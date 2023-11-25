/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package csapat3.krutillazs.beadando.Windows;

import csapat3.krutillazs.beadando.Models.Guest;
import csapat3.krutillazs.beadando.Services.GuestService;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author 22-es Iteráció
 */
public class GuestWindow extends javax.swing.JFrame {

    /**
     * Creates new form GuestWindow
     */
    private GuestService guestService;
    public GuestWindow() {
        initComponents();
        
        guestService = new GuestService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        bttnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bttnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBxFirstName = new javax.swing.JTextField();
        txtBxPhoneNumber = new javax.swing.JTextField();
        txtBxAge = new javax.swing.JTextField();
        txtBxLastName = new javax.swing.JTextField();
        txtBxUntil = new com.toedter.calendar.JDateChooser();
        txtBxAddress = new javax.swing.JTextField();
        txtBxBirthday = new com.toedter.calendar.JDateChooser();
        txtBxFrom = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 768));
        setMinimumSize(new java.awt.Dimension(1280, 768));
        getContentPane().setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lakcím");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 390, 100, 30);

        bttnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnAdd.setText("Hozzáadás");
        bttnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddActionPerformed(evt);
            }
        });
        getContentPane().add(bttnAdd);
        bttnAdd.setBounds(470, 570, 250, 70);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 320, 100, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mikortól");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 460, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duelogofeher.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, -40, 660, 180);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vezetéknév");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 250, 110, 30);

        bttnClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnClose.setText("Vissza");
        bttnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(bttnClose);
        bttnClose.setBounds(100, 650, 250, 70);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Keresztnév");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 250, 100, 30);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 128, 214));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(-20, 0, 1940, 100);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vendég felvétele");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 100, 410, 140);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Születési idő");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 320, 100, 30);

        txtBxFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBxFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtBxFirstName);
        txtBxFirstName.setBounds(640, 280, 180, 30);
        getContentPane().add(txtBxPhoneNumber);
        txtBxPhoneNumber.setBounds(640, 420, 180, 30);
        getContentPane().add(txtBxAge);
        txtBxAge.setBounds(640, 350, 180, 30);
        getContentPane().add(txtBxLastName);
        txtBxLastName.setBounds(370, 280, 180, 30);
        getContentPane().add(txtBxUntil);
        txtBxUntil.setBounds(640, 490, 180, 30);
        getContentPane().add(txtBxAddress);
        txtBxAddress.setBounds(370, 420, 180, 30);

        txtBxBirthday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBxBirthdayFocusLost(evt);
            }
        });
        txtBxBirthday.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtBxBirthdayPropertyChange(evt);
            }
        });
        getContentPane().add(txtBxBirthday);
        txtBxBirthday.setBounds(370, 350, 180, 30);
        getContentPane().add(txtBxFrom);
        txtBxFrom.setBounds(370, 490, 180, 30);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefonszám");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(640, 390, 100, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Meddig");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(640, 460, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-80, 40, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddActionPerformed
        Guest guest = new Guest();
        guest.setFirstName(txtBxFirstName.getText());
        guest.setLastName(txtBxLastName.getText());
        guest.setAddress(txtBxAddress.getText());
        guest.setBirthday(txtBxBirthday.getDate());
        guest.setPhoneNumber(txtBxPhoneNumber.getText());
        guest.setStayFrom(txtBxFrom.getDate());
        guest.setStayUntil(txtBxUntil.getDate());
        
        if(guestService.addGuest(guest))
            JOptionPane.showMessageDialog(null, "Hozzáadás sikeres!", "Vendég hozzáadása",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Hozzáadás nem sikerült!","Vendég hozzáadása",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_bttnAddActionPerformed

    private void bttnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bttnCloseActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtBxFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBxFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBxFirstNameActionPerformed

    private void txtBxBirthdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBxBirthdayFocusLost
        updateAgeTextbox();
    }//GEN-LAST:event_txtBxBirthdayFocusLost

    private void txtBxBirthdayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtBxBirthdayPropertyChange
        updateAgeTextbox();
    }//GEN-LAST:event_txtBxBirthdayPropertyChange

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
            java.util.logging.Logger.getLogger(GuestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestWindow().setVisible(true);
            }
        });
    }
    
    private void updateAgeTextbox() {
        Date today = new Date();
        Date birthday = txtBxBirthday.getDate();
        
        if(birthday == null)
            return;
        
        
        long diffInMiles = Math.abs(today.getTime() - birthday.getTime());
        long difference = (diffInMiles / (1000l*60*60*24*365));
        
        txtBxAge.setText(Long.toString(difference));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAdd;
    private javax.swing.JButton bttnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBxAddress;
    private javax.swing.JTextField txtBxAge;
    private com.toedter.calendar.JDateChooser txtBxBirthday;
    private javax.swing.JTextField txtBxFirstName;
    private com.toedter.calendar.JDateChooser txtBxFrom;
    private javax.swing.JTextField txtBxLastName;
    private javax.swing.JTextField txtBxPhoneNumber;
    private com.toedter.calendar.JDateChooser txtBxUntil;
    // End of variables declaration//GEN-END:variables
}
