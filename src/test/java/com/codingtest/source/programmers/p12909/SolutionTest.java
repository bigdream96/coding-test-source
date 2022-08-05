package com.codingtest.source.programmers.p12909;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 올바른 괄호")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        String s = "()()";

        boolean answer = solution.solution(s);

        assertTrue(answer);
    }

    @Test
    @DisplayName("문제 예시2")
    void testCase2() {
        String s = "(())()";

        boolean answer = solution.solution(s);

        assertTrue(answer);
    }

    @Test
    @DisplayName("문제 예시3")
    void testCase3() {
        String s = ")()(";

        boolean answer = solution.solution(s);

        assertFalse(answer);
    }

    @Test
    @DisplayName("문제 예시4")
    void testCase4() {
        String s = "(()(";

        boolean answer = solution.solution(s);

        assertFalse(answer);
    }
}