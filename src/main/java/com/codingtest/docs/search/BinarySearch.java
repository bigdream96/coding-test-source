package com.codingtest.docs.search;

public class BinarySearch {
    int search(int[] items, int key, int from, int to) {
        if (from > to) {
            return 0;
        }

        int mid = (from + to) / 2;

        if (items[mid] == key) {
            return mid;
        } else if (items[mid] > key) {
            return search(items, key, from, mid - 1);
        } else {
            return search(items, key, mid + 1, to);
        }
    }
}