package Exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Sidhartha Sahoo
 */
public class Main {

    private static int path[][];
    private static int query[][];
    private static int noOfCitites;
    private static int noOfQueries;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        noOfCitites = sc.nextInt();
        noOfQueries = sc.nextInt();
        int i = 0;
        path = new int[noOfCitites - 1][2];
        while (i < noOfCitites - 1) {
            path[i][0] = sc.nextInt();
            path[i][1] = sc.nextInt();
            i++;
        }
        i = 0;
        query = new int[noOfQueries][2];
        while (i < noOfQueries) {
            query[i][0] = sc.nextInt();
            query[i][1] = sc.nextInt();
            i++;
        }
        getPath();
    }

    public static void getPath() {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= noOfCitites; ++i) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] a : path) {
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }
        HashMap<Integer, Boolean> city = new HashMap<>();
        city.put(1, true);
        for (int[] a : query) {
            //If new festive city
            if (a[0] == 1) {
                city.put(a[1], true);
            } //Find shortest distance
            else {
                shortestDistance(graph, city, a[1]);
            }
        }
    }

    public static void shortestDistance(HashMap<Integer, List<Integer>> graph, HashMap<Integer, Boolean> city, int start) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        visited.put(start, 0);
        q.offer(start);
        while (!q.isEmpty()) {
            int current = q.poll();
            if (city.containsKey(current)) {
                System.out.println(visited.get(current));
                break;
            }
            for (int n : graph.get(current)) {
                if (!visited.containsKey(n)) {
                    visited.put(n, visited.get(current) + 1);
                    q.add(n);
                }
            }
        }
    }
}
