package com.codingtest.docs.sort;

public class InsertionSort {
    public void sort(int[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = i; j > 0; j--) {
                if (items[j - 1] > items[j]) {
                    swipe(items, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    private void swipe(int[] items, int a, int b) {
        int tmp = items[a];
        items[a] = items[b];
        items[b] = tmp;
    }
}