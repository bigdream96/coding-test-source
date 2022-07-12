package com.codingtest.source.programmers.p77484;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2021 Dev-Matching: 웹 백엔드 개발자(상반기) - 로또의 최고순위와 최저순위")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제예시")
    void testCase1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] winNums = {31, 10, 45, 1, 6, 19};

        int[] answer = solution.solution(lottos, winNums);

        assertEquals(answer[0], 3);
        assertEquals(answer[1], 5);
    }

    @Test
    @DisplayName("CASE2. 모두 알 수 없는 번호")
    void testCase2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] winNums = {38, 19, 20, 40, 15, 25};

        int[] answer = solution.solution(lottos, winNums);

        assertEquals(answer[0], 1);
        assertEquals(answer[1], 6);
    }

    @Test
    @DisplayName("CASE3. 로또 번호와 당첨 번호가 모두 일치")
    void testCase3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] winNums = {20, 9, 3, 45, 4, 35};

        int[] answer = solution.solution(lottos, winNums);

        assertEquals(answer[0], 1);
        assertEquals(answer[1], 1);
    }
}