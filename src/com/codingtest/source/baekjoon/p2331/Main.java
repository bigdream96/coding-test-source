package com.codingtest.source.baekjoon.p2331;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int p = scanner.nextInt();
        List<String> result = getRepeatSequenceList(a, p);

        System.out.println(result.size());
    }

    static List<String> getRepeatSequenceList(int a, int p) {
        List<String> list = new LinkedList<>();
        list.add(String.valueOf(a));
        while (true) {
            String v = list.get(list.size() - 1);

            int tmp = 0;
            for (int j = 0; j < v.length(); j++)
                tmp += Math.pow(v.charAt(j) - '0', p);

            String next = String.valueOf(tmp);
            if (list.contains(next))
                return list.subList(0, list.indexOf(next));
            list.add(next);
        }
    }
}