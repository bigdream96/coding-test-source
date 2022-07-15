package com.codingtest.source.programmers.p1829;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] > 0) {
                    max = Math.max(max, search(picture, i, j, picture[i][j]));
                    cnt++;
                }
            }
        }

        return new int[]{cnt, max};
    }

    int search(int[][] picture, int x, int y, int v) {
        if ((x >= picture.length || x < 0) || (y >= picture[0].length || y < 0) || picture[x][y] == 0)
            return 0;

        if (picture[x][y] == v) {
            picture[x][y] = 0;
            return 1 + search(picture, x + 1, y, v) + search(picture, x, y + 1, v) + search(picture, x - 1, y, v) + search(picture, x, y - 1, v);
        } else {
            return 0;
        }
    }
}