package com.codingtest.source.programmers.p12905;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("프로그래머스 연습문제 - 가장 큰 정사각형 찾기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};

        int answer = solution.solution(board);

        assertEquals(9, answer);
    }

    @Test
    @DisplayName("문제 예시2")
    void testCase2() {
        int[][] board = {{0, 0, 1, 1}, {1, 1, 1, 1}};

        int answer = solution.solution(board);

        assertEquals(4, answer);
    }
}