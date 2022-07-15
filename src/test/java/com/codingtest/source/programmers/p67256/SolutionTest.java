package com.codingtest.source.programmers.p67256;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2020 카카오 인턴십 - 키패드 누르기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String result = solution.solution(numbers, hand);

        assertEquals(result, "LRLLLRLLRRL");
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String result = solution.solution(numbers, hand);

        assertEquals(result, "LRLLRRLLLRR");
    }

    @Test
    @DisplayName("CASE3. 문제 예시3")
    void testCase3() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        String result = solution.solution(numbers, hand);

        assertEquals(result, "LLRLLRLLRL");
    }
}