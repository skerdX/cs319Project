/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllPanels;

import javax.swing.ImageIcon;

/**
 *
 * @author skerd
 */
public class newGamePanel extends javax.swing.JPanel {

    /**
     * Creates new form newGamePanel
     */
    public newGamePanel() {
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

        storyBtn = new javax.swing.JButton();
        randomBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        playLevelBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));

        storyBtn.setBackground(new java.awt.Color(255, 255, 153));
        storyBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        storyBtn.setForeground(new java.awt.Color(255, 255, 255));
        storyBtn.setText("Story Mode");
        storyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyBtnActionPerformed(evt);
            }
        });

        randomBtn.setBackground(new java.awt.Color(255, 255, 153));
        randomBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        randomBtn.setForeground(new java.awt.Color(255, 255, 255));
        randomBtn.setText("Random");
        randomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomBtnActionPerformed(evt);
            }
        });

        ImageIcon icooon = new ImageIcon("Pictures/logo2.jpg");

        logoLabel.setIcon(icooon);

        backBtn.setBackground(new java.awt.Color(255, 255, 153));
        backBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        playLevelBtn.setBackground(new java.awt.Color(255, 255, 153));
        playLevelBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playLevelBtn.setForeground(new java.awt.Color(255, 255, 255));
        playLevelBtn.setText("Play Levels");
        playLevelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playLevelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(randomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(storyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playLevelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playLevelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(randomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void storyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyBtnActionPerformed

        cs319.main.window.getContentPane().removeAll();

        allStorisPanel allStories= new allStorisPanel();
        cs319.main.window.add(allStories);              
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");

    }//GEN-LAST:event_storyBtnActionPerformed

    private void randomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomBtnActionPerformed
       
        cs319.main.window.getContentPane().removeAll();

        randomPanel random = new randomPanel();
        cs319.main.window.add(random);
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Opening random menu");
        
        
        
    }//GEN-LAST:event_randomBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cs319.main.window.getContentPane().removeAll();

        playPanel play = new playPanel();
        cs319.main.window.add(play);
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to play menu");
    }//GEN-LAST:event_backBtnActionPerformed

    private void playLevelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playLevelBtnActionPerformed
        cs319.main.window.getContentPane().removeAll();

        selectLevelPanel selectLevel = new selectLevelPanel();
        //Generated.Board boardGame= new Generated.Board(11,5,0,"1");
        cs319.main.window.add(selectLevel);              
        cs319.main.window.revalidate();
        cs319.main.window.repaint();

        System.out.println("Going back to main menu");
    }//GEN-LAST:event_playLevelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton playLevelBtn;
    private javax.swing.JButton randomBtn;
    private javax.swing.JButton storyBtn;
    // End of variables declaration//GEN-END:variables
}
