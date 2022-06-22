package com.codingtest.source.programmers.sk.q3;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = new int[clients.length];
        Map<Integer, Set<String>> serviceByPlan = new TreeMap<>();
        Map<Integer, Set<String>> serviceByClient = new LinkedHashMap<>();

        Set<String> services = new TreeSet<>();
        for (String value : plans) {
            String[] data = value.split(" ");
            Set<String> addedServices = new TreeSet<>(services);
            addedServices.addAll(List.of(data).subList(1, data.length));
            services = addedServices;
            serviceByPlan.put(Integer.valueOf(data[0]), addedServices);
        }

        for (String value : clients) {
            String[] data = value.split(" ");
            Set<String> useServices = new TreeSet<>(List.of(data).subList(1, data.length));
            serviceByClient.put(Integer.valueOf(data[0]), useServices);
        }

        int i = 0;
        for (int clientData : serviceByClient.keySet()) {
            int j = 0;
            for (int planData : serviceByPlan.keySet()) {
                if (clientData <= planData && serviceByPlan.get(planData).containsAll(serviceByClient.get(clientData))) {
                    answer[i] = j + 1;
                    break;
                }
                j++;
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(5, new String[]{"100 1 3", "500 4", "2000 5"}, new String[]{"300 3 5", "1500 1", "100 1 3", "50 1 2"});
        System.out.println(Arrays.toString(result));
    }
}