package com.codingtest.source.programmers.p76502;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("프로그래머스 연습문제 - 괄호 회전하기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시 1")
    void testCase1() {
        String s = "[](){}";

        int answer = solution.solution(s);

        assertEquals(3, answer);
    }

    @Test
    @DisplayName("문제 예시 2")
    void testCase2() {
        String s = "}]()[{";

        int answer = solution.solution(s);

        assertEquals(2, answer);
    }

    @Test
    @DisplayName("문제 예시 3")
    void testCase3() {
        String s = "[)(]";

        int answer = solution.solution(s);

        assertEquals(0, answer);
    }

    @Test
    @DisplayName("문제 예시 4")
    void testCase4() {
        String s = "}}}";

        int answer = solution.solution(s);

        assertEquals(0, answer);
    }
}