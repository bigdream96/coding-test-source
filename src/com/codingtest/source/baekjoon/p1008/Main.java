package com.codingtest.source.baekjoon.p1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(divide(a, b));
    }

    static double divide(double a, double b) {
        return a / b;
    }
}