/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flipkart;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sidhsaho
 */
public class Main {

    static HashMap<String, Integer> players = new HashMap();

    public static void main(String[] args) {
        int size = 5;
        int slotsToWin = 3;
        int noOfPlayers = 2;
        ConnectThreeDot s = new ConnectThreeDot(size, slotsToWin);
        Scanner sc = new Scanner(System.in);
        //Hashmap of players not implemented

        players.put("A", 1);
        players.put("B", 2);
        players.put("C", 3);
        if (slotsToWin > size && slotsToWin < 0 && size < 0) {
            System.out.println("Metadata condition check error: slots to win >0 and grid size>0 and slots to win > size");
            System.exit(0);
        }
        System.out.println("CONNECT THREE GAME FOR TWO PLAYERS IN A " + size + " * " + size + " GRID");
        System.out.println("CONSECUTIVE SLOTS NEEDED TO WIN IS " + slotsToWin);
        System.out.println("INPUT FORMAT <A Or B in CAPS>:<space><column < " + size + " ");
        boolean win = false;
        while (win != true) {
            String input[] = sc.nextLine().split(": ");
            if (players.containsKey(input[0])) {
                if (ConnectThreeDot.dropBall(players.get(input[0]), Integer.parseInt(input[1]) - 1)) {
                    ConnectThreeDot.print();
                    if (ConnectThreeDot.checkMove()) {
                        win = true;
                        System.out.println("Player " + input[0] + " wins");
                        System.exit(0);
                    }
                } else {

                }

            } else {

                System.out.println("No Such Players");
            }

            ConnectThreeDot.endGame();

        }

    }
}
