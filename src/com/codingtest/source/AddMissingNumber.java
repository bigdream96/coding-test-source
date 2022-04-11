/**
 * question source: https://programmers.co.kr/learn/courses/30/lessons/86051
 */

package com.codingtest.source;

public class AddMissingNumber {
    class Solution {
        public int solution(int[] numbers) {
            int result = 45;

            for(int number : numbers)
                result -= number;

            return result;
        }

//        public int solution(int[] numbers) {
//            return 45 - stream(numbers).sum();
//        }
    }

    public static void main(String[] args) {
        AddMissingNumber addMissingNumber = new AddMissingNumber();
        Solution solution = addMissingNumber.new Solution();
        System.out.println(solution.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
}
