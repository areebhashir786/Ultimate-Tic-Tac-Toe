package gui;

import java.util.Random;

public class Board {

    int[][] board = new int[3][3];

    public Board() {

    }

    // initialize all board values with 2
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 2;
            }
        }
    }

    public int getBoardValue(int i, int j) {
        return board[i][j];
    }

    public void setBoardValue(int i, int j, int value) {
        board[i][j] = value;
    }

    public int possibleWin(int player) {
        if (player == 1) {
            for (int i = 0; i < 3; i++) {   // check 1st 3 rows
                if (board[i][0] * board[i][1] * board[i][2] == 18) {
                    if (board[i][0] == 2) {
                        return (i * 3 + 1);
                    } else if (board[i][0] == 2) {
                        return (i * 3 + 2);
                    } else {
                        return (i * 3 + 3);
                    }
                }
            }
            for (int j = 0; j < 3; j++) {   // check 1st 3 columns
                if (board[0][j] * board[1][j] * board[2][j] == 18) {    // 3*3*2
                    if (board[0][j] == 2) {
                        return (1 + j);
                    } else if (board[1][j] == 2) {
                        return (4 + j);
                    } else {
                        return (7 + j);
                    }
                }
            }
            // check left diagonal
            if (board[0][0] * board[1][1] * board[2][2] == 18) {
                if (board[0][0] == 2) {
                    return (1);
                } else if (board[1][1] == 2) {
                    return (5);
                } else {
                    return (9);
                }
            }
            // check right diagonal
            if (board[0][2] * board[1][1] * board[2][0] == 18) {
                if (board[0][2] == 2) {
                    return (3);
                } else if (board[1][1] == 2) {
                    return (5);
                } else {
                    return (7);
                }
            }

        } else { // player 2
            for (int i = 0; i < 3; i++) { // check rows
                if (board[i][0] * board[i][1] * board[i][2] == 50) { // // 5*5*2
                    if (board[i][0] == 2) {
                        return (i * 3 + 1);
                    } else if (board[i][0] == 2) {
                        return (i * 3 + 2);
                    } else {
                        return (i * 3 + 3);
                    }
                }
            }
            for (int j = 0; j < 3; j++) { // check columns
                if (board[0][j] * board[1][j] * board[2][j] == 50) {
                    if (board[0][j] == 2) {
                        return (1 + j);
                    } else if (board[1][j] == 2) {
                        return (4 + j);
                    } else {
                        return (7 + j);
                    }
                }
            }
            // check left diagonal
            if (board[0][0] * board[1][1] * board[2][2] == 50) {
                if (board[0][0] == 2) {
                    return (1);
                } else if (board[1][1] == 2) {
                    return (5);
                } else {
                    return (9);
                }
            }
            // check right diagonal
            if (board[0][2] * board[1][1] * board[2][0] == 50) {
                if (board[0][2] == 2) {
                    return (3);
                } else if (board[1][1] == 2) {
                    return (5);
                } else {
                    return (7);
                }
            }
        }
        return 0;
    }

    public boolean checkWin(int player) {
        if (player == 1) {
            for (int i = 0; i < 3; i++) {   // Check Rows
                if (board[i][0] * board[i][1] * board[i][2] == 27) {
                    return true;
                }
            }
            for (int j = 0; j < 3; j++) {   // Check Columns
                if (board[0][j] * board[1][j] * board[2][j] == 27) {
                    return true;
                }
            }
            // check left Diagonal
            if (board[0][0] * board[1][1] * board[2][2] == 27) {
                return true;
            }
            // check Right Diagonal
            if (board[0][2] * board[1][1] * board[2][0] == 27) {
                return true;
            }
        } else {       // Player 2 
            for (int i = 0; i < 3; i++) {   // Check Rows
                if (board[i][0] * board[i][1] * board[i][2] == 125) {
                    return true;
                }
            }
            for (int j = 0; j < 3; j++) {   // Check Columns
                if (board[0][j] * board[1][j] * board[2][j] == 125) {
                    return true;
                }
            }   //Check left Diagonal
            if (board[0][0] * board[1][1] * board[2][2] == 125) {
                return true;
            }
            // check right diagonal
            if (board[0][2] * board[1][1] * board[2][0] == 125) {
                return true;
            }
        }
        return false;
    }

    // check if board value is 2 or not 
    public boolean isBoardFilled() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public int randomBlankButton() {
        int count = 0, s = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 2) {
                    count++;
                }
            }
        }
        int r = 1 + (int) (Math.random() * count);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 2) {
                    s++;
                    if (r == s) {
                        if (i == 0 & j == 0) {
                            return 1;
                        }
                        if (i == 0 & j == 1) {
                            return 2;
                        }
                        if (i == 0 & j == 2) {
                            return 3;
                        }
                        if (i == 1 & j == 0) {
                            return 4;
                        }
                        if (i == 1 & j == 1) {
                            return 5;
                        }
                        if (i == 1 & j == 2) {
                            return 6;
                        }
                        if (i == 2 & j == 0) {
                            return 7;
                        }
                        if (i == 2 & j == 1) {
                            return 8;
                        }
                        if (i == 2 & j == 2) {
                            return 9;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
