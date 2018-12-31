/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPanels;

import javax.swing.JButton;

/**
 *
 * @author skerd
 */
public class allStorisPanel extends javax.swing.JPanel {

    /**
     * Creates new form allStorisPanel
     */
    public allStorisPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storyLabel = new javax.swing.JLabel();
        btbBtn = new javax.swing.JButton();
        cinderellaBtn = new javax.swing.JButton();
        rapunzelBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        storyLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        storyLabel.setForeground(new java.awt.Color(0, 0, 0));
        storyLabel.setText("Please select to continue a story");

        btbBtn.setBackground(new java.awt.Color(255, 255, 153));
        btbBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btbBtn.setForeground(new java.awt.Color(255, 255, 255));
        btbBtn.setText("Beauty and The Beast");
        btbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbBtnActionPerformed(evt);
            }
        });

        cinderellaBtn.setBackground(new java.awt.Color(255, 255, 153));
        cinderellaBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cinderellaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cinderellaBtn.setText("Cinderella");
        cinderellaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinderellaBtnActionPerformed(evt);
            }
        });

        rapunzelBtn.setBackground(new java.awt.Color(255, 255, 153));
        rapunzelBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rapunzelBtn.setForeground(new java.awt.Color(255, 255, 255));
        rapunzelBtn.setText("Rapunzel");
        rapunzelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapunzelBtnActionPerformed(evt);
            }
        });

        backBtn1.setBackground(new java.awt.Color(255, 255, 153));
        backBtn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backBtn1.setForeground(new java.awt.Color(255, 255, 255));
        backBtn1.setText("Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(storyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rapunzelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(cinderellaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(backBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(storyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btbBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cinderellaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rapunzelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbBtnActionPerformed
        // TODO add your handling code here:
        cs319.main.window.getContentPane().removeAll();

        storyPanel storyGame= new storyPanel(  ((JButton)evt.getSource()).getText() + ""  );
        cs319.main.window.add(storyGame);              
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");
    }//GEN-LAST:event_btbBtnActionPerformed

    private void cinderellaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinderellaBtnActionPerformed
        cs319.main.window.getContentPane().removeAll();

        storyPanel storyGame= new storyPanel(  ((JButton)evt.getSource()).getText() + ""  );
        cs319.main.window.add(storyGame);              
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");
    }//GEN-LAST:event_cinderellaBtnActionPerformed

    private void rapunzelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapunzelBtnActionPerformed
        cs319.main.window.getContentPane().removeAll();

        storyPanel storyGame= new storyPanel(  ((JButton)evt.getSource()).getText() + ""  );
        cs319.main.window.add(storyGame);              
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");
    }//GEN-LAST:event_rapunzelBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed

        cs319.main.window.getContentPane().removeAll();

        newGamePanel newGame = new newGamePanel();
        cs319.main.window.add(newGame);
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");
    }//GEN-LAST:event_backBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton btbBtn;
    private javax.swing.JButton cinderellaBtn;
    private javax.swing.JButton rapunzelBtn;
    private javax.swing.JLabel storyLabel;
    // End of variables declaration//GEN-END:variables
}