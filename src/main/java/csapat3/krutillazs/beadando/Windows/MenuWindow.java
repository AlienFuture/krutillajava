package csapat3.krutillazs.beadando.Windows;

import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Models.Message;
import csapat3.krutillazs.beadando.Models.Session;
import csapat3.krutillazs.beadando.Models.User;
import csapat3.krutillazs.beadando.Services.MessageService;
import csapat3.krutillazs.beadando.Utils.Logger;
import csapat3.krutillazs.beadando.Windows.Dialogs.MessageOfDayDialog;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MenuWindow extends javax.swing.JFrame {
    MessageService messageService;

    public MenuWindow() {
        Logger.log("Loading Main menu Window with utils", LogType.INFO);
       this.messageService = new MessageService();

        initComponents();
                Logger.log("Components loaded.", LogType.INFO);
        
        lblLoggedName.setText(Session.currentUser.getFullName());
        
        try {
            initMessagesList();
            txtAreaMessageOfDay.setText(messageService.getLatestMessageContent());
                    Logger.log("Message of Day textield loaded.", LogType.INFO);
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, String.format("Hiba történt a napi üzenet lekérdezése során:\n\n%s", ex.getMessage()),"Nap üzenete",JOptionPane.ERROR_MESSAGE);
            Logger.log("Could not load Message of day textfield due to exception: " + ex.getMessage(), LogType.ERROR);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bttnAddStudent = new javax.swing.JButton();
        bttnAddGuest = new javax.swing.JButton();
        bttnModify = new javax.swing.JButton();
        bttnExit = new javax.swing.JButton();
        lstvwMessages = new javax.swing.JScrollPane();
        lstMessages = new javax.swing.JList<>();
        lblLoggedName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessageOfDay = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/duelogofeher.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, -40, 660, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kollegiumlogo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 130, 470, 440);

        bttnAddStudent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnAddStudent.setText("Hallgató felvétel");
        bttnAddStudent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 204, 255), null, null));
        bttnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(bttnAddStudent);
        bttnAddStudent.setBounds(190, 150, 270, 110);

        bttnAddGuest.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnAddGuest.setText("Vendég felvétel");
        bttnAddGuest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 204, 255), null, null));
        bttnAddGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddGuestActionPerformed(evt);
            }
        });
        getContentPane().add(bttnAddGuest);
        bttnAddGuest.setBounds(190, 290, 270, 110);

        bttnModify.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnModify.setText("Adatmódosítás");
        bttnModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 204, 255), null, null));
        bttnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnModifyActionPerformed(evt);
            }
        });
        getContentPane().add(bttnModify);
        bttnModify.setBounds(190, 440, 270, 110);

        bttnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bttnExit.setText("Kijelentkezés");
        bttnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 204, 255), null, null));
        bttnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExitActionPerformed(evt);
            }
        });
        getContentPane().add(bttnExit);
        bttnExit.setBounds(190, 590, 270, 110);

        lstMessages.setBackground(new java.awt.Color(0, 153, 153));
        lstMessages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMessagesMouseClicked(evt);
            }
        });
        lstvwMessages.setViewportView(lstMessages);

        getContentPane().add(lstvwMessages);
        lstvwMessages.setBounds(570, 710, 570, 154);

        lblLoggedName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLoggedName.setForeground(new java.awt.Color(255, 255, 255));
        lblLoggedName.setText("Bejelentkezett név N/A");
        getContentPane().add(lblLoggedName);
        lblLoggedName.setBounds(1060, 30, 270, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 128, 214));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(-20, 0, 1940, 100);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1320, 100);

        txtAreaMessageOfDay.setBackground(new java.awt.Color(196, 255, 255));
        txtAreaMessageOfDay.setColumns(20);
        txtAreaMessageOfDay.setForeground(new java.awt.Color(255, 0, 0));
        txtAreaMessageOfDay.setRows(5);
        txtAreaMessageOfDay.setText("Message of the day");
        txtAreaMessageOfDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAreaMessageOfDay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 590, 570, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menubg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-100, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnAddGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddGuestActionPerformed
        new GuestWindow().setVisible(true);
    }//GEN-LAST:event_bttnAddGuestActionPerformed

    private void bttnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExitActionPerformed
        Session.currentUser = null;
        this.setVisible(false);
        new LoginWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttnExitActionPerformed

    private void bttnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddStudentActionPerformed
        Logger.log("Opening Student add Window", LogType.INFO);
        new AddWindow().setVisible(true);
    }//GEN-LAST:event_bttnAddStudentActionPerformed

    private void lstMessagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMessagesMouseClicked
        try {
                    Logger.log("Opening Message Of Day message from Listview", LogType.INFO);
            JList list = (JList)evt.getSource();
            if (evt.getClickCount() == 2) {
                int index = list.locationToIndex(evt.getPoint());
                if (index >= 0) {
                            Logger.log("Message found, initializing and opening...", LogType.INFO);
                    Object obj = list.getModel().getElementAt(index);
                    Message selectedMsg = messageService.getLatestMessageByTitle(obj.toString());
                    
                            Logger.log("Opening Message Of Day Form", LogType.INFO);
                    new MessageOfDayDialog(selectedMsg).setVisible(true);
              }
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, String.format("Hiba történt a napi üzenet lekérdezése során:\n\n%s", ex.getMessage()),"Nap üzenete",JOptionPane.ERROR_MESSAGE);
            Logger.log("Could not load Message Of Day message from SQL due to this exception: " + ex.getMessage(), LogType.ERROR);
        }

    }//GEN-LAST:event_lstMessagesMouseClicked

    private void bttnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnModifyActionPerformed
        JOptionPane.showMessageDialog(null, "Ez az opció jelenleg fejlesztés alatt van.\n\nKérlek vedd fel a kapcsolatot rendszergazdával!","Adatmódosítás",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bttnModifyActionPerformed

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
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuWindow().setVisible(true);
            }
        });
    }
    
    private void initMessagesList() throws SQLException {
        DefaultListModel listModel = new DefaultListModel();
        
        for(Message msg : messageService.getAllMessages())
            listModel.addElement(msg.getTitle());
        lstMessages.setModel(listModel);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAddGuest;
    private javax.swing.JButton bttnAddStudent;
    private javax.swing.JButton bttnExit;
    private javax.swing.JButton bttnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblLoggedName;
    private javax.swing.JList<String> lstMessages;
    private javax.swing.JScrollPane lstvwMessages;
    private javax.swing.JTextArea txtAreaMessageOfDay;
    // End of variables declaration//GEN-END:variables
}
