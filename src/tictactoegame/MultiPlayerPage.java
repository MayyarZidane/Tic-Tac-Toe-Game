/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tictactoegame;

import java.awt.Font;

/**
 *
 * @author Mayyar
 */
public class MultiPlayerPage extends javax.swing.JPanel implements ResetFont {

    /**
     * Creates new form MultiPlayerPage
     */
    public MultiPlayerPage() {
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

        playerXLabel = new javax.swing.JLabel();
        playerOLabel = new javax.swing.JLabel();
        playerXField = new javax.swing.JTextField();
        playerOField = new javax.swing.JTextField();
        multiPlayerStartBtn = new javax.swing.JButton();
        multiPlayerBackBtn = new javax.swing.JButton();

        playerXLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        playerXLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerXLabel.setText("Player X");

        playerOLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        playerOLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerOLabel.setText("Player O");

        playerXField.setText("Player 1");

        playerOField.setText("Player 2");

        multiPlayerStartBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        multiPlayerStartBtn.setText("Start");

        multiPlayerBackBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        multiPlayerBackBtn.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(multiPlayerBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerXField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerOField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(multiPlayerStartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerXLabel)
                    .addComponent(playerXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerOLabel)
                    .addComponent(playerOField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(multiPlayerStartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(multiPlayerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton multiPlayerBackBtn;
    private javax.swing.JButton multiPlayerStartBtn;
    private javax.swing.JTextField playerOField;
    private javax.swing.JLabel playerOLabel;
    private javax.swing.JTextField playerXField;
    private javax.swing.JLabel playerXLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFontSize(FontSizes fontSize) {
        multiPlayerBackBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        multiPlayerStartBtn.setFont(new Font("Arail", Font.PLAIN, fontSize.getFontSize()));
        playerOLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
        playerXLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
    }
}
