import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//CONSTRUCT A SCANNER OBJECT FOR USER INPUT
		Scanner in = new Scanner(System.in);
		
		//CREATE FOUR STRINGS FOR TESTING
		String [] testStrings = 
			{
					"These french fries are very cold!",
					"Close that door so the cold air doesn't come in.",
					"@(%:{?)",
					"pig in the blanket!",	
			};
		
		//CREATE A TEXTING TUTOR APP
		TutorEngine tutor = new TutorEngine();
		
		//POPULATE THE TUTOR W TEST STRINGS
		tutor.populateTestString(testStrings);
		
		//EXECUTE THE TEXTING TUTOR APP
		tutor.runTest(in);
		
		//CHECK RESULTS OF TEXTING TEST
		System.out.println("Final Test Results....");
		System.out.println("Your passed: " + tutor.getcountPassed());
		System.out.println("FINAL SCORE: " + tutor.getFinalScore());
	}
}