package ruby_practice1;
import java.util.Scanner;
//AUTHOR: Samson Ko
//FILENAME: Pass and fail calculator
//SPECIFICATION: Receives input from the user regarding finals grade, midterm grade, and final grade. Determines failure or passing.
//FOR: CSE 110- Lab #3
//TIME SPENT: 35 minutes

public class test1 {
	public static void main(String[] args) {
		//declares variables
		double finalexamGrade = 50.0;
		double midtermGrade = 50.0;
		double homeworkGrade = 0.0;
		double finalGrade = 0.0;
		char letterGrade = ' ';
		Scanner in = new Scanner(System.in); 
		//prompts user input
		System.out.println("What is the homework grade?");
		homeworkGrade = in.nextDouble();
		System.out.println("What is the midterm grade?");
		midtermGrade = in.nextDouble();
		System.out.println("What is the final exam grade?");
		finalexamGrade = in.nextDouble();
			
		//if(/* put condition here */){
		//checking the conditions in which user input is valid
		if (homeworkGrade >= 0 && homeworkGrade <= 100 && midtermGrade >= 0 && midtermGrade <= 100 && finalGrade >= 0 && finalGrade <= 200) {
			finalGrade = ((finalexamGrade/200)*50) + (midtermGrade*.25) + (homeworkGrade*.25);
		}else{
			System.out.println("What you entered is not valid");
		//if p, then passing. if f, then failing
		}
		if (finalGrade >= 50) {
			letterGrade = 'P';
		}else{
			letterGrade = 'F';
		}
		//displays whether or not the student has passed
		if (letterGrade == 'P') {
			System.out.println("Student has passed!");
		} 
		if (letterGrade == 'F') {
			System.out.println("Student has failed!");
		}	
	} 
}

