/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author sidhsaho
 */
public class Snake_WA {

    private static int grid[][];
    private static long sumGrid[][][];
    private static long scores[][];
    private static int rows;
    private static int columns;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        columns = sc.nextInt();
        grid = new int[rows][columns];
        sumGrid = new long[2][rows][columns + 1];
        sc.nextLine();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int d = sc.nextInt();
                grid[i][j] = d;
            }
            sc.nextLine();
        }
        System.out.println(getHighestScore());
    }

    public static long getHighestScore() {
        long sum, startM, startMC;
        boolean visited;
        for (int j = columns - 1; j >= 0; --j) {
            for (int i = 0; i < rows; ++i) {
                sum = 0;
                if (grid[i][j] == -1) {
                    sumGrid[0][i][j] = sumGrid[1][i][j] = -1;
                    continue;
                }
                startM = -1;
                startMC = -1;
                visited = false;
                for (int k = i; k >= 0; --k) {
                    if (grid[k][j] == -1) {
                        visited = true;
                        break;
                    }
                    sum += grid[k][j];
                    if (sumGrid[0][k][j + 1] != -1 && (sumGrid[0][k][j + 1] + sum) > startM) {
                        startM = sumGrid[0][k][j + 1] + sum;
                    }
                    if (sumGrid[1][k][j + 1] != -1 && sumGrid[1][k][j + 1] > startMC) {
                        startMC = sumGrid[1][k][j + 1];
                    }
                }
                if (!visited) {
                    sum = 0;
                    for (int k = rows - 1; k > i; --k) {
                        if (grid[k][j] == -1) {
                            visited = true;
                            break;
                        }
                        sum += grid[k][j];
                        if (sumGrid[0][k][j + 1] != -1 && (sumGrid[0][k][j + 1] + sum) > startMC) {
                            startMC = sumGrid[0][k][j + 1] + sum;
                        }
                        if (sumGrid[1][k][j + 1] != -1 && sumGrid[1][k][j + 1] > startMC) {
                            startMC = sumGrid[1][k][j + 1];
                        }
                    }
                }
                sum = 0;
                visited = false;
                for (int k = i; k < rows; ++k) {
                    if (grid[k][j] == -1) {
                        visited = true;
                        break;
                    }
                    sum += grid[k][j];
                    if (sumGrid[0][k][j + 1] != -1 && sumGrid[0][k][j + 1] + sum > startM) {
                        startM = sumGrid[0][k][j + 1] + sum;
                    }
                    if (sumGrid[1][k][j + 1] != -1 && sumGrid[1][k][j + 1] > startMC) {
                        startMC = sumGrid[1][k][j + 1];
                    }
                }
                if (!visited) {
                    sum = 0;
                    for (int k = 0; k < i; ++k) {
                        if (grid[k][j] == -1) {
                            visited = true;
                            break;
                        }
                        sum += grid[k][j];
                        if (sumGrid[0][k][j + 1] != -1 && sumGrid[0][k][j + 1] + sum > startMC) {
                            startMC = sumGrid[0][k][j + 1] + sum;
                        }
                        if (sumGrid[1][k][j + 1] != -1 && sumGrid[1][k][j + 1] > startMC) {
                            startMC = sumGrid[1][k][j + 1];
                        }
                    }
                }

                sumGrid[0][i][j] = startM;
                sumGrid[1][i][j] = startMC;
            }
        }
        long ans = -1;
        for (int i = 0; i < rows; ++i) {
            if (sumGrid[0][i][0] > ans) {
                ans = sumGrid[0][i][0];
            }
            if (sumGrid[1][i][0] > ans) {
                ans = sumGrid[1][i][0];
            }
        }
        return ans;
    }
}
