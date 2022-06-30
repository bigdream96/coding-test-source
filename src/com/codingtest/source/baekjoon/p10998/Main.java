package com.codingtest.source.baekjoon.p10998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(multiply(a, b));
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}