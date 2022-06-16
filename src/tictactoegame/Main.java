package tictactoegame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author PC
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
    Player xPlayer;
    Player oPlayer;
    FontSizes fontSize = FontSizes.MEDUIM;

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
    private void initComponents() {//GEN-BEGIN:initComponents

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setResizable(false);

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
    }//GEN-END:initComponents
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
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    private void creatAndShowStartPage() {
        startPage = new StartPage();
        startPage.SinglePlayerBtn.addActionListener(singlePlayerBtnListener);
        startPage.multiPlayerBtn.addActionListener(multiPlayerBtnListener);
        startPage.settingsBtn.addActionListener(settingsBtnListener);
        container.getLayout().addLayoutComponent("startPage", startPage);
        container.add(startPage);
        cardLayout.show(container, "startPage");
    }

    private void creatAndShowSinglePlayerPage() {
        singlePlayerPage = new SinglePlayerPage();
        singlePlayerPage.setFontSize(fontSize);
        singlePlayerPage.singlePlayerStartBtn.addActionListener(singlePlayerStartBtnListener);
        singlePlayerPage.singlePlayerBackBtn.addActionListener(singlePlayerBackBtnListener);

        container.getLayout().addLayoutComponent("singlePlayerPage", singlePlayerPage);
        container.add(singlePlayerPage);
        cardLayout.show(container, "singlePlayerPage");
    }

    private void creatAndShowMultiPlayerPage() {
        multiPlayerPage = new MultiPlayerPage();
        multiPlayerPage.setFontSize(fontSize);
        multiPlayerPage.multiPlayerBackBtn.addActionListener(multiPlayerBackBtnListener);
        multiPlayerPage.multiPlayerStartBtn.addActionListener(multiPlayerStartBtnListener);

        container.getLayout().addLayoutComponent("multiPlayerPage", multiPlayerPage);
        container.add(multiPlayerPage);
        cardLayout.show(container, "multiPlayerPage");
    }

    private void creatAndShowSettingsPage() {
        settingsPage = new SettingsPage();
        settingsPage.settingsBackBtn.addActionListener(settingsBackBtnListener);
        settingsPage.fontSizeComboBox.addItemListener(fontSizeItemListener);

        container.getLayout().addLayoutComponent("settingsPage", settingsPage);
        container.add(settingsPage);
        cardLayout.show(container, "settingsPage");
    }

    private void creatAndShowGamePage() {
        gamePage = new GamePage();
        gamePage.gamePageBackBtn.addActionListener(gamePageBackBtnListener);
        gamePage.addBoardLabels();
        setBoardLabelsListener();
        gamePage.xPlayerNameLabel.setText(xPlayer.getName());
        if (oPlayer != null) {
            gamePage.oPlayerNameLabel.setText(oPlayer.getName());
        }
        container.getLayout().addLayoutComponent("gamePage", gamePage);
        container.add(gamePage);
        cardLayout.show(container, "gamePage");
    }

    private void setBoardLabelsListener() {
        gamePage.boardLabels[0].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[1].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[2].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[3].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[4].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[5].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[6].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[7].addMouseListener(boardLabelsListener);
        gamePage.boardLabels[8].addMouseListener(boardLabelsListener);
    }
//start page listener
    ActionListener singlePlayerBtnListener = (evt) -> {
        creatAndShowSinglePlayerPage();
    };

    ActionListener multiPlayerBtnListener = (evt) -> {
        creatAndShowMultiPlayerPage();
    };

    ActionListener settingsBtnListener = (evt) -> {
        creatAndShowSettingsPage();
    };
    //single page listener
    ActionListener singlePlayerStartBtnListener = (evt) -> {
        xPlayer = new Player(0, singlePlayerPage.playerNameField.getText(), true, 'X');
        creatAndShowGamePage();
    };

    ActionListener singlePlayerBackBtnListener = (evt) -> {
        singlePlayerPage = null;
        cardLayout.show(container, "startPage");
    };

    //multi page listener
    ActionListener multiPlayerStartBtnListener = (evt) -> {
        xPlayer = new Player(0, multiPlayerPage.playerXField.getText(), true, 'X');
        oPlayer = new Player(0, multiPlayerPage.playerOField.getText(), false, 'O');
        creatAndShowGamePage();
    };

    ActionListener multiPlayerBackBtnListener = (evt) -> {
        multiPlayerPage = null;
        cardLayout.show(container, "startPage");
    };
    //settings page listener
    ItemListener fontSizeItemListener = (e) -> {

        if (e.getItem().equals(settingsPage.fontSizeComboBox.getItemAt(0))) {
            fontSize = FontSizes.SMALL;
        } else if (e.getItem().equals(settingsPage.fontSizeComboBox.getItemAt(1))) {
            fontSize = FontSizes.MEDUIM;
        } else {
            fontSize = FontSizes.LARGE;
        }
        startPage.setFontSize(fontSize);
        settingsPage.setFontSize(fontSize);
    };

    ActionListener settingsBackBtnListener = (evt) -> {
        settingsPage = null;
        cardLayout.show(container, "startPage");
    };
    //game page listener
    ActionListener gamePageBackBtnListener = (evt) -> {
        gamePage = null;
        xPlayer = null;
        oPlayer = null;
        if (singlePlayerPage != null) {
            cardLayout.show(container, "singlePlayerPage");
        } else {
            cardLayout.show(container, "multiPlayerPage");
        }
    };

    MouseListener boardLabelsListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (((JLabel) e.getSource()).getText().equals("")) {
                if (xPlayer.isPlayerTurn()) {
                    ((JLabel) e.getSource()).setForeground(xPlayer.getColorIcon());
                    ((JLabel) e.getSource()).setText("" + xPlayer.getPlayerIcon());
                    xPlayer.setPlayerTurn(false);

                    gamePage.xPlayerNameLabel.setForeground(Color.BLACK);
                    gamePage.oPlayerNameLabel.setForeground(Color.red);
                    System.out.println("x turn");
                } else if (oPlayer != null) {
                    ((JLabel) e.getSource()).setText("" + oPlayer.getPlayerIcon());
                    ((JLabel) e.getSource()).setForeground(oPlayer.getColorIcon());
                    xPlayer.setPlayerTurn(true);
                    System.out.println("o turn");
                    gamePage.oPlayerNameLabel.setForeground(Color.BLACK);
                    gamePage.xPlayerNameLabel.setForeground(Color.blue);
                } 
                if(oPlayer == null && !xPlayer.isPlayerTurn()) {
                    int randomBoardLabel = new Random().nextInt(9);
                    while (true) {
                        if (gamePage.boardLabels[randomBoardLabel].getText().equals("")) {
                            gamePage.boardLabels[randomBoardLabel].setText("O");
                            gamePage.boardLabels[randomBoardLabel].setForeground(Color.red);
                            System.out.println("computer turn");
                            gamePage.oPlayerNameLabel.setForeground(Color.BLACK);
                            gamePage.xPlayerNameLabel.setForeground(Color.blue);
                            xPlayer.setPlayerTurn(true);
                            break;
                        } else {
                            randomBoardLabel = new Random().nextInt(9);
                        }

                    }
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
