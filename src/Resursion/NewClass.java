/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 *
 * @author sidhsaho
 */
public class NewClass {

    public static void main(String args[]) {

        System.out.println(doesCircleExist("GRGL"));
    }

    static String doesCircleExist(String commands) {
        int initialX = 0;
		int initialY = 0;
		
		int x = 0;
		int y = 0;
		String direction = "north";
		
		for (int i = 0; i < commands.length(); i++) {
			
			if (direction.equals("north")) {
				if (commands.charAt(i) == 'G') {
					y++;
				} else if (commands.charAt(i) == 'L') {
					direction = "west";
				} else if (commands.charAt(i) == 'R') {
					direction = "east";
				} else {
					System.out.println("Wrong command");
				}
			} else if (direction.equals("east")) {
				if (commands.charAt(i) == 'G') {
					x++;
				} else if (commands.charAt(i) == 'L') {
					direction = "north";
				} else if (commands.charAt(i) == 'R') {
					direction = "south";
				} else {
					System.out.println("Wrong command");
				}
			} else if (direction.equals("south")) {
				if (commands.charAt(i) == 'G') {
					y--;
				} else if (commands.charAt(i) == 'L') {
					direction = "east";
				} else if (commands.charAt(i) == 'R') {
					direction = "west";
				} else {
					System.out.println("Wrong command");
				}
			} else if (direction.equals("west")) {
				if (commands.charAt(i) == 'G') {
					x--;
				} else if (commands.charAt(i) == 'L') {
					direction = "south";
				} else if (commands.charAt(i) == 'R') {
					direction = "north";
				} else {
					System.out.println("Wrong command");
				}
			}
		}
		
		if (direction.equals("north") && (((x-initialX)*(x-initialX) + (y-initialY)*(y-initialY)) > 0)) {
			return "NO";
		} else {
			return "YES";
		}
    }

}
