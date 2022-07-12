package com.codingtest.source.baekjoon.p10451;

import java.io.*;
import java.util.*;

public class Main {
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            int size = Integer.parseInt(br.readLine());
            List<List<Integer>> list = new LinkedList<>();
            for (int j = 0; j <= size; j++)
                list.add(new LinkedList<>());

            String[] arr = br.readLine().split(" ");

            int k = 1;
            for (String v : arr)
                list.get(k++).add(Integer.valueOf(v));

            search(size, new boolean[size + 1], list);

            System.out.println(cnt);
            cnt = 0;
        }

        br.close();
    }

    static void search(int n, boolean[] visited, List<List<Integer>> list) {
        for (int i = 1; i <= n; i++)
            if (!visited[i])
                bfs(i, visited, list);
    }

    static void bfs(int i, boolean[] visited, List<List<Integer>> list) {
        visited[i] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);

        while (!queue.isEmpty()) {
            for (int item : list.get(queue.poll())) {
                if (!visited[item]) {
                    queue.add(item);
                    visited[item] = true;
                }
            }
        }

        cnt++;
    }
}