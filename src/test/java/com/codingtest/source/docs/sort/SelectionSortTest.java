package com.codingtest.source.docs.sort;

import com.codingtest.docs.sort.SelectionSort;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("알고리즘 - 선택정렬")
class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    void init() {
        selectionSort = new SelectionSort();
    }

    @Test
    @DisplayName("테스트 케이스")
    void sort() {
        int[] items = {1, 3, 5, 2, 4, 7, 9, 8, 6};

        selectionSort.sort(items);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, items);
    }
}