package com.codingtest.source.programmers.p12905;

class Solution {
    public int solution(int[][] board) {
        int answer = 1;

        if (isAllZeroNum(board))
            return 0;

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] != 0) {
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }

        return answer * answer;
    }

    boolean isAllZeroNum(int[][] board) {
        for (int[] line : board)
            for (int num : line)
                if (num != 0)
                    return false;

        return true;
    }
}