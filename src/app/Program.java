package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow, that´s awesome!");
		
		Post p1 = new Post(
				sdp.parse("21/06/2018 13:05:44"), 
				"Traveling to new zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		
	}

}
