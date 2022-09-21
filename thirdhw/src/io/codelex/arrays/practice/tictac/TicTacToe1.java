package io.codelex.arrays.practice.tictac;

import java.util.Scanner;

public class TicTacToe1 {
    private static char[][] board = new char[3][3];


    public static void player1(char[][] board, Scanner in, char symbol) {
        String yourInput;
        while (true) {
            System.out.println("Player 1 turn");
            yourInput = in.nextLine();
            if (isValidMove(board, yourInput)) {
                break;
            } else {
                System.out.println("That spot is taken, try again");
            }
        }
        switch (yourInput) {
            case "00":
                board[0][0] = symbol;
                break;
            case "01":
                board[0][1] = symbol;
                break;
            case "02":
                board[0][2] = symbol;
                break;
            case "21":
                board[2][1] = symbol;
                break;
            case "10":
                board[1][0] = symbol;
                break;
            case "11":
                board[1][1] = symbol;
                break;
            case "12":
                board[1][2] = symbol;
                break;
            case "22":
                board[2][2] = symbol;
                break;
            case "20":
                board[2][0] = symbol;
                break;
            default:
                System.out.println(":9");
        }
    }

    public static void player2(char[][] board, Scanner in, char symbol) {
        String yourInput;
        while (true) {
            System.out.println("Player 2 turn");
            yourInput = in.nextLine();
            if (isValidMove(board, yourInput)) {
                break;
            } else {
                System.out.println("That spot is taken, try again");
            }

        }
        switch (yourInput) {
            case "00":
                board[0][0] = symbol;
                break;
            case "01":
                board[0][1] = symbol;
                break;
            case "02":
                board[0][2] = symbol;
                break;
            case "21":
                board[2][1] = symbol;
                break;
            case "10":
                board[1][0] = symbol;
                break;
            case "11":
                board[1][1] = symbol;
                break;
            case "12":
                board[1][2] = symbol;
                break;
            case "22":
                board[2][2] = symbol;
                break;
            case "20":
                board[2][0] = symbol;
                break;
            default:
                System.out.println(":9");
        }
    }

    public static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "00":
                if (board[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "01":
                if (board[0][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "02":
                if (board[0][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "21":
                if (board[2][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "10":
                if (board[1][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "11":
                if (board[1][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "12":
                if (board[1][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "22":
                if (board[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case "20":
                if (board[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    public static boolean hasWon(char[][] board, char symbol) {

        if (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
                board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
                board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol ||
                board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
                board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
                board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol ||
                board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol ||
                board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol)

            return true;

        else {
            return false;
        }
    }

    public static boolean isGameFinished(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}