import java.util.Collections;
import java.util.Scanner;
public class War
	{
		public static void Rules()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input your name.");
				String Name = userInput.nextLine();
				System.out.println("Welcome to war "+Name);
				System.out.println(" ");
				System.out.println("Here are the rules of War: ");
				System.out.println("There are 2 Players each player getting 26 card delt face down in a stack.");
				System.out.println("Each player turns up a card at the same time and the player with the higher");
				System.out.println("card takes both cards and puts them, face down on top of a stack.");
				System.out.println("The player with the most cards collected wins. ");
				System.out.println(" ");
				System.out.println("You will be playing against a computer, good luck ");
				System.out.println("");
			}
		public static void Deck()
			{
				Collections.shuffle(Card.selectedCard);
			}
		public static void ThroughTheCards()
			{
				 
			}
		
	}
