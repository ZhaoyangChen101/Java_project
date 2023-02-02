package gameoflife;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    @Points("15-02.1")
    public void livingNeighborsTest() {
        GameOfLife gameOfLifeInstance = new GameOfLife(3, 3);

        int[][] cells = new int[3][3];
        cells[0][0] = 1;
        cells[0][1] = 1;
        cells[1][1] = 1;
        cells[2][2] = 1;

        assertTrue("Test your program with the first example from the material. Expected element at  0, 0 to have 2 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 0, 0), gameOfLifeInstance.numberOfLivingNeighbors(cells, 0, 0) == 2);
        assertTrue("Test your program with the first example from the material. Expected element at  1, 0 to have 3 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 0), gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 0) == 3);
        assertTrue("Test your program with the first example from the material. Expected element at  1, 1 to have 3 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 1), gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 1) == 3);
        assertTrue("Test your program with the first example from the material. Expected element at  2, 2 to have 1 neighbor. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 2, 2), gameOfLifeInstance.numberOfLivingNeighbors(cells, 2, 2) == 1);
    }

    @Test
    @Points("15-02.1")
    public void livingNeighborsTest2() {
        GameOfLife gameOfLifeInstance = new GameOfLife(4, 4);

        int[][] cells = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}};

        assertTrue("Test your program with the second example from the material. Expected element at  0, 0 to have 3 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 0, 0), gameOfLifeInstance.numberOfLivingNeighbors(cells, 0, 0) == 3);
        assertTrue("Test your program with the second example from the material. Expected element at  1, 1 to have 7 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 1), gameOfLifeInstance.numberOfLivingNeighbors(cells, 1, 1) == 7);
        assertTrue("Test your program with the second example from the material. Expected element at  2, 2 to have 5 neighbors. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 2, 2), gameOfLifeInstance.numberOfLivingNeighbors(cells, 2, 2) == 5);
        assertTrue("Test your program with the second example from the material. Expected element at  3, 3 to have 1 neighbor. Now it had: " + gameOfLifeInstance.numberOfLivingNeighbors(cells, 3, 3), gameOfLifeInstance.numberOfLivingNeighbors(cells, 3, 3) == 1);
    }

}
