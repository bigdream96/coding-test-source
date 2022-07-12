package com.codingtest.source.programmers.p77485;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] result = new int[queries.length];
        int[][] map = new int[rows][columns];
        int[][] distances = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int n = 1;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                map[i][j] = n++;

        int order = 0;
        for (int[] q : queries) {
            int x1 = q[0] - 1;
            int y1 = q[1] - 1;
            int x2 = q[2] - 1;
            int y2 = q[3] - 1;
            LinkedList<Position> list = getMovePositionList(of(x1, y1), of(x2, y2), distances);
            int val = 0;
            int min = rows * columns;

            while (!list.isEmpty()) {
                Position pos = list.removeFirst();

                min = Math.min(map[pos.getX()][pos.getY()], min);

                if (val > 0) {
                    int tmp = map[pos.getX()][pos.getY()];
                    map[pos.getX()][pos.getY()] = val;
                    val = tmp;
                } else {
                    val = map[pos.getX()][pos.getY()];
                }
            }

            result[order++] = min;
        }

        return result;
    }

    LinkedList<Position> getMovePositionList(Position from, Position to, int[][] distances) {
        LinkedList<Position> list = new LinkedList<>();
        int idx = 0;

        list.offer(of(from.getX(), from.getY()));

        while (true) {
            Position pos = list.getLast();

            Position next = of(pos.getX() + distances[idx][0], pos.getY() + distances[idx][1]);

            list.offer(next);

            if (next.getX() == from.getX() && next.getY() == from.getY())
                break;

            if (isVertex(next, from, to))
                idx++;
        }

        return list;
    }

    Position of(int x, int y) {
        return new Position(x, y);
    }

    boolean isVertex(Position pos, Position from, Position to) {
        return (pos.getX() == from.getX() && pos.getY() == to.getY())
                || (pos.getX() == to.getX() && pos.getY() == from.getY())
                || (pos.getX() == from.getX() && pos.getY() == from.getY())
                || (pos.getX() == to.getX() && pos.getY() == to.getY());
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}