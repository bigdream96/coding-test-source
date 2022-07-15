package com.codingtest.source.programmers.p64061;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int[] basket = new int[moves.length];
        int i = 0;
        for (int move : moves) {
            for (int j = 0; j < board[0].length; j++) {
                int v = board[j][move - 1];

                if (v > 0) {
                    basket[i++] = v;
                    board[j][move - 1] = 0;
                    break;
                }
            }

            if (i > 1 && basket[i - 1] == basket[i - 2]) {
                answer += 2;
                basket[i - 1] = 0;
                basket[i - 2] = 0;
                i -= 2;
            }
        }

        return answer;
    }
}