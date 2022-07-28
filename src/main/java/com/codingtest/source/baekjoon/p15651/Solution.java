package com.codingtest.source.baekjoon.p15651;

import java.util.Scanner;

public class Solution {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] selected;

    public static void main(String[] args) {
        input();
        recursive(1);
        System.out.println(sb.toString());
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        selected = new int[m + 1];
    }

    static void recursive(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int i = 1; i <= n; i++) {
                selected[k] = i;
                recursive(k + 1);
                selected[k] = 0;
            }
        }
    }
}