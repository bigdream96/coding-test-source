package com.codingtest.source.programmers.p42747;

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        List<Integer> list = new ArrayList<>(citations.length);

        for (int citation : citations)
            list.add(citation);

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            int cnt = i + 1;
            int citation = list.get(i);
            if (cnt > citation) {
                return cnt - 1;
            } else if (cnt == citation) {
                return citation;
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 0, 6, 1, 5});
        System.out.println(result);
    }
}