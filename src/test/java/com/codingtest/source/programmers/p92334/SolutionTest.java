package com.codingtest.source.programmers.p92334;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2022 KAKAO BLIND RECRUITMENT - 신고 결과 받기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제예시")
    void testCase1() {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = solution.solution(idList, report, k);

        assertEquals(result[0], 2);
        assertEquals(result[1], 1);
        assertEquals(result[2], 1);
        assertEquals(result[3], 0);
    }

    @Test
    @DisplayName("CASE2. 한 유저가 같은 유저를 신고한 경우에는 신고 횟수 1회")
    void testCase2() {
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] result = solution.solution(idList, report, k);

        assertEquals(result[0], 0);
        assertEquals(result[1], 0);
    }
}