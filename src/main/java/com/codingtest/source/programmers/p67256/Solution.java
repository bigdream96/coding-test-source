package com.codingtest.source.programmers.p67256;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    StringBuilder result = new StringBuilder();
    HashMap<String, String> handToNumber = new HashMap<>(Map.of("left", "*", "right", "#"));
    HashMap<String, String> handToPrintText = new HashMap<>(Map.of("left", "L", "right", "R"));
    HashMap<String, List<Integer>> numberToPosition = new HashMap<>();
    String[] type = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

    public String solution(int[] numbers, String hand) {
        init(numberToPosition);

        for(int number : numbers) {
            String key = String.valueOf(number);
            String moveNumber = "";
            switch (number) {
                case 1: case 4: case 7:
                    moveNumber = "left";
                    break;
                case 3: case 6: case 9:
                    moveNumber = "right";
                    break;
                case 2: case 5: case 8: case 0:
                    int left = getDistance(numberToPosition, handToNumber, key, "left");
                    int right = getDistance(numberToPosition, handToNumber, key, "right");
                    if(left < right) moveNumber = "left";
                    else if(left > right) moveNumber = "right";
                    else moveNumber = hand;
                    break;
            }
            handToNumber.put(moveNumber, key);
            result.append(handToPrintText.get(moveNumber));
        }

        return result.toString();
    }

    void init(HashMap<String, List<Integer>> numberToPosition) {
        int typeIdx = 0;
        for(int i=0; i<4; i++)
            for(int j=0; j<3; j++)
                numberToPosition.put(type[typeIdx++], List.of(i, j));
    }

    int getDistance(HashMap<String, List<Integer>> numberToPosition, HashMap<String, String> handToNumber, String number, String hand) {
        return Math.abs(numberToPosition.get(number).get(0) - numberToPosition.get(handToNumber.get(hand)).get(0))
                + Math.abs(numberToPosition.get(number).get(1) - numberToPosition.get(handToNumber.get(hand)).get(1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");
        System.out.println(result);
    }
}