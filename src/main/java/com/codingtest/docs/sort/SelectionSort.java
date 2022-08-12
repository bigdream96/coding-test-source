package com.codingtest.docs.sort;

public class SelectionSort {
    public void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            int min = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[min] > items[j]) {
                    min = j;
                }
            }
            swipe(items, i, min);
        }
    }

    private void swipe(int[] items, int a, int b) {
        int tmp = items[a];
        items[a] = items[b];
        items[b] = tmp;
    }
}