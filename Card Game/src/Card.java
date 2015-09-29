import java.util.ArrayList;
import java.util.Collections;
public class Card
	{
		private String suit;
		private String rank;
		private int value;
		static ArrayList<Card>selectedCard=new ArrayList<Card>();
		public Card(String s,String r, int v)
			{
				suit=s;
				rank=r;
				value=v;
			}
		public static void CardSelector()
			{
				selectedCard.add(new Card("Diomonds","Ace",11));
				selectedCard.add(new Card("Diomonds","Two",2));
				selectedCard.add(new Card("Diomonds","Three",3));
				selectedCard.add(new Card("Diomonds","Four",4));
				selectedCard.add(new Card("Diomonds","Five",5));
				selectedCard.add(new Card("Diomonds","Six",6));
				selectedCard.add(new Card("Diomonds","Seven",7));
				selectedCard.add(new Card("Diomonds","Eight",8));
				selectedCard.add(new Card("Diomonds","Nine",9));
				selectedCard.add(new Card("Diomonds","Ten",10));
				selectedCard.add(new Card("Diomonds","Jack",10));
				selectedCard.add(new Card("Diomonds","Queen",10));
				selectedCard.add(new Card("Diomonds","King",10));
				
				selectedCard.add(new Card("Hearts","Ace",11));
				selectedCard.add(new Card("Hearts","Two",2));
				selectedCard.add(new Card("Hearts","Three",3));
				selectedCard.add(new Card("Hearts","Four",4));
				selectedCard.add(new Card("Hearts","Five",5));
				selectedCard.add(new Card("Hearts","Six",6));
				selectedCard.add(new Card("Hearts","Seven",7));
				selectedCard.add(new Card("Hearts","Eight",8));
				selectedCard.add(new Card("Hearts","Nine",9));
				selectedCard.add(new Card("Hearts","Ten",10));
				selectedCard.add(new Card("Hearts","Jack",10));
				selectedCard.add(new Card("Hearts","Queen",10));
				selectedCard.add(new Card("Hearts","King",10));
				
				selectedCard.add(new Card("Spades","Ace",11));
				selectedCard.add(new Card("Spades","Two",2));
				selectedCard.add(new Card("Spades","Three",3));
				selectedCard.add(new Card("Spades","Four",4));
				selectedCard.add(new Card("Spades","Five",5));
				selectedCard.add(new Card("Spades","Six",6));
				selectedCard.add(new Card("Spades","Seven",7));
				selectedCard.add(new Card("Spades","Eight",8));
				selectedCard.add(new Card("Spades","Nine",9));
				selectedCard.add(new Card("Spades","Ten",10));
				selectedCard.add(new Card("Spades","Jack",10));
				selectedCard.add(new Card("Spades","Queen",10));
				selectedCard.add(new Card("Spades","King",10));
				
				selectedCard.add(new Card("Clubs","Ace",11));
				selectedCard.add(new Card("Clubs","Two",2));
				selectedCard.add(new Card("Clubs","Three",3));
				selectedCard.add(new Card("Clubs","Four",4));
				selectedCard.add(new Card("Clubs","Five",5));
				selectedCard.add(new Card("Clubs","Six",6));
				selectedCard.add(new Card("Clubs","Seven",7));
				selectedCard.add(new Card("Clubs","Eight",8));
				selectedCard.add(new Card("Clubs","Nine",9));
				selectedCard.add(new Card("Clubs","Ten",10));
				selectedCard.add(new Card("Clubs","Jack",10));
				selectedCard.add(new Card("Clubs","Queen",10));
				selectedCard.add(new Card("Clubs","King",10));
				
				Collections.shuffle(selectedCard);
				for(Card fred: selectedCard)
					{
						System.out.println(fred.getRank()+" of "+fred.getSuit());
						
					}
			}
		public String getSuit()
			{
				return suit;
			}
		public void setSuit(String suit)
			{
				this.suit = suit;
			}
		public String getRank()
			{
				return rank;
			}
		public void setRank(String cardNumber)
			{
				this.rank = cardNumber;
			}
		public int getValue()
			{
				return value;
			}
		public void setValue(int cardValue)
			{
				this.value = cardValue;
			}
		public static ArrayList<Card> getSelectedCard()
			{
				return selectedCard;
			}
		public static void setSelectedCard(ArrayList<Card> selectedCard)
			{
				Card.selectedCard = selectedCard;
			}
		
	}

