package com.codingtest.source.programmers.p12911;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 다음 큰 숫자")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시 1")
    void testCase1() {
        int n = 78;

        int result = solution.solution(n);

        assertEquals(83, result);
    }

    @Test
    @DisplayName("문제 예시 2")
    void testCase2() {
        int n = 15;

        int result = solution.solution(n);

        assertEquals(23, result);
    }
}