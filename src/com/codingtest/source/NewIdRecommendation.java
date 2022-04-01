/**
 * question source: https://programmers.co.kr/learn/courses/30/lessons/72410
 */

package com.codingtest.source;

public class NewIdRecommendation {
    class Solution {
        public String solution(String newId) {
            return validate(newId) ? newId : generateNewId(newId);
        }

        private boolean validate(String id) {
            return id.matches("^[a-z0-9\\_\\-][a-z0-9\\_\\-\\.]{1,13}[a-z0-9\\_\\-]$") &&
                    id.matches("^[^\\.]*[\\.]?[^\\.]*$");
        }

        private String generateNewId(String id) {
            String result = id.toLowerCase()
                    .replaceAll("[^a-z0-9\\_\\.\\-]", "")
                    .replaceAll("[\\.]{2,}", "\\.")
                    .replaceAll("^(\\.)|(\\.)$", "");

            if(result.equals(""))
                result = "a";

            if(result.length() >= 16) {
                String tmp = result.substring(0, 15);
                result = tmp.endsWith(".") ? tmp.substring(0, 14) : tmp;
            }

            while(result.length() <= 2) {
                result += result.charAt(result.length()-1);
                if(result.length() == 3)
                    break;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        NewIdRecommendation newIdRecommendation = new NewIdRecommendation();
        NewIdRecommendation.Solution solution = newIdRecommendation.new Solution();
        String result = solution.solution("=.=");
        System.out.println(result);
    }
}
