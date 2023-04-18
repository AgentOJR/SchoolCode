
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author owenrabe
 */
public class RabeGUIExercise1 extends javax.swing.JFrame {

    /**
     * Creates new form RabeGUIExercise1
     */
    private String[] sentences = new String[10];
    private String[] nouns = new String[10];
    private String[] verbs = new String[10];

    public RabeGUIExercise1() {
        initComponents();
        loadArrays();
    }

    private void loadArrays() {
        File f = new File("src/sentences.txt");
        try {
            Scanner s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                sentences[i] = s.nextLine();
            }
            f = new File("src/nouns.txt");
            s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                nouns[i] = s.nextLine();
            }
            f = new File("src/verbs.txt");
            s = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                verbs[i] = s.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error!");
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

        btnMadLib = new javax.swing.JButton();
        txtDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });

        btnMadLib.setFont(new java.awt.Font("Andale Mono", 3, 36)); // NOI18N
        btnMadLib.setText("Mad Lib!");
        btnMadLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMadLibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMadLib, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnMadLib, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMadLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMadLibActionPerformed
        genMadLib();


    }//GEN-LAST:event_btnMadLibActionPerformed

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        genMadLib();
    }//GEN-LAST:event_formMouseWheelMoved
    private void genMadLib() {
        String chosenSentence = sentences[(int) (Math.random() * 10)];
        String part1, part2, part3;
        int numPerc = chosenSentence.indexOf("%");
        int numHash = chosenSentence.indexOf("#");
        if (numPerc > numHash) {
            part1 = chosenSentence.substring(0, numHash);
            part2 = chosenSentence.substring(numHash + 1, numPerc);
            part3 = chosenSentence.substring(numPerc + 1);
            chosenSentence = part1 + verbs[(int) (Math.random() * 10)] + part2 + nouns[(int) (Math.random() * 10)] + part3;
            chosenSentence = chosenSentence.substring(0, 1).toUpperCase() + chosenSentence.substring(1);
            txtDisplay.setText(chosenSentence);
        } else {
            part1 = chosenSentence.substring(0, numPerc);
            part2 = chosenSentence.substring(numPerc + 1, numHash);
            part3 = chosenSentence.substring(numHash + 1);
            chosenSentence = part1 + verbs[(int) (Math.random() * 10)] + part2 + nouns[(int) (Math.random() * 10)] + part3;
            chosenSentence = chosenSentence.substring(0, 1).toUpperCase() + chosenSentence.substring(1);
            txtDisplay.setText(chosenSentence);
        }
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
            java.util.logging.Logger.getLogger(RabeGUIExercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RabeGUIExercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RabeGUIExercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RabeGUIExercise1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RabeGUIExercise1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMadLib;
    private javax.swing.JLabel txtDisplay;
    // End of variables declaration//GEN-END:variables
}
