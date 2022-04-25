package com.codingtest.source.programmers.p42576;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
            if(i < completion.length)
                map.put(completion[i], map.getOrDefault(completion[i], 0) - 1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) > 0) {
                result = key;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(result);
    }
}
