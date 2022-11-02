package movieinformation;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
	
	public static void main(String[] args) {
		Movie MovieClass = new Movie();
		Movie crayon = new Movie("수수께끼! 꽃피는 천하떡잎학교", 104, "전체 관람가");
		Movie confession = new Movie("자백",105,"15세이상 관람가");
		Movie HighWayFamilly = new Movie("고속도로 가족",129,"15세이상 관람가");
		Movie blackAdam = new Movie("블랙 아담",125,"12세이상 관람가");
		List<Movie> movieList =new ArrayList<>();
		
		movieList.add(crayon);
		movieList.add(confession);
		movieList.add(HighWayFamilly);
		movieList.add(blackAdam);
		
		
		
		
		
		
		
		
		
	}

}
