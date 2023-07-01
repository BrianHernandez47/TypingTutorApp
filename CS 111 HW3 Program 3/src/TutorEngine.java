import java.util.Scanner;

public class TutorEngine {

	//DATA MEMEBRS
	//CREATE DATA MEMBERS FOR TEXTING TUTOR
	private String[] testStrings;
	private boolean passedTest;
	private long finalTime;
	private int countPassed;
	
	//EXPLICIT CONSTRUCTORS
	//POPULATE THE PRACTICE STRING
	public void populateTestString(String[] testStrings) {
		this.testStrings = testStrings;
	}
	
	//EXECUTE THE TEST
	public void runTest(Scanner in) {
		
		//CREATE A STRING FOR INPUT & INTIALIZE COUNT VARIABLE
		String inputString;
		countPassed = 0;
		
		//CREATE STOPWACTH TO TIME THE TYPING
		StopWatch watch = new StopWatch();
		
		//TYPING TEST
		System.out.println("You will be tested on " + testStrings + " test elements.");
		for(int i = 0; i < testStrings.length; i++) {
			
			//PROMPT USER TO BEGIN & WAIT UNTIL THEY START
			System.out.println("\n\n___________________");
			System.out.println("Test " + (i+1) + ": Hit enter to begin & end");
			inputString = in.nextLine();
			
			//DISPLAY STRING TO TYPE
			System.out.println("Type: " + testStrings[i] + "\n");
			
			//START  & STOP THE WATCH, READ INPUT & STOP WATCH
			watch.start();
			inputString = in.nextLine();
			watch.stop();
			
			//GET FINAL TIME & CHECK FOR CORRECTNESS
			finalTime = watch.getMiliseconds() /1000;
			if(testStrings[i].equals(inputString)){
				passedTest = true;
			}
			else {
				passedTest = false;
				System.out.println("Correctly Typed!");
				countPassed++;
			}
		}
		System.out.println("Your time was: " + (double)finalTime);
	}
	//RETURN NUMBER OF PASSED TEST
	public int getcountPassed() {
		return countPassed;
	}
	//RETURN FINAL SCORE AS A STRING
	public String getFinalScore() {
		return ((double) countPassed / testStrings.length) * 100 + "%";	
	}
}