package com.codingtest.source.programmers.p12923;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("프로그래머스 연습 문제 - 숫자 블록")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시")
    void testCase1() {
        int begin = 1;
        int end = 10;

        int[] result = solution.solution(begin, end);

        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 3, 1, 4, 3, 5}, result);
    }
}