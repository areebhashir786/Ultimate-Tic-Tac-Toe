/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.sun.media.jfxmedia.events.PlayerEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Game implements ActionListener {

    public int player = 1;
    int winBoard1 = 0;
    int winBoard2 = 0;
    String playerName = "";
    public Board board1;
    public Board board2;
    public Board board3;
    public Board board4;
    public Board board5;
    public Board board6;
    public Board board7;
    public Board board8;
    public Board board9;

    JFrame f;
    JLabel l;
    JButton[][] b1;
    JButton[][] b2;
    JButton[][] b3;
    JButton[][] b4;
    JButton[][] b5;
    JButton[][] b6;
    JButton[][] b7;
    JButton[][] b8;
    JButton[][] b9;

    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JPanel p7;
    JPanel p8;
    JPanel p9;

    protected int xScore =0;
    protected int oScore =0;

    public void setPlayer(int value) {
        player = value;
    }

    Game() {

        f = new JFrame("Ultimate Tic Tac Toe");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3, 3));
        f.setBackground(Color.DARK_GRAY);
        f.setSize(550, 600);
        f.setVisible(true);
        playerName = JOptionPane.showInputDialog(f, "Please enter player 1 name", "Specify name", JOptionPane.PLAIN_MESSAGE);

        board1 = new Board();
        board2 = new Board();
        board3 = new Board();
        board4 = new Board();
        board5 = new Board();
        board6 = new Board();
        board7 = new Board();
        board8 = new Board();
        board9 = new Board();

        board1.initializeBoard();
        board2.initializeBoard();
        board3.initializeBoard();
        board4.initializeBoard();
        board5.initializeBoard();
        board6.initializeBoard();
        board7.initializeBoard();
        board8.initializeBoard();
        board9.initializeBoard();

        b1 = new JButton[3][3];
        b2 = new JButton[3][3];
        b3 = new JButton[3][3];
        b4 = new JButton[3][3];
        b5 = new JButton[3][3];
        b6 = new JButton[3][3];
        b7 = new JButton[3][3];
        b8 = new JButton[3][3];
        b9 = new JButton[3][3];

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                b1[i][j] = new JButton();
                b2[i][j] = new JButton();
                b3[i][j] = new JButton();
                b4[i][j] = new JButton();
                b5[i][j] = new JButton();
                b6[i][j] = new JButton();
                b7[i][j] = new JButton();
                b8[i][j] = new JButton();
                b9[i][j] = new JButton();

                b1[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b1[a][b]) {
                                    checkHandle(a, b, board1, b1);
                                }
                            }
                        }
                    }
                });
                b2[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b2[a][b]) {
                                    checkHandle(a, b, board2, b2);
                                }
                            }
                        }
                    }
                });
                b3[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b3[a][b]) {
                                    checkHandle(a, b, board3, b3);
                                }
                            }
                        }
                    }
                });
                b4[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b4[a][b]) {
                                    checkHandle(a, b, board4, b4);
                                }
                            }
                        }
                    }
                });
                b5[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b5[a][b]) {
                                    checkHandle(a, b, board5, b5);
                                }
                            }
                        }
                    }
                });
                b6[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b6[a][b]) {
                                    checkHandle(a, b, board6, b6);
                                }
                            }
                        }
                    }
                });
                b7[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b7[a][b]) {
                                    checkHandle(a, b, board7, b7);
                                }
                            }
                        }
                    }
                });
                b8[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b8[a][b]) {
                                    checkHandle(a, b, board8, b8);
                                }
                            }
                        }
                    }
                });
                b9[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int a = 0; a < 3; a++) {
                            for (int b = 0; b < 3; b++) {
                                if (e.getSource() == b9[a][b]) {
                                    checkHandle(a, b, board9, b9);
                                }
                            }
                        }
                    }
                });

                p1.add(b1[i][j]);
                p2.add(b2[i][j]);
                p3.add(b3[i][j]);
                p4.add(b4[i][j]);
                p5.add(b5[i][j]);
                p6.add(b6[i][j]);
                p7.add(b7[i][j]);
                p8.add(b8[i][j]);
                p9.add(b9[i][j]);

            }
        }

        // Add Panels
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);
        f.add(p8);
        f.add(p9);

        //  Set Borders of Panel
        Border lineThickerBorder = BorderFactory.createLineBorder(Color.GREEN, 3);
        p1.setBorder(lineThickerBorder);
        p2.setBorder(lineThickerBorder);
        p3.setBorder(lineThickerBorder);
        p4.setBorder(lineThickerBorder);
        p5.setBorder(lineThickerBorder);
        p6.setBorder(lineThickerBorder);
        p7.setBorder(lineThickerBorder);
        p8.setBorder(lineThickerBorder);
        p9.setBorder(lineThickerBorder);

        //Set Layouts of panel
        p1.setLayout(new GridLayout(3, 3));
        p2.setLayout(new GridLayout(3, 3));
        p3.setLayout(new GridLayout(3, 3));
        p4.setLayout(new GridLayout(3, 3));
        p5.setLayout(new GridLayout(3, 3));
        p6.setLayout(new GridLayout(3, 3));
        p7.setLayout(new GridLayout(3, 3));
        p8.setLayout(new GridLayout(3, 3));
        p9.setLayout(new GridLayout(3, 3));
    }

    void checkHandle(int i, int j, Board bord, JButton[][] bt) {
        if (player == 1) {
            bord.setBoardValue(i, j, 3);
            this.refereshBoardDisplay(bord, bt);
            if (bord.checkWin(1)) {
                winBoard1++;
                xScore = xScore * winBoard1;
                //System. out. flush();
                System.out.println("player 1 Score : "+xScore);
                if (winBoard1 != 3) {
                    JOptionPane.showMessageDialog(this.f, "Congrats, You Win\nThis Board will be counted as " + playerName);
                }
                if (winBoard1 == 3) {
                    JOptionPane.showMessageDialog(this.f, "Congrats " + playerName + ", You Win the Game");
                    //bord.initializeBoard();
                    //this.refereshBoardDisplay(bord, bt);
                    System.exit(0);
                }
                setPlayer(1);

            } else if (bord.isBoardFilled()) {
                JOptionPane.showMessageDialog(this.f, "Game Draw");
                //bord.initializeBoard();
                //this.refereshBoardDisplay(bord, bt);
                setPlayer(1);
            } else {
                setPlayer(3 - player);
                playComputer(bord, bt);
            }
        } else {   // Player 2
            bord.setBoardValue(i, j, 5);
            this.refereshBoardDisplay(bord, bt);
            if (bord.checkWin(1)) {
                winBoard1++;
                xScore = xScore + 10;
                //System. out. flush();
                System.out.println("player 1 Score : "+xScore);
                if (winBoard1 != 3) {
                    JOptionPane.showMessageDialog(this.f, "Congrats, You Win\nThis Board will be counted as " + playerName);
                }
                if (winBoard1 == 3) {
                    JOptionPane.showMessageDialog(this.f, "Congrats " + playerName + ", You Win the Game");
                    //bord.initializeBoard();
                    //this.refereshBoardDisplay(bord, bt);
                    System.exit(0);
                }
                setPlayer(2);

            } else if (bord.isBoardFilled()) {
                JOptionPane.showMessageDialog(this.f, "Game Draw");
                //bord.initializeBoard();
                //this.refereshBoardDisplay(bord, bt);
                setPlayer(2);
            } else {
                setPlayer(3 - player);
                playComputer(bord, bt);
            }
        }
    }

    public void playComputer(Board b, JButton[][] bt) {
        int buttonNumber = 0;
        //1.)  buttonNumber = possibleWin(player);
        //      if(buttonNumber!=0) play move
          buttonNumber = b.possibleWin(player);

        //2.)  buttonNumber = possibleWin(3-player);
        //      if(buttonNumber!=0) play move
        if (buttonNumber == 0) {
                 buttonNumber = b.possibleWin(3 - player);
        }
        //3.)  buttonNumber = randomBlankButton();
        if (buttonNumber == 0) {
            buttonNumber = b.randomBlankButton();
        }

        if (buttonNumber != 0) {
            switch (buttonNumber) {
                case 1:
                    if (player == 1) {
                        b.setBoardValue(0, 0, 3);
                    } else {
                        b.setBoardValue(0, 0, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 2:
                    if (player == 1) {
                        b.setBoardValue(0, 1, 3);
                    } else {
                        b.setBoardValue(0, 1, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 3:
                    if (player == 1) {
                        b.setBoardValue(0, 2, 3);
                    } else {
                        b.setBoardValue(0, 2, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 4:
                    if (player == 1) {
                        b.setBoardValue(1, 0, 3);
                    } else {
                        b.setBoardValue(1, 0, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 5:
                    if (player == 1) {
                        b.setBoardValue(1, 1, 3);
                    } else {
                        b.setBoardValue(1, 1, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 6:
                    if (player == 1) {
                        b.setBoardValue(1, 2, 3);
                    } else {
                        b.setBoardValue(1, 2, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 7:
                    if (player == 1) {
                        b.setBoardValue(2, 0, 3);
                    } else {
                        b.setBoardValue(2, 0, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 8:
                    if (player == 1) {
                        b.setBoardValue(2, 1, 3);
                    } else {
                        b.setBoardValue(2, 1, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
                case 9:
                    if (player == 1) {
                        b.setBoardValue(2, 2, 3);
                    } else {
                        b.setBoardValue(2, 2, 5);
                    }
                    this.refereshBoardDisplay(b, bt);
                    break;
            }
            if (b.checkWin(player)) {
                winBoard2++;
                oScore = oScore + 10;                
                System.out.println("player 2 Score : "+oScore);
                if(winBoard2!=3)
                JOptionPane.showMessageDialog(this.f, "Computer Won the Game");
                if(winBoard2==3){
                    JOptionPane.showMessageDialog(this.f, "You lose the Game");
                    System.exit(0);
                }
                //b.initializeBoard();
                //this.refereshBoardDisplay(b, bt);
                setPlayer(1);
            } else if (b.isBoardFilled()) {
                JOptionPane.showMessageDialog(this.f, "Game Draw");
               // b.initializeBoard();
               // this.refereshBoardDisplay(b, bt);
                setPlayer(1);
            } else {
                setPlayer(3 - player);
            }
        }
    }

    public void refereshBoardDisplay(Board b, JButton[][] bt) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (b.getBoardValue(i, j)) {
                    case 2:
                        bt[i][j].setEnabled(true);
                        bt[i][j].setText("");
                        break;
                    case 3:
                        bt[i][j].setEnabled(false);
                        bt[i][j].setText("X");
                        Font f = new Font("Times New Roman", Font.BOLD, 18);
                        bt[i][j].setFont(f);
                        bt[i][j].setBackground(Color.BLUE);
                        break;
                    case 5:
                        bt[i][j].setEnabled(false);
                        bt[i][j].setText("O");
                        Font f1 = new Font("Times New Roman", Font.BOLD, 18);
                        bt[i][j].setFont(f1);
                        bt[i][j].setBackground(Color.yellow);
                        break;
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
