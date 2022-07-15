package com.codingtest.source.programmers.p42889;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2019 KAKAO BLIND RECRUITMENT - 실패율")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        int n = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};

        int[] result = solution.solution(n, stages);

        assertEquals(result[0], 3);
        assertEquals(result[1], 4);
        assertEquals(result[2], 2);
        assertEquals(result[3], 1);
        assertEquals(result[4], 5);
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        int n = 4;
        int[] stages = new int[]{4, 4, 4, 4, 4};

        int[] result = solution.solution(n, stages);

        assertEquals(result[0], 4);
        assertEquals(result[1], 1);
        assertEquals(result[2], 2);
        assertEquals(result[3], 3);
    }
}