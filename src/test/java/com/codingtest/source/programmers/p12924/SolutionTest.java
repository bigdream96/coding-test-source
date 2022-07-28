package com.codingtest.source.programmers.p12924;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 숫자의 표현")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        int n = 15;

        int answer = this.solution.solution(n);

        assertEquals(4, answer);
    }

    @Test
    @DisplayName("테스트값1 - 제한사항의 최대값")
    void testCase2() {
        int n = 10000;

        int answer = this.solution.solution(n);

        assertEquals(5, answer);
    }
}