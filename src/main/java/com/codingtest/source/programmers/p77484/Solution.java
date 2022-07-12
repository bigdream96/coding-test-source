package com.codingtest.source.programmers.p77484;

import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] winNums) {
        HashSet<Integer> winNumSet = new HashSet<>();
        int length = lottos.length;
        int zeroCnt = 0;
        int sameCnt = 0;

        for (int winNum : winNums)
            winNumSet.add(winNum);

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
            } else if (winNumSet.contains(lotto)) {
                sameCnt++;
            }
        }

        int lowestRank = length - (sameCnt > 0 ? sameCnt : 1) + 1;
        int topRank = (lowestRank == zeroCnt) ? 1 : lowestRank - zeroCnt;

        return new int[] {topRank, lowestRank};
    }
}