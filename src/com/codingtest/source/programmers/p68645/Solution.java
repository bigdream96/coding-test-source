package com.codingtest.source.programmers.p68645;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] answer = solution.solution(4);
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2];
        int[][] arr = new int[n][n];

        int x = -1;
        int y = 0;
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = value++;
            }
        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0)
                    break;

                answer[idx++] = arr[i][j];
            }
        }

        return answer;
    }
}