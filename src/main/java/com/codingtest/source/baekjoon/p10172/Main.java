package com.codingtest.source.baekjoon.p10172;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}