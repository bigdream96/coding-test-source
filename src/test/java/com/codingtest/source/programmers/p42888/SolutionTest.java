package com.codingtest.source.programmers.p42888;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2019 KAKAO BLIND RECRUITMENT - 오픈채팅방")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시")
    void testCase1() {
        String[] recodes = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        String[] result = solution.solution(recodes);

        assertEquals(result[0], "Prodo님이 들어왔습니다.");
        assertEquals(result[1], "Ryan님이 들어왔습니다.");
        assertEquals(result[2], "Prodo님이 나갔습니다.");
        assertEquals(result[3], "Prodo님이 들어왔습니다.");
    }
}