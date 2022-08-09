package com.codingtest.source.programmers.p12900;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 2 * n 타일링")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시")
    void testCase1() {
        int n = 4;

        int answer = solution.solution(n);

        assertEquals(5, answer);
    }
}