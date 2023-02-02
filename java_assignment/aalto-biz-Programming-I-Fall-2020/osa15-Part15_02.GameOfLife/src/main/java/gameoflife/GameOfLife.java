package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] cells;

    public GameOfLife(int width, int height) {
        this.cells = new int[width][height];
    }

    public void initializeWithRandomValues() {
        Random randomNumberMaker = new Random();

        int x = 0;
        while (x < cells.length) {

            int y = 0;
            while (y < cells[x].length) {
                if (randomNumberMaker.nextDouble() < 0.2) {
                    cells[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void evolve() {
        int[][] copy = new int[this.cells.length][this.cells[0].length];

    }

    public int[][] getCells() {
        return cells;
    }

    public void setCells(int[][] cells) {
        this.cells = cells;
    }

    public int numberOfLivingNeighbors(int[][] cells, int x, int y) {
        return 0;
    }
}
