package com.codingtest.source.docs.sort;

import com.codingtest.docs.sort.QuickSort;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("알고리즘 - 퀵소트")
class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    void init() {
        quickSort = new QuickSort();
    }

    @Test
    @DisplayName("테스트 케이스")
    void sort() {
        int[] items = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort.sort(items, 0, items.length - 1);

        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, items);
    }
}