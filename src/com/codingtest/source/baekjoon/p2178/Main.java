package com.codingtest.source.baekjoon.p2178;

import java.util.*;

public class Main {
    private static int n;
    private static int m;
    private static int[][] map;
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static final LinkedList<Position> queue = new LinkedList<>();

    public static void main(String[] args) {
        init();
        bfs(0, 0);
        System.out.print(map[n - 1][m - 1]);
    }

    static void init() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new int[n][m];

        scanner.nextLine();

        int i = 0;
        int j = 0;
        while (scanner.hasNextLine()) {
            for (char ch : scanner.nextLine().toCharArray())
                map[i][j++] = ch - '0';
            j = 0;

            if (++i == n)
                break;
        }
    }

    static void bfs(int x, int y) {
        queue.offer(Position.of(x, y));

        main:
        while (!queue.isEmpty()) {
            Position position = queue.poll();

            for (int[] direction : directions) {
                int nextX = position.getX() + direction[0];
                int nextY = position.getY() + direction[1];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;

                if (map[nextX][nextY] == 1) {
                    queue.offer(Position.of(nextX, nextY));
                    map[nextX][nextY] = map[position.getX()][position.getY()] + 1;

                    if (nextX == n - 1 && nextY == m - 1)
                        break main;
                }
            }
        }
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position of(int x, int y) {
        return new Position(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}