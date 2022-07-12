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
    @DisplayName("CASE1. 한 유저가 같은 유저를 신고한 경우에는 신고 횟수 1회")
    void solution() {
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        int[] result = solution.solution(idList, report, k);

        assertEquals(result[0], 0);
        assertEquals(result[1], 0);
    }
}