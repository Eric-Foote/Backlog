package backlog_application;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;



public class first_attempt 
{	// This is the first attempt at the backlog application
	
	// Need to fix the gameChooser method to make sure no duplicates are needed
	public static ArrayList<String> gameReader(File f)
	{
		// This function takes the file from main and adds all games in the file into an array list to be returned to main
		ArrayList <String> gameList = new ArrayList <>();
		try 
		{
		BufferedReader fr = new BufferedReader(new FileReader(f));
		while(fr.ready()) {
			gameList.add(fr.readLine());
		}
		fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return gameList;
	}
	public static void gameChooser (ArrayList <String> gameList)
	{
		// Chooses three games at random from the list
		Random r = new Random();
		int numberOfGames = gameList.size();
		int firstChoice = r.nextInt(numberOfGames+1);
		int secondChoice = r.nextInt(numberOfGames+1);
		int thirdChoice = r.nextInt(numberOfGames+1);
		System.out.println(gameList.get(firstChoice));
		System.out.println(gameList.get(secondChoice));
		System.out.println(gameList.get(thirdChoice));
	}
	public static void main(String[] args) 
	{
		// This will read the file and give me 3 "games" to play from it. 
		File f = new File("/home/knighttwisted/eclipse-workspace/Backlog/src/test_list.txt");
		ArrayList <String> gameList = gameReader(f);
		gameChooser(gameList);
		//System.out.println(gameList);
	}

}
