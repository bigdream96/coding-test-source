package com.codingtest.source.programmers.p12906;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
            if(list.get(list.size()-1) != arr[i])
                list.add(arr[i]);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{1,1,3,3,0,1,1});
        System.out.println(Arrays.toString(result));
    }
}