package com.codingtest.source.programmers.p92334;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = solution.solution(idList, report, k);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String[] idList, String[] reportList, int k) {
        int[] answer = new int[idList.length];
        Map<String, Set<String>> reportListById = new LinkedHashMap<>();
        Map<String, Integer> cntByReportId = new LinkedHashMap<>();
        Map<String, Integer> cntByMailId = new LinkedHashMap<>();

        for (String id : idList) {
            reportListById.put(id, new LinkedHashSet<>());
            cntByReportId.put(id, 0);
            cntByMailId.put(id, 0);
        }

        for (String report : reportList) {
            String[] data = report.split(" ");
            reportListById.get(data[0]).add(data[1]);
        }

        for (String id : reportListById.keySet())
            for (String reportId : reportListById.get(id))
                cntByReportId.put(reportId, cntByReportId.get(reportId) + 1);

        for (String id : reportListById.keySet())
            for (String reportId : reportListById.get(id))
                if (cntByReportId.get(reportId) >= k)
                    cntByMailId.put(id, cntByMailId.get(id) + 1);

        int i = 0;
        for (String id : cntByMailId.keySet())
            answer[i++] = cntByMailId.get(id);

        return answer;
    }
}