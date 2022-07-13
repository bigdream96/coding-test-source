package com.codingtest.source.programmers.p72410;

class Solution {
    public String solution(String newId) {
        return validate(newId) ? newId : generateNewId(newId);
    }

    private boolean validate(String id) {
        return id.matches("^[a-z0-9\\_\\-][a-z0-9\\_\\-\\.]{1,13}[a-z0-9\\_\\-]$") &&
                id.matches("^[^\\.]*[\\.]?[^\\.]*$");
    }

    private String generateNewId(String id) {
        StringBuilder result = new StringBuilder(id.toLowerCase()
                .replaceAll("[^a-z0-9\\_\\.\\-]", "")
                .replaceAll("[\\.]{2,}", "\\.")
                .replaceAll("^(\\.)|(\\.)$", ""));

        if (result.toString().equals(""))
            result = new StringBuilder("a");

        if (result.length() >= 16) {
            String tmp = result.substring(0, 15);
            result = new StringBuilder(tmp.endsWith(".") ? tmp.substring(0, 14) : tmp);
        }

        while (result.length() <= 2)
            result.append(result.charAt(result.length() - 1));

        return result.toString();
    }
}