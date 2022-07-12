package com.codingtest.source.programmers.p42577;

import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    public boolean solution(String[] phoneBook) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();
        int min = 20;

        for(String phone : phoneBook)
            min = Integer.min(phone.length(), min);

        for(String phone : phoneBook) {
            String key = phone.substring(0, min);

            if(map.containsKey(key))
                for(String v : map.get(key))
                    if(phone.startsWith(v) || v.startsWith(phone))
                        return false;

            LinkedList<String> values = map.getOrDefault(key, new LinkedList<>());
            values.add(phone);
            map.put(key, values);
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(new String[]{"12","123","1235","567","88"});
        System.out.println(result);
    }
}