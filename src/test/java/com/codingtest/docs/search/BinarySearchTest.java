package com.codingtest.docs.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("이진 탐색")
class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void init() {
        binarySearch = new BinarySearch();
    }

    @Test
    @DisplayName("테스트 케이스")
    void testCase() {
        int[] items = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

        int result = binarySearch.search(items, 4, 0, items.length - 1);

        assertEquals(2, result);
    }
}