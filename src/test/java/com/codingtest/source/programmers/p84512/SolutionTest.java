package com.codingtest.source.programmers.p84512;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 모음 사전")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시 1")
    void testCase1() {
        String word = "AAAAE";

        int answer = solution.solution(word);

        assertEquals(6, answer);
    }

    @Test
    @DisplayName("문제 예시 2")
    void testCase2() {
        String word = "AAAE";

        int answer = solution.solution(word);

        assertEquals(10, answer);
    }

    @Test
    @DisplayName("문제 예시 3")
    void testCase3() {
        String word = "I";

        int answer = solution.solution(word);

        assertEquals(1563, answer);
    }

    @Test
    @DisplayName("문제 예시 4")
    void testCase4() {
        String word = "EIO";

        int answer = solution.solution(word);

        assertEquals(1189, answer);
    }
}