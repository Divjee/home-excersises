package io.codelex.arrays.practice.tictac;

import java.util.Scanner;

public class TicTacToe extends TicTacToe1 {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initBoard();


        while (true) {

            Scanner in = new Scanner(System.in);
            if (isGameFinished(board)) {
                System.out.println("The board is full");
            }
            displayBoard();
            player1(board, in, 'X');
            if (hasWon(board, 'X')) {
                System.out.println("Player ONE has WON!");

                displayBoard();
                break;
            }
            if (isGameFinished(board)) {
                System.out.println("The board is full");
            }
            displayBoard();
            player2(board, in, 'O');
            if (hasWon(board, 'O')) {
                System.out.println("Player TWO has WON!");
                displayBoard();
                break;
            }
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }
    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


}