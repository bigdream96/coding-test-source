package com.codingtest.docs.sort;

public class QuickSort {
    public void sort(int[] items, int pivot, int end) {
        if (pivot >= end) {
            return;
        }

        int left = pivot + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && items[left] < items[pivot]) {
                left++;
            }
            while (right > pivot && items[right] > items[pivot]) {
                right--;
            }
            if (left > right) {
                swipe(items, pivot, right);
            } else {
                swipe(items, left, right);
            }
        }

        sort(items, pivot, right - 1);
        sort(items, right + 1, end);
    }

    private void swipe(int[] items, int a, int b) {
        int tmp = items[a];
        items[a] = items[b];
        items[b] = tmp;
    }
}