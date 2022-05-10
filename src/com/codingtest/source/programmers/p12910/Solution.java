package com.codingtest.source.programmers.p12910;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for(int n : arr)
            if(n % divisor == 0)
                list.add(n);

        if(list.size() == 0)
            return new int[]{-1};

        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(result));
    }
}