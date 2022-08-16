package com.codingtest.docs.sort;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("계수 정렬")
class CountingSortTest {

    private CountingSort countingSort;

    @BeforeEach
    void init() {
        countingSort = new CountingSort();
    }

    @Test
    @DisplayName("테스트 케이스")
    void testCase() {
        int[] items = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};

        countingSort.sort(items);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9}, items);
    }
}