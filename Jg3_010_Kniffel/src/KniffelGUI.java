
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no
 */
public class KniffelGUI extends javax.swing.JFrame {

    /**
     * Creates new form KniffelGUI
     */
    private String[] category = {"NurEinser", "NurZweier", "NurDreier", "NurVieer", "NurFuenfer", "NurSechser", "Pasch3", "Pasch4", "FullHouse", "StrasseKlein", "StrasseGross", "Kniffel"};
    private int diceCounter = 3;
    private KniffelTableModel map = new KniffelTableModel();
    private DiceTableModel dice = new DiceTableModel();
    private boolean diced = false;
    private boolean finished = false;

    public KniffelGUI() {
        this.setResizable(false);
        initComponents();
        for (String s : category) {
            map.add(new KniffelRow(s, new JCheckBox(), 0));
        }

        taPoints.setModel(map);
        taPoints.setDefaultRenderer(Object.class, new KniffelTableRenderer());
        taPoints.getTableHeader().setReorderingAllowed(false);
        try {
            dice.addPics();
        } catch (MalformedURLException ex) {
        }

        dice.setStartNumbers();
        taDice.setEnabled(false);
        taDice.setModel(dice);
        taDice.setRowHeight(64);
        taDice.setDefaultRenderer(Object.class, new DiceTableRenderer());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onPlayDice = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPoints = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfTopSum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfBon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfBotSum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfPoints = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        taDice = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        onPlayDice.setText("würfeln");
        onPlayDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onPlayDiceActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        taPoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        taPoints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taPointsMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(taPoints);

        jLabel2.setText("Punkte");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Obere Summe:");

        tfTopSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTopSum.setText("0");

        jLabel5.setText("Obere Bonus:");

        tfBon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBon.setText("0");

        jLabel7.setText("Untere Summe:");

        tfBotSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBotSum.setText("0");

        jLabel9.setText("Gesamt-Punkte:");

        tfPoints.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPoints.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTopSum, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(tfBon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(tfPoints, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBotSum, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTopSum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBotSum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Gewinnkarte");

        taDice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        taDice.setColumnSelectionAllowed(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(onPlayDice, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(taDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taDice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onPlayDice)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taPointsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taPointsMousePressed
        int row = taPoints.getSelectedRow();
        int col = taPoints.getSelectedColumn();
        if (diced && col == 1) {
            KniffelRow kr = (KniffelRow) map.getValueAt(row, col);
            if (!kr.getWahl().isSelected() && !map.isAllSelected()) {
                kr.getWahl().setSelected(true);
                diced = false;

                diceCounter = 3;

                onPlayDice.setEnabled(true);
                taDice.getSelectionModel().clearSelection();

                KniffelBL bl = new KniffelBL(row, DiceTableModel.getSelected());
                int points = bl.getPoints();
                map.setValueAt(points, row, 2);

                dice.resetSelection();
                taDice.setEnabled(false);
                calculatePoints();
                taPoints.repaint();

                if (map.isAllSelected()) {
                    finished = true;
                    JOptionPane.showMessageDialog(this, "Finished", "End", JOptionPane.PLAIN_MESSAGE);
                    onPlayDice.setEnabled(false);
                }
            }
        } else if (!finished) {
            JOptionPane.showMessageDialog(this, "Nicht gewürfelt!", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_taPointsMousePressed

    private void onPlayDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPlayDiceActionPerformed
        if (!map.isAllSelected()) {
            taDice.setEnabled(true);
            if (diceCounter > 0) {
                dice.setRandomNumbers();
                diceCounter--;
                diced = true;
            }

            if (diceCounter == 0) {
                onPlayDice.setEnabled(false);
            }
        }
    }//GEN-LAST:event_onPlayDiceActionPerformed

    public void calculatePoints() {
        int topSum = 0;
        for (int i = 0; i < 6; i++) {
            KniffelRow kniffel = (KniffelRow) map.getValueAt(i, 3);
            topSum += kniffel.getPoints();
        }
        tfTopSum.setText(topSum + "");

        int bonus = 0;
        if (topSum >= 63) {
            bonus = 35;
            tfBon.setText("35");
        }

        int botSum = 0;
        for (int i = 6; i < 12; i++) {
            KniffelRow kniffel = (KniffelRow) map.getValueAt(i, 3);
            botSum += kniffel.getPoints();
        }
        tfBotSum.setText(botSum + "");

        int gesamtPoints = topSum + bonus + botSum;
        tfPoints.setText(gesamtPoints + "");
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
            java.util.logging.Logger.getLogger(KniffelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KniffelGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton onPlayDice;
    private javax.swing.JTable taDice;
    private javax.swing.JTable taPoints;
    private javax.swing.JTextField tfBon;
    private javax.swing.JTextField tfBotSum;
    private javax.swing.JTextField tfPoints;
    private javax.swing.JTextField tfTopSum;
    // End of variables declaration//GEN-END:variables
}
