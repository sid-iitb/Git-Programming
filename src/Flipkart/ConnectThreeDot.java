/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flipkart;

/**
 *
 * @author sidhsaho
 */
public class ConnectThreeDot {

    static int grid[][];
    static int size;
    static int slotsToWin;
    static int player;
    static int gridRow;
    static int gridColumn;
    static int currentPlayer;
    static int remainingBox;

    public ConnectThreeDot(int N, int slots) {
        grid = new int[N][N];
        size = N;
        slotsToWin = slots;
        remainingBox = N * N;
    }

    public static void print() {
        System.out.println("GRID UNTIL NOW");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //System.out.print((grid[i][j]==1)?"A ":(grid[i][j]==2)?"B ":"O ");
                if (Main.players.containsValue(grid[i][j])) {
                    for (String o : Main.players.keySet()) {
                        if (Main.players.get(o).equals(grid[i][j])) {
                            System.out.print(o+ " ");
                        }
                    }
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void endGame() {
        if (remainingBox == 0) {
            System.out.println("GRID FILLED UP ITS A DRAW");
            System.exit(0);
        }
    }

    public static boolean dropBall(int player, int column) {
        int row = size - 1;
        currentPlayer = player;
        int success = 0;

        if (!(column >= 0 && column < size)) {

            System.out.println("Invalid move Play Again");
            System.out.println("Input Format <A Or B in CAPS>:<space><column < " + size + " ");
            return false;
        }
        while (row >= 0) {
            if (grid[row][column] == 0) {
                grid[row][column] = player;
                success = 1;
                gridRow = row;
                gridColumn = column;
                row = -2;
                remainingBox--;
            } else {
                row--;
            }
        }

        if (row == -1) {
            System.out.println("Column Filled Up Try Another Column");
            return false;
        } else if (success == 0) {
            System.out.println("Invalid move Play Again");
            return false;
        } else {

            return true;
        }
    }

    public static boolean checkMove() {
        //For Vertical
        int count = 0;
        for (int i = gridColumn - slotsToWin + 1; i <= gridColumn && i >= 0 && i <= size - 1; i++) {
            if (grid[gridRow][i] == currentPlayer) {
                count++;
            }
        }
        if (count == slotsToWin) {
            return true;
        }

        count = 0;
        for (int i = gridColumn; i <= gridColumn + slotsToWin - 1 && i >= 0 && i <= size - 1; i++) {
            if (grid[gridRow][i] == currentPlayer) {
                count++;
            }
        }
        if (count == slotsToWin) {
            return true;
        }

        //For Horizontal
        count = 0;

        for (int i = gridRow; i <= gridRow + slotsToWin - 1 && i >= 0 && i <= size - 1; i++) {
            if (grid[i][gridColumn] == currentPlayer) {
                count++;
            }
        }
        if (count == slotsToWin) {
            return true;
        }

        count = 0;
        for (int i = gridRow - slotsToWin + 1; i <= gridRow && i >= 0 && i <= size - 1; i++) {
            if (grid[i][gridColumn] == currentPlayer) {
                count++;
            }
        }
        return count == slotsToWin;
    }

}
