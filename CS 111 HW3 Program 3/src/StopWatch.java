import java.util.Date;

public class StopWatch {

	//DATA MEMEBRS
	private long startTime;
	private long endTime;
	
	//DEFAULT COMNSTRUCTORS
	public StopWatch() {
		startTime = 0;
		endTime = 0;
	}
	
	//FUNCTIOANLITY
	//START Watch
	public void start() {
		Date now = new Date();
		startTime = now.getTime();
	}
	
	//STOP WATCH
	public void stop() {
		Date now = new Date();
		endTime = now.getTime();
	}
	
	//RETURN ELAPSED TIME IN MILISECONDS
	public long getMiliseconds() {
		return endTime - startTime;
	}
}