/**
 * question source: https://programmers.co.kr/learn/courses/30/lessons/92334
 */

package com.codingtest.source.p92334;

import java.util.*;

class Solution {
    final String SEPARATOR = " ";
    Map<String, List<String>> reportListMap = new LinkedHashMap<>();
    Map<String, Integer> cntForReport = new LinkedHashMap<>();
    Map<String, Integer> cntForMail = new LinkedHashMap<>();

    public int[] solution(String[] idList, String[] reportList, int k) {
        for(String id : idList) {
            reportListMap.put(id, new LinkedList<>());
            cntForReport.put(id, 0);
            cntForMail.put(id, 0);
        }

        for(String report : reportList) {
            String[] reportData = report.split(SEPARATOR);
            String id = reportData[0];
            String reportId = reportData[1];
            if(!reportListMap.get(id).contains(reportId))
                reportListMap.get(id).add(reportId);
        }

        for(List<String> reportIdList : reportListMap.values())
            for(String reportId : reportIdList)
                cntForReport.put(reportId, cntForReport.get(reportId) + 1);

        for(String id : reportListMap.keySet())
            for(String reportId : reportListMap.get(id))
                if(cntForReport.get(reportId) >= k)
                    cntForMail.put(id, cntForMail.get(id) + 1);

        return cntForMail.values().stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        int[] result = solution.solution(idList, report, k);
        System.out.println(Arrays.toString(result));
    }
}
