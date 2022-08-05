package com.codingtest.source.programmers.p17681;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("2018 KAKAO BLIND RECRUITMENT - [1차] 비밀지도")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};

        String[] result = solution.solution(n, arr1, arr2);

        assertTrue(deepEquals(result, new String[]{"#####","# # #", "### #", "#  ##", "#####"}));
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        int n = 6;
        int[] arr1 = new int[]{46, 33, 33, 22, 31, 50};
        int[] arr2 = new int[]{27, 56, 19, 14, 14, 10};

        String[] result = solution.solution(n, arr1, arr2);

        assertTrue(deepEquals(result, new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}));
    }
}