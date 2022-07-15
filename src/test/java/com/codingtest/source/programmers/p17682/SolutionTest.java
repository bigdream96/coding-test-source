package com.codingtest.source.programmers.p17682;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("2018 KAKAO BLIND RECRUITMENT - [1차] 다트게임")
class SolutionTest {

    private Solution solution;

    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    @DisplayName("CASE1. 문제 예시1")
    void testCase1() {
        String dartResult = "1S2D*3T";

        int result = solution.solution(dartResult);

        assertEquals(result, 37);
    }

    @Test
    @DisplayName("CASE2. 문제 예시2")
    void testCase2() {
        String dartResult = "1D2S#10S";

        int result = solution.solution(dartResult);

        assertEquals(result, 9);
    }

    @Test
    @DisplayName("CASE3. 문제 예시3")
    void testCase3() {
        String dartResult = "1D2S0T";

        int result = solution.solution(dartResult);

        assertEquals(result, 3);
    }

    @Test
    @DisplayName("CASE4. 문제 예시4")
    void testCase4() {
        String dartResult = "1S*2T*3S";

        int result = solution.solution(dartResult);

        assertEquals(result, 23);
    }

    @Test
    @DisplayName("CASE5. 문제 예시5")
    void testCase5() {
        String dartResult = "1D#2S*3S";

        int result = solution.solution(dartResult);

        assertEquals(result, 5);
    }

    @Test
    @DisplayName("CASE6. 문제 예시6")
    void testCase6() {
        String dartResult = "1T2D3D#";

        int result = solution.solution(dartResult);

        assertEquals(result, -4);
    }

    @Test
    @DisplayName("CASE7. 문제 예시7")
    void testCase7() {
        String dartResult = "1D2S3T*";

        int result = solution.solution(dartResult);

        assertEquals(result, 59);
    }
}