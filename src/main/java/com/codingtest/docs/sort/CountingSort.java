package com.codingtest.docs.sort;

public class CountingSort {
    public void sort(int[] items) {
        int[] counts = new int[max(items) + 1];

        for (int item : items)
            counts[item]++;

        int idx = 0;
        for (int i = 0; i < counts.length; i++)
            for (int j = 0; j < counts[i]; j++)
                items[idx++] = i;
    }

    private int max(int[] items) {
        int n = 0;

        for (int item : items)
            n = Math.max(n, item);

        return n;
    }
}