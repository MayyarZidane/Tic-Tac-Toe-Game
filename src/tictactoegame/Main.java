package tictactoegame;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Mayyar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    SettingsPage settingsPage;
    SinglePlayerPage singlePlayerPage;
    MultiPlayerPage multiPlayerPage;
    GamePage gamePage;
    StartPage startPage;
    CardLayout cardLayout;
    Container container;

    public Main() {
        initComponents();
        container = this.getContentPane();
        cardLayout = new CardLayout();

        container.setLayout(cardLayout);
        creatAndShowStartPage();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setMaximumSize(new java.awt.Dimension(400, 550));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void creatAndShowStartPage() {
        startPage = new StartPage();
        startPage.SinglePlayerBtn.addActionListener(singlePlayerBtnListener);
        startPage.multiPlayerBtn.addActionListener(multiPlayerBtnListener);
        
        container.getLayout().addLayoutComponent("startPage", startPage);
        container.add(startPage);
        cardLayout.show(container, "startPage");
    }
    
    private void creatAndShowSinglePlayerPage (){
        singlePlayerPage = new SinglePlayerPage();
        singlePlayerPage.singlePlayerStartBtn.addActionListener(singlePlayerStartBtnListener);
        container.getLayout().addLayoutComponent("singlePlayerPage", singlePlayerPage);
        container.add(singlePlayerPage);
        cardLayout.show(container, "singlePlayerPage");
    }
//start page buttons listener
    ActionListener singlePlayerBtnListener = (evt) -> {
        creatAndShowSinglePlayerPage();
    };

     ActionListener multiPlayerBtnListener = (evt) -> {
        multiPlayerPage = new MultiPlayerPage();

        container.getLayout().addLayoutComponent("multiPlayerPage", multiPlayerPage);
        container.add(multiPlayerPage);
        cardLayout.show(container, "multiPlayerPage");
    };
     //single page listener
     ActionListener singlePlayerStartBtnListener = (evt) -> {
         gamePage = new GamePage();
         container.getLayout().addLayoutComponent("gamePage", gamePage);
         container.add(gamePage);
         cardLayout.show(container, "gamePage");
     };
    //settings page listener
    ItemListener fontSizeItemListener = (e) -> {
        if (e.getItemSelectable().equals(settingsPage.fontSizeComboBox.getItemAt(0))) {
            settingsPage.setFontSize(FontSizes.SMALL);
        } else if (e.getItemSelectable().equals(settingsPage.fontSizeComboBox.getItemAt(1))) {
            settingsPage.setFontSize(FontSizes.MEDUIM);
        } else {
            settingsPage.setFontSize(FontSizes.LARGE);
        }
    };


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
