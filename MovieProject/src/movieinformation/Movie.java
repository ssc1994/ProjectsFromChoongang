package movieinformation;

public class Movie {
	
	private String movieName;
	private int runningTime;
	private String ageLimit;
	
	
	public Movie() {}
	
	public Movie(String movieName, int runningTime , String ageLimit ) {
		this.movieName = movieName;
		this.runningTime = runningTime;
		this.ageLimit = ageLimit;
		
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public int getRunningTime() {
		return this.runningTime;
	}
	
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	public String getAgeLimit() {
		return this.ageLimit;
	}
	
	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	public void movieInfo(Movie name) {
		System.out.println( "영화이름= " + movieName + ", 러닝타임= " + runningTime+"분" + ", ageLimit= "
				+ ageLimit); 
	}

	
	
}
