package com.codingtest.source.programmers.p92334;

import java.util.*;

class Solution {
    public int[] solution(String[] idList, String[] reportList, int k) {
        int[] answer = new int[idList.length];
        Map<String, Integer> keyById = new LinkedHashMap<>();
        Map<Integer, Set<String>> reportIdListByIdKey = new LinkedHashMap<>();
        Map<String, Integer> cntByReportId = new LinkedHashMap<>();
        Map<String, Set<String>> idListByReportId = new LinkedHashMap<>();

        for (int i = 0; i < idList.length; i++) {
            reportIdListByIdKey.put(i, new LinkedHashSet<>());
            cntByReportId.put(idList[i], 0);
            keyById.put(idList[i], i);
            idListByReportId.put(idList[i], new LinkedHashSet<>());
        }

        for (String report : reportList) {
            String[] data = report.split(" ");
            String id = data[0];
            String reportId = data[1];
            reportIdListByIdKey.get(keyById.get(id)).add(reportId);
            Set<String> alreadyIdSet = idListByReportId.get(reportId);
            if (!alreadyIdSet.contains(id)) {
                alreadyIdSet.add(id);
                cntByReportId.put(reportId, cntByReportId.get(reportId) + 1);
            }
        }

        for (int key : reportIdListByIdKey.keySet())
            for (String reportId : reportIdListByIdKey.get(key))
                if (cntByReportId.get(reportId) >= k)
                    answer[key]++;

        return answer;
    }
}