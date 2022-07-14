package com.codingtest.source.programmers.p81301;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        String s = "one4seveneight";

        int result = solution.solution(s);

        assertEquals(result, 1478);
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        String s = "23four5six7";
        int result = solution.solution(s);
        assertEquals(result, 234567);
    }

    @Test
    @DisplayName("CASE3. 문제 예시3")
    void testCase3() {
        String s = "2three45sixseven";
        int result = solution.solution(s);
        assertEquals(result, 234567);
    }

    @Test
    @DisplayName("CASE4. 영단어로 바뀌는 경우가 없는 경우")
    void testCase4() {
        String s = "123";
        int result = solution.solution(s);
        assertEquals(result, 123);
    }
}