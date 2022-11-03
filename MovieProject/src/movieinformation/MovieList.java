package movieinformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MovieList {
	
	 public static void main(String[] args) throws IOException {
		 
		 String crayon = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\CrayonShin_chan.txt"));
		 String conFession = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\ConFession.txt"));
		 String blackAdam = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\BlackAdam.txt"));
		 String highWayFamilly = Files.readString(Paths.get("C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\HighWayFamilly.txt"));
		 
		 System.out.println(crayon);
		 
	 }
	 
	 
	 
	 
}	 