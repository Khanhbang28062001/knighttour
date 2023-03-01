/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knightstour.giaodien;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import knightstour.AutoPlay.chess.KnightTours_Automatic;
import knightstour.AutoPlay.chess.GUISquareInBoard;
import knightstour.AutoPlay.chess.Tours;
import knightstour.AutoPlay.ChessBoard;
import knightstour.AutoPlay.Knight;
import knightstour.AutoPlay.SquareB;
import knightstour.Player.Board;

/**
 *
 * @author My Pc
 */
public class GameMode extends javax.swing.JFrame {

    /**
     * Creates new form ChonCheDo
     */
    public GameMode() {
        initComponents();
          Color col = new Color(255,204,204);
         getContentPane().setBackground(col);
    }

    GameMode(Play aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        CD_nguoi = new javax.swing.JButton();
        CD_May = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();
        backround = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chọn Chế Độ");
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(473, 730));
        setPreferredSize(new java.awt.Dimension(473, 730));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CD_nguoi.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        CD_nguoi.setForeground(new java.awt.Color(102, 51, 0));
        CD_nguoi.setText("Tự Chơi");
        CD_nguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD_nguoiActionPerformed(evt);
            }
        });
        getContentPane().add(CD_nguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 270, 60));

        CD_May.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        CD_May.setForeground(new java.awt.Color(102, 51, 0));
        CD_May.setText("Máy Chơi");
        CD_May.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD_MayActionPerformed(evt);
            }
        });
        getContentPane().add(CD_May, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 270, 60));

        Thoat.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Thoat.setForeground(new java.awt.Color(102, 51, 0));
        Thoat.setText("Thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });
        getContentPane().add(Thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 270, 60));

        backround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/It's a Man's World.png"))); // NOI18N
        backround.setMaximumSize(new java.awt.Dimension(600, 1204));
        getContentPane().add(backround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 473, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        KnightTours n = new KnightTours();
            n.setVisible(true);
            this.setVisible(false);

    }//GEN-LAST:event_ThoatActionPerformed

    private void CD_nguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD_nguoiActionPerformed
        // TODO add your handling code here:
        Play n = new Play();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CD_nguoiActionPerformed

    private void CD_MayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD_MayActionPerformed
        KnightTours_Automatic application = new KnightTours_Automatic();
        application.setVisible(true);

    }//GEN-LAST:event_CD_MayActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GameMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//  
//        /* Create and display the form */
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GameMode().setVisible(true);
//            }
//        });
//    
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CD_May;
    private javax.swing.JButton CD_nguoi;
    private javax.swing.JButton Thoat;
    private javax.swing.JLabel backround;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
    