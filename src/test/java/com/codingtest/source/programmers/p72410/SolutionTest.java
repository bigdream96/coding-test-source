package com.codingtest.source.programmers.p72410;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        String result = solution.solution("...!@BaT#*..y.abcdefghijklm");
        assertEquals(result, "bat.y.abcdefghi");
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        String result = solution.solution("z-+.^.");
        assertEquals(result, "z--");
    }

    @Test
    @DisplayName("CASE3. 문제 예시3")
    void testCase3() {
        String result = solution.solution("=.=");
        assertEquals(result, "aaa");
    }

    @Test
    @DisplayName("CASE4. 문제 예시4")
    void testCase4() {
        String result = solution.solution("123_.def");
        assertEquals(result, "123_.def");
    }

    @Test
    @DisplayName("CASE5. 문제 예시5")
    void testCase5() {
        String result = solution.solution("abcdefghijklmn.p");
        assertEquals(result, "abcdefghijklmn");
    }
}