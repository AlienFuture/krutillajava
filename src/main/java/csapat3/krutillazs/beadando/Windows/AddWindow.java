/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package csapat3.krutillazs.beadando.Windows;

import csapat3.krutillazs.beadando.Models.Student;
import csapat3.krutillazs.beadando.Services.StudentService;
import javax.swing.JOptionPane;

/**
 *
 * @author 22-es Iteráció
 */
public class AddWindow extends javax.swing.JFrame {
    StudentService service;
    /**
     * Creates new form AddWindow
     */
    public AddWindow() {
        initComponents();
        this.service = new StudentService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnAdd = new javax.swing.JButton();
        bttnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBxUsername = new javax.swing.JTextField();
        txtBxBirthdayPlace = new javax.swing.JTextField();
        txtBxFirstName = new javax.swing.JTextField();
        txtBxLastName = new javax.swing.JTextField();
        txtBxPassword = new javax.swing.JTextField();
        txtBxAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtBxBirthday = new com.toedter.calendar.JDateChooser();
        txtBxNeptun = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 768));
        setMinimumSize(new java.awt.Dimension(1280, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        bttnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnAdd.setText("Hozzáadás");
        bttnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddActionPerformed(evt);
            }
        });
        getContentPane().add(bttnAdd);
        bttnAdd.setBounds(470, 560, 250, 70);

        bttnClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnClose.setText("Vissza");
        bttnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(bttnClose);
        bttnClose.setBounds(100, 640, 250, 70);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Születési idő");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 320, 100, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Felhasználónév");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 250, 110, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Születési hely");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 470, 100, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Neptunkód");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 390, 100, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vezetéknév");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 250, 100, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Keresztnév");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 320, 100, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jelszó");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 390, 100, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lakcím");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(640, 460, 100, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Hallgató felvétele");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(390, 110, 410, 140);
        getContentPane().add(txtBxUsername);
        txtBxUsername.setBounds(370, 280, 180, 30);
        getContentPane().add(txtBxBirthdayPlace);
        txtBxBirthdayPlace.setBounds(370, 500, 180, 30);
        getContentPane().add(txtBxFirstName);
        txtBxFirstName.setBounds(640, 350, 180, 30);

        txtBxLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBxLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtBxLastName);
        txtBxLastName.setBounds(640, 280, 180, 30);
        getContentPane().add(txtBxPassword);
        txtBxPassword.setBounds(640, 420, 180, 30);
        getContentPane().add(txtBxAddress);
        txtBxAddress.setBounds(640, 490, 180, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duelogofeher.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, -40, 660, 180);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 128, 214));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(-20, 0, 1940, 100);
        getContentPane().add(txtBxBirthday);
        txtBxBirthday.setBounds(370, 350, 180, 30);
        getContentPane().add(txtBxNeptun);
        txtBxNeptun.setBounds(370, 420, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-100, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bttnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        student.setFirstName(txtBxFirstName.getText());
        student.setLastName(txtBxLastName.getText());
        student.setNeptunCode(txtBxNeptun.getText());
        student.setBirthday(txtBxBirthday.getDate());
        student.setBirthdayPlace(txtBxBirthdayPlace.getText());
        student.setAddress(txtBxAddress.getText());
        student.setUserName(txtBxUsername.getText());
        student.setPassword(txtBxPassword.getText());
        
        if(service.addStudent(student))
            JOptionPane.showMessageDialog(null, "Hozzáadás sikeres!", "Hallgató hozzáadása",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Hozzáadás nem sikerült!","Hallgató hozzáadása",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_bttnAddActionPerformed

    private void txtBxLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBxLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBxLastNameActionPerformed

    private void bttnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCloseActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_bttnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAdd;
    private javax.swing.JButton bttnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBxAddress;
    private com.toedter.calendar.JDateChooser txtBxBirthday;
    private javax.swing.JTextField txtBxBirthdayPlace;
    private javax.swing.JTextField txtBxFirstName;
    private javax.swing.JTextField txtBxLastName;
    private javax.swing.JTextField txtBxNeptun;
    private javax.swing.JTextField txtBxPassword;
    private javax.swing.JTextField txtBxUsername;
    // End of variables declaration//GEN-END:variables
}
