package gui;

import javax.swing.*;
import java.awt.*;

public class UltimateTicTacToe {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Ultimate Tic Tac Toe!\n\n Human VS Computer: - 9*9 Tic Tac Toe \n\nEnjoy!", "Welcome to Ultimate Tic Tac Toe!", JOptionPane.PLAIN_MESSAGE);
        Game game = new Game();
        game.setPlayer(1);  // Select X player

    }
}
