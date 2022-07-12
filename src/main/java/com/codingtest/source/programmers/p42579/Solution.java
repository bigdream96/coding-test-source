package com.codingtest.source.programmers.p42579;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, List<Integer>> playsByGenre = new HashMap<>();
        TreeMap<Integer, String> genreBySum = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < genres.length; i++) {
            List<Integer> values = playsByGenre.getOrDefault(genres[i], new ArrayList<>(genres.length));
            values.add(i);
            playsByGenre.put(genres[i], values);
        }

        for (String genre : playsByGenre.keySet()) {
            int sum = 0;
            for (int value : playsByGenre.get(genre))
                sum += plays[value];
            genreBySum.put(sum, genre);

            playsByGenre.get(genre).sort((n1, n2) -> plays[n1] == plays[n2] ? Integer.compare(n1, n2) : Integer.compare(plays[n2], plays[n1]));
        }

        ArrayList<Integer> nums = new ArrayList<>(playsByGenre.size() * 2);
        for (String genre : genreBySum.values()) {
            List<Integer> values = playsByGenre.get(genre);
            nums.add(values.get(0));
            if (values.size() > 1)
                nums.add(values.get(1));
        }

        int[] result = new int[nums.size()];
        int i = 0;
        for (int num : nums)
            result[i++] = num;

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        System.out.println(Arrays.toString(result));
    }
}