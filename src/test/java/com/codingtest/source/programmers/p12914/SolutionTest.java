package com.codingtest.source.programmers.p12914;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 멀리 뛰기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        int n = 4;

        long answer = solution.solution(n);

        assertEquals(5, answer);
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        int n = 3;

        long answer = solution.solution(n);

        assertEquals(3, answer);
    }
}