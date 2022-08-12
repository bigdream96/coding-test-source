package com.codingtest.source.docs.sort;

import com.codingtest.docs.sort.InsertionSort;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("알고리즘 - 삽입정렬")
class InsertionSortTest {

    private InsertionSort insertionSort;

    @BeforeEach
    void init() {
        insertionSort = new InsertionSort();
    }

    @Test
    @DisplayName("테스트 케이스")
    void sort() {
        int[] items = {1, 3, 5, 2, 4, 7, 9, 8, 6};

        insertionSort.sort(items);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, items);
    }
}