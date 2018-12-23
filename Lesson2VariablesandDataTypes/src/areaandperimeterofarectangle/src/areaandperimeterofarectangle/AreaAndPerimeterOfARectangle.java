/* Challenge Activity 1
 * 
 * This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the recrangle. 
 * 
 *  Area = Length x Width
 *  Perimeter = 2 x (Length + Width)
 * 
 * SAMPLE RUN: 
 *  Enter Length: 7
 *  Enter Width: 5
 *  Perimeter : 24
 *  Area : 35
 */

package areaandperimeterofarectangle;

import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare variables

        // get length and width with inputs
        
        // perform area, perimeter calculations
        
        // display outputs
		
		//int length;
		//int width;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length");
		int length = input.nextInt();
		System.out.println("Enter Width");
		int width = input.nextInt();
		
		int area = length * width;
		int perimeter = 2*(length + width);
		
		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);
		
		
		
		

	}

}
