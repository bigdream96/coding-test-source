package com.codingtest.source.programmers.p72411;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] answer = solution.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5});
        System.out.println(Arrays.toString(answer));
    }

    public String[] solution(String[] orders, int[] course) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String order : orders) {
            char[] arr = order.toCharArray();
            boolean[] visited = new boolean[arr.length];

            for (int n : course)
                combination(arr, visited, 0, arr.length, n, map);
        }

        for (int n : course) {
            int max = 0;

            for (String key : map.keySet()) {
                if (key.length() == n) {
                    int num = map.get(key);
                    if (num > max && num > 1) {
                        max = num;
                    }
                }
            }

            for (String key : map.keySet()) {
                if (key.length() == n) {
                    int num = map.get(key);
                    if (num == max) {
                        list.add(key);
                    }
                }
            }
        }

        Collections.sort(list);

        return list.toArray(new String[list.size()]);
    }

    private void combination(char[] arr, boolean[] visited, int start, int n, int r, Map<String, Integer> map) {
        if (r == 0) {
            save(arr, visited, n, map);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, map);
            visited[i] = false;
        }
    }

    private void save(char[] arr, boolean[] visited, int n, Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            if (visited[i])
                sb.append(arr[i]);

        char[] set = sb.toString().toCharArray();
        Arrays.sort(set);
        String s = String.valueOf(set);
        map.put(s, map.getOrDefault(s, 0) + 1);
    }
}