package com.codingtest.source.programmers.p42888;

import java.util.*;

class Solution {
    public String[] solution(String[] records) {
        List<List<String>> messageItems = new ArrayList<>(records.length);
        Map<String, String> nameById = new HashMap<>();
        Map<String, String> messageByCommand = Map.of("Enter", "님이 들어왔습니다.", "Leave", "님이 나갔습니다.");

        for(String record : records) {
            String[] arr = record.split(" ");
            String command = arr[0];
            String id = arr[1];

            if(command.equals("Enter") || command.equals("Change"))
                nameById.put(id, arr[2]);

            if(!command.equals("Change"))
                messageItems.add(List.of(messageByCommand.get(command), id));
        }

        String[] result = new String[messageItems.size()];
        int i = 0;
        for(List<String> messageItem : messageItems)
            result[i++] = nameById.get(messageItem.get(1)) + messageItem.get(0);

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
        System.out.println(Arrays.toString(result));
    }
}