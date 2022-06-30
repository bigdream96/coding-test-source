package com.codingtest.source.baekjoon.p1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(subtraction(a, b));
    }

    static int subtraction(int a, int b) {
        return a - b;
    }
}