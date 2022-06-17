/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tictactoegame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Mayyar
 */
public class GamePage extends javax.swing.JPanel implements ResetFont {

    /**
     * Creates new form GamePage
     */
    private boolean gameEnd;
    private int numberOfClick;

    public int getNumberOfClick() {
        return numberOfClick;
    }

    public void increaseNumberOfClick() {
        this.numberOfClick += 1;
    }
    public boolean isGameEnd() {
        return gameEnd;
    }

    public void setGameEnd(boolean gameEnd) {
        this.gameEnd = gameEnd;
    }

    public GamePage() {
        initComponents();
    }

    public void addBoardLabels() {
        boardLabels = new JLabel[9];

        for (int i = 0; i < boardLabels.length; i++) {
            boardLabels[i] = new JLabel("", JLabel.CENTER);
            boardLabels[i].setBackground(Color.YELLOW);
            boardLabels[i].setFont(new Font("Arail", Font.BOLD, 40));
            boardLabelsPanel.add(boardLabels[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        xPlayerNameLabel = new javax.swing.JLabel();
        xPlayerScore = new javax.swing.JLabel();
        oPlayerNameLabel = new javax.swing.JLabel();
        oPlayerScore = new javax.swing.JLabel();
        vsSymbolLabel = new javax.swing.JLabel();
        boardBackgroundLabel = new javax.swing.JLabel();
        boardLabelsPanel = new javax.swing.JPanel();
        restartGameBtn = new javax.swing.JButton();
        gamePageBackBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(400, 550));
        setMinimumSize(new java.awt.Dimension(400, 550));
        setPreferredSize(new java.awt.Dimension(400, 550));
        setLayout(null);

        xPlayerNameLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        xPlayerNameLabel.setForeground(java.awt.Color.blue);
        xPlayerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xPlayerNameLabel.setText("X - player");
        add(xPlayerNameLabel);
        xPlayerNameLabel.setBounds(6, 25, 150, 19);

        xPlayerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xPlayerScore.setText("0");
        add(xPlayerScore);
        xPlayerScore.setBounds(35, 71, 71, 16);

        oPlayerNameLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        oPlayerNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oPlayerNameLabel.setText("O - player");
        add(oPlayerNameLabel);
        oPlayerNameLabel.setBounds(246, 25, 150, 19);

        oPlayerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oPlayerScore.setText("0");
        add(oPlayerScore);
        oPlayerScore.setBounds(296, 71, 69, 16);

        vsSymbolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vsSymbolLabel.setText("X");
        add(vsSymbolLabel);
        vsSymbolLabel.setBounds(178, 49, 54, 16);

        boardBackgroundLabel.setBackground(new java.awt.Color(255, 255, 255));
        boardBackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boardBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoegame/images/board1.png"))); // NOI18N
        add(boardBackgroundLabel);
        boardBackgroundLabel.setBounds(35, 141, 300, 300);

        boardLabelsPanel.setFocusable(false);
        boardLabelsPanel.setMinimumSize(new java.awt.Dimension(270, 270));
        boardLabelsPanel.setLayout(new java.awt.GridLayout(3, 8, 25, 27));
        add(boardLabelsPanel);
        boardLabelsPanel.setBounds(35, 141, 300, 300);

        restartGameBtn.setText("Restart");
        add(restartGameBtn);
        restartGameBtn.setBounds(240, 510, 140, 30);

        gamePageBackBtn.setText("Back");
        add(gamePageBackBtn);
        gamePageBackBtn.setBounds(20, 510, 140, 30);
    }//GEN-END:initComponents

    public javax.swing.JLabel[] boardLabels;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel boardBackgroundLabel;
    private javax.swing.JPanel boardLabelsPanel;
    public javax.swing.JButton gamePageBackBtn;
    public javax.swing.JLabel oPlayerNameLabel;
    private javax.swing.JLabel oPlayerScore;
    public javax.swing.JButton restartGameBtn;
    private javax.swing.JLabel vsSymbolLabel;
    public javax.swing.JLabel xPlayerNameLabel;
    private javax.swing.JLabel xPlayerScore;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFontSize(FontSizes fontSize) {
        oPlayerScore.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        xPlayerScore.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        vsSymbolLabel.setFont(new Font("Arail", Font.PLAIN, (fontSize.getFontSize() - 2)));
        xPlayerNameLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
        oPlayerNameLabel.setFont(new Font("Arail", Font.BOLD, (fontSize.getFontSize() + 2)));
    }

    public void checkIfThereIsAWinner() {
        char winnerIconPlayer;
        if (boardLabels[0].getText().equals(boardLabels[1].getText()) && boardLabels[0].getText().equals(boardLabels[2].getText()) && !boardLabels[0].getText().equals("")) {
            winnerIconPlayer = boardLabels[0].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[0], boardLabels[1], boardLabels[2]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[3].getText().equals(boardLabels[4].getText()) && boardLabels[3].getText().equals(boardLabels[5].getText()) && !boardLabels[3].getText().equals("")) {
            winnerIconPlayer = boardLabels[3].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[3], boardLabels[4], boardLabels[5]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[6].getText().equals(boardLabels[7].getText()) && boardLabels[6].getText().equals(boardLabels[8].getText()) && !boardLabels[6].getText().equals("")) {
            winnerIconPlayer = boardLabels[6].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[6], boardLabels[7], boardLabels[8]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[0].getText().equals(boardLabels[3].getText()) && boardLabels[0].getText().equals(boardLabels[6].getText()) && !boardLabels[0].getText().equals("")) {
            winnerIconPlayer = boardLabels[0].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[0], boardLabels[3], boardLabels[6]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[1].getText().equals(boardLabels[4].getText()) && boardLabels[1].getText().equals(boardLabels[7].getText()) && !boardLabels[1].getText().equals("")) {
            winnerIconPlayer = boardLabels[1].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[1], boardLabels[4], boardLabels[7]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[2].getText().equals(boardLabels[5].getText()) && boardLabels[2].getText().equals(boardLabels[8].getText()) && !boardLabels[2].getText().equals("")) {
            winnerIconPlayer = boardLabels[2].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[2], boardLabels[5], boardLabels[8]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        }else if (boardLabels[0].getText().equals(boardLabels[4].getText()) && boardLabels[0].getText().equals(boardLabels[8].getText()) && !boardLabels[0].getText().equals("")) {
            winnerIconPlayer = boardLabels[0].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[0], boardLabels[4], boardLabels[8]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        } else if (boardLabels[2].getText().equals(boardLabels[4].getText()) && boardLabels[2].getText().equals(boardLabels[6].getText()) && !boardLabels[2].getText().equals("")) {
            winnerIconPlayer = boardLabels[2].getText().charAt(0);
            changeWinnerLabelsColor(boardLabels[2], boardLabels[4], boardLabels[6]);
            changeScore(winnerIconPlayer);
            setGameEnd(true);
        }
        
    }

    private void changeWinnerLabelsColor(JLabel label1, JLabel label2, JLabel label3) {
        label1.setForeground(Color.YELLOW);
        label2.setForeground(Color.YELLOW);
        label3.setForeground(Color.YELLOW);
        repaint();
    }

    private void changeScore(char winnerIconPlayer) {
        if (winnerIconPlayer == 'X') {
            xPlayerScore.setText((Integer.parseInt(xPlayerScore.getText()) + 1 + ""));
        } else {
            oPlayerScore.setText((Integer.parseInt(oPlayerScore.getText()) + 1 + ""));
        }        
    }
}
