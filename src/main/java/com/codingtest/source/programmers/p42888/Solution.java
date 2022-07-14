package com.codingtest.source.programmers.p42888;

import java.util.*;

class Solution {
    public String[] solution(String[] records) {
        List<List<String>> messageItems = new ArrayList<>(records.length);
        Map<String, String> nameById = new HashMap<>();
        Map<String, String> messageByCommand = Map.of("Enter", "님이 들어왔습니다.", "Leave", "님이 나갔습니다.");

        for (String record : records) {
            String[] arr = record.split(" ");
            String command = arr[0];
            String id = arr[1];

            if (command.equals("Enter") || command.equals("Change")) {
                String nickname = arr[2];
                nameById.put(id, nickname);
            }

            if (!command.equals("Change")) {
                messageItems.add(List.of(id, command));
            }
        }

        String[] result = new String[messageItems.size()];
        int i = 0;
        for (List<String> messageItem : messageItems)
            result[i++] = nameById.get(messageItem.get(0)) + messageByCommand.get(messageItem.get(1));

        return result;
    }
}