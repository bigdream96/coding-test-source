package com.codingtest.source.programmers.p12941;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("최솟값 만들기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        int[] a = new int[]{1, 4, 2};
        int[] b = new int[]{5, 4, 4};

        int answer = solution.solution(a, b);

        assertEquals(29, answer);
    }

    @Test
    @DisplayName("문제 예시2")
    void testCase2() {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};

        int answer = solution.solution(a, b);

        assertEquals(10, answer);
    }
}