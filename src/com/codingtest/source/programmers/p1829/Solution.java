package com.codingtest.source.programmers.p1829;

import java.util.Arrays;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++)
            System.arraycopy(picture[i], 0, arr[i], 0, n);

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] > 0) {
                    int num = search(arr, i, j, arr[i][j]);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, num);
                    numberOfArea++;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    int search(int[][] picture, int x, int y, int v) {
        if((x >= picture.length || x < 0) || (y >= picture[0].length || y < 0) || picture[x][y] == 0)
            return 0;

        if(picture[x][y] > 0 && picture[x][y] == v) {
            picture[x][y] = 0;
            return 1 + search(picture, x+1, y, v) + search(picture, x, y+1, v) + search(picture, x-1, y, v) + search(picture, x, y-1, v);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{{0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0}, {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0}, {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0}, {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0}, {0,1,1,1,1,99,1,1,1,1,99,1,1,1,1,0},
                {0,1,1,1,99,1,99,1,1,99,1,99,1,1,1,0}, {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}, {0,1,2,2,2,1,1,1,1,1,1,2,2,2,1,0},
                {0,1,1,1,1,1,99,1,1,99,1,1,1,1,1,0}, {0,0,1,1,1,1,1,99,99,1,1,1,1,1,0,0}, {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}};
        int[] result = solution.solution(arr.length, arr[0].length, arr);
        System.out.println(Arrays.toString(result));
    }
}