package com.codingtest.source.programmers.p12935;

import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        if(list.size() > 1)
            list.remove(Collections.min(list));
        else
            return new int[]{-1};
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(result));
    }
}