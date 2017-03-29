package Exam1;

import java.util.Scanner;

/**
 *
 * @author Sidhartha Sahoo
 */
public class Main {

    private static int grid[][];
    private static long sumGrid[][][];
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
        long highestSum = -1;
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
                    sum = sum + grid[k][j];
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
                        sum = sum + grid[k][j];
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
        for (int i = 0; i < rows; ++i) {
            if (sumGrid[0][i][0] > highestSum) {
                highestSum = sumGrid[0][i][0];
            }
            if (sumGrid[1][i][0] > highestSum) {
                highestSum = sumGrid[1][i][0];
            }
        }
        return highestSum;
    }
}
