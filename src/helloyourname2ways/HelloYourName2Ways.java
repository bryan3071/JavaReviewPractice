/* Challenge Activity 1
Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge
Hello, Michael Fudge!  
Or should I say: Fudge, Michael!
*/

package helloyourname2ways;

import java.util.Scanner;

public class HelloYourName2Ways {
	
	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("What is your first name");
    	String firstName = scnr.nextLine();
    	System.out.println("What is your last name");
    	String lastName = scnr.nextLine();
    	System.out.println("Hello" + " " + firstName + " " + lastName);
    	System.out.println("Or should I say " + lastName + ", " + firstName + "!");

    }

}
