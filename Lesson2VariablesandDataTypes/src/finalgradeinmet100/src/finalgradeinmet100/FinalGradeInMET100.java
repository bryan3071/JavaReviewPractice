/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number) 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */
package finalgradeinmet100;

import java.util.Scanner;

public class FinalGradeInMET100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO: Write solution here.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Score of Test 1");
		double testOne = input.nextInt();
		System.out.println("Enter the Score of Test 2");
		double testTwo = input.nextInt();
		System.out.println("Enter the Score of Test 3");
		double testThree = input.nextInt();
		double totalPoints = testOne + testTwo + testThree;
		double percentage = 100 * totalPoints/450;
		
		System.out.println("Exam 1 Score : " + testOne);
		System.out.println("Exam 2 Score : " + testTwo);
		System.out.println("Exam 3 Score : " + testThree);
		System.out.println("Total points : " + totalPoints);
		System.out.println("Percentage : " + percentage);
		
	}

}
