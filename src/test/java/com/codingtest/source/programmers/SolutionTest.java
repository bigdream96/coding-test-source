package com.codingtest.source.programmers;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2018 KAKAO BLIND RECRUITMENT - [1차] 캐시")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("문제 예시1")
    void testCase1() {
        int cacheSize = 3;
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 50);
    }

    @Test
    @DisplayName("문제 예시2")
    void testCase2() {
        int cacheSize = 3;
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 21);
    }

    @Test
    @DisplayName("문제 예시3")
    void testCase3() {
        int cacheSize = 2;
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 60);
    }

    @Test
    @DisplayName("문제 예시4")
    void testCase4() {
        int cacheSize = 5;
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 52);
    }

    @Test
    @DisplayName("문제 예시5")
    void testCase5() {
        int cacheSize = 2;
        String[] cities = new String[]{"Jeju", "Pangyo", "NewYork", "newyork"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 16);
    }

    @Test
    @DisplayName("문제 예시6")
    void testCase6() {
        int cacheSize = 0;
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int executionTime = solution.solution(cacheSize, cities);

        assertEquals(executionTime, 25);
    }
}