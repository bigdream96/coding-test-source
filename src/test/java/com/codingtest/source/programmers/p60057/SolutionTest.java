package com.codingtest.source.programmers.p60057;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2020 KAKAO BLIND RECRUITMENT - 문자열 압축")
class SolutionTest {
    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        int result = solution.solution("aabbaccc");
        assertEquals(result, 7);
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        int result = solution.solution("ababcdcdababcdcd");
        assertEquals(result, 9);
    }

    @Test
    @DisplayName("CASE3. 문제 예시3")
    void testCase3() {
        int result = solution.solution("abcabcdede");
        assertEquals(result, 8);
    }

    @Test
    @DisplayName("CASE4. 문제 예시4")
    void testCase4() {
        int result = solution.solution("abcabcabcabcdededededede");
        assertEquals(result, 14);
    }

    @Test
    @DisplayName("CASE5. 문제 예시5")
    void testCase5() {
        int result = solution.solution("xababcdcdababcdcd");
        assertEquals(result, 17);
    }
}