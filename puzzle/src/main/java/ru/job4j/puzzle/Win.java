package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

        public static boolean monoVertical(int[][] board, int column) {
            boolean result = true;
            for (int in = 0; in < board[column].length; in++) {
                if (board[in][column] != 1) {
                    result = false;
                    break;
                }
            }
            return result;
        }

                public static boolean check(int[][] board) {
                    boolean rsl = false;
                    for (int index = 0; index < board.length; index++) {
                        if (board[index][index] == 1 && (monoHorizontal(board, index) || monoVertical(board, index))) {
                           rsl = true;
                            break;
                        }
                    }
                    return rsl;
                }
            }



