package com.codingtest.source.programmers.p12953;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - N개의 최소공배수")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        int[] arr = new int[]{2,6,8,14};

        int answer = solution.solution(arr);

        assertEquals(168, answer);
    }

    @Test
    @DisplayName("문제 예시2")
    void testCase2() {
        int[] arr = new int[]{1,2,3};

        int answer = solution.solution(arr);

        assertEquals(6, answer);
    }
}