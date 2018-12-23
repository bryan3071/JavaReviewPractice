/* Challenge Activity 3
This challenge activitiy should ask for the following inputs:
- a basketball player's name
- average points per game
- height in inches
and then display the player name, average points per game, 
and height in ft and inches
There are 12 inches in 1 ft. so 75 inches is 6ft 3 inches
 */

package basketballplayer;

import java.util.Scanner;

public class BasketballPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the basketball players name");
		String name = input.nextLine();
		System.out.println("What is the average points per game");
		double points = input.nextDouble();
		System.out.println("What is the players height in inches");
		int height = input.nextInt();
		
		int footHeight = height/12;
		int inchHeight = height % 12;
		
		System.out.println("The Player's name is " + name);
		System.out.println("The Player's average points amount is " + points);
		System.out.println("The Player's height in inches is " + height + " " );
		System.out.println("The Player's height is " + footHeight + " feet " + inchHeight + " inches"  );
		
		
		
		

	}

}
