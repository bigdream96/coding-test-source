package com.codingtest.source.programmers.p1835;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2017 카카오코드 본선 - 단체사진 찍기")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제예시1")
    void testCase1() {
        int n = 2;
        String[] data = new String[]{"N~F=0", "R~T>2"};

        int answer = solution.solution(n, data);

        assertEquals(answer, 3648);
    }

    @Test
    @DisplayName("CASE2. 문제예시2")
    void testCase2() {
        int n = 2;
        String[] data = new String[]{"M~C<2", "C~M>1"};

        int answer = solution.solution(n, data);

        assertEquals(answer, 0);
    }
}