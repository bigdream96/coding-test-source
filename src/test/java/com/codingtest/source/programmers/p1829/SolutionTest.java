package com.codingtest.source.programmers.p1829;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2017 카카오코드 예선 - 카카오프렌즈 컬러링북")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 테스트 케이스1")
    void testCase1() {
        int m = 6;
        int n = 4;
        int[][] arr = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        int[] result = solution.solution(m, n, arr);

        assertEquals(result[0], 4);
        assertEquals(result[1], 5);
    }

    @Test
    @DisplayName("CASE2. 문제 예시")
    void testCase2() {
        int[][] arr = new int[][]{{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 99, 1, 1, 1, 1, 99, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 99, 1, 99, 1, 1, 99, 1, 99, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 0},
                {0, 1, 1, 1, 1, 1, 99, 1, 1, 99, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 99, 99, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};

        int[] result = solution.solution(13, 16, arr);

        assertEquals(result[0], 12);
        assertEquals(result[1], 120);
    }
}