package All_tests;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToeAI_GUI extends JFrame implements ActionListener {
    private final JButton[][] buttons = new JButton[3][3];
    private final char currentPlayer = 'X';  // Human always starts
    private int xScore = 0, oScore = 0;

    private final JLabel scoreLabel = new JLabel("Score - DeatHerTZ (X): 0 | Computer (O): 0");

    public TicTacToeAI_GUI() {
        setTitle("Tic Tac Toe vs Computer");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Board
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3));
        Font font = new Font("Arial", Font.BOLD, 60);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(font);
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        // Score label
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(scoreLabel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (!btn.getText().equals(" ")) return; // ignore if occupied

        btn.setText("X"); // Human move

        if (checkWin('X')) {
            xScore++;
            JOptionPane.showMessageDialog(this, "You win this round!");
            updateScore();
            checkGameOver('X');
            resetBoard();
            return;
        }

        if (isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            resetBoard();
            return;
        }

        // Computer move
        computerMove();

        if (checkWin('O')) {
            oScore++;
            JOptionPane.showMessageDialog(this, "Computer wins this round!");
            updateScore();
            checkGameOver('O');
            resetBoard();
            return;
        }

        if (isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            resetBoard();
        }
    }

    private void computerMove() {
        // 1. Try to win
        if (tryMove('O')) return;

        // 2. Block human's win
        if (tryMove('X')) return;

        // 3. Otherwise random move
        List<int[]> availableMoves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals(" ")) {
                    availableMoves.add(new int[]{i, j});
                }
            }
        }
        if (!availableMoves.isEmpty()) {
            Random rand = new Random();
            int[] move = availableMoves.get(rand.nextInt(availableMoves.size()));
            buttons[move[0]][move[1]].setText("O");
        }
    }

    private boolean tryMove(char player) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals(" ")) {
                    buttons[i][j].setText(String.valueOf(player));
                    if (checkWin(player)) {
                        if (player == 'X') { // block → reset to O
                            buttons[i][j].setText("O");
                        }
                        return true;
                    } else {
                        buttons[i][j].setText(" ");
                    }
                }
            }
        }
        return false;
    }

    private boolean checkWin(char player) {
        // Rows & Cols
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(player)) &&
                    buttons[i][1].getText().equals(String.valueOf(player)) &&
                    buttons[i][2].getText().equals(String.valueOf(player))) return true;

            if (buttons[0][i].getText().equals(String.valueOf(player)) &&
                    buttons[1][i].getText().equals(String.valueOf(player)) &&
                    buttons[2][i].getText().equals(String.valueOf(player))) return true;
        }

        // Diagonals
        if (buttons[0][0].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][2].getText().equals(String.valueOf(player))) return true;

        return buttons[0][2].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][0].getText().equals(String.valueOf(player));
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals(" ")) return false;
            }
        }
        return true;
    }

    private void updateScore() {
        scoreLabel.setText("Score - You (X): " + xScore + " | Computer (O): " + oScore);
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText(" ");
            }
        }
    }

    private void checkGameOver(char winner) {
        if (xScore == 3) {
            JOptionPane.showMessageDialog(this, "🎉 You win the GAME!");
            resetGame();
        } else if (oScore == 3) {
            JOptionPane.showMessageDialog(this, "💻 Computer wins the GAME!");
            resetGame();
        }
    }

    private void resetGame() {
        xScore = 0;
        oScore = 0;
        updateScore();
        resetBoard();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TicTacToeAI_GUI().setVisible(true);
        });
    }
}
