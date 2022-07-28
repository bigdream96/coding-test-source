package com.codingtest.source.baekjoon.p15649;

import java.util.Scanner;

public class Solution {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] selected;
    static boolean[] used;

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
        used = new boolean[n + 1];
    }

    static void recursive(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            for (int i = 1; i <= n; i++) {
                if (used[i])
                    continue;
                selected[k] = i;
                used[i] = true;
                recursive(k + 1);
                selected[k] = 0;
                used[i] = false;
            }
        }
    }
}