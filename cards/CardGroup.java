package cards;

import java.util.ArrayList;
import java.util.Collections;

public class CardGroup {
	ArrayList<Card> cards;
	public CardGroup() {
		cards = new ArrayList<Card>();
	}
	public CardGroup(ArrayList<Card> cards) {
		this.cards = cards;	
	}
	
	void shuffle() {
		Collections.shuffle(cards);
	}
	void addCard(Card input) {
		cards.add(input);
	}
	void removeFirstCard() {
		cards.remove(0);
	}
	void removeCardAt(int i) {
		cards.remove(i);
	}
	Card drawCard() {
		Card drawCard = cards.get(0);
		this.removeFirstCard();
		return drawCard;
	}
	public void addDeck(){
		cards.add(new Card("Diamond","Ace",1,0));
		cards.add(new Card("Diamond","Two",2,0));
		cards.add(new Card("Diamond","Three",3,0));
		cards.add(new Card("Diamond","Four",4,0));
		cards.add(new Card("Diamond","Five",5,0));
		cards.add(new Card("Diamond","Six",6,0));
		cards.add(new Card("Diamond","Ace",7,0));
		cards.add(new Card("Diamond","Eight",8,0));
		cards.add(new Card("Diamond","Nine",9,0));
		cards.add(new Card("Diamond","Ten",10,0));
		cards.add(new Card("Diamond","Jack",11,0));
		cards.add(new Card("Diamond","Queen",12,0));
		cards.add(new Card("Diamond","King",13,0));
		cards.add(new Card("Club","Ace",1,1));
		cards.add(new Card("Club","Two",2,1));
		cards.add(new Card("Club","Three",3,1));
		cards.add(new Card("Club","Four",4,1));
		cards.add(new Card("Club","Five",5,1));
		cards.add(new Card("Club","Six",6,1));
		cards.add(new Card("Club","Ace",7,1));
		cards.add(new Card("Club","Eight",8,1));
		cards.add(new Card("Club","Nine",9,1));
		cards.add(new Card("Club","Ten",10,1));
		cards.add(new Card("Club","Jack",11,1));
		cards.add(new Card("Club","Queen",12,1));
		cards.add(new Card("Club","King",13,1));
		cards.add(new Card("Heart","Ace",1,2));
		cards.add(new Card("Heart","Two",2,2));
		cards.add(new Card("Heart","Three",3,2));
		cards.add(new Card("Heart","Four",4,2));
		cards.add(new Card("Heart","Five",5,2));
		cards.add(new Card("Heart","Six",6,2));
		cards.add(new Card("Heart","Ace",7,2));
		cards.add(new Card("Heart","Eight",8,2));
		cards.add(new Card("Heart","Nine",9,2));
		cards.add(new Card("Heart","Ten",10,2));
		cards.add(new Card("Heart","Jack",11,2));
		cards.add(new Card("Heart","Queen",12,2));
		cards.add(new Card("Heart","King",13,2));
		cards.add(new Card("Spade","Ace",1,3));
		cards.add(new Card("Spade","Two",2,3));
		cards.add(new Card("Spade","Three",3,3));
		cards.add(new Card("Spade","Four",4,3));
		cards.add(new Card("Spade","Five",5,3));
		cards.add(new Card("Spade","Six",6,3));
		cards.add(new Card("Spade","Ace",7,3));
		cards.add(new Card("Spade","Eight",8,3));
		cards.add(new Card("Spade","Nine",9,3));
		cards.add(new Card("Spade","Ten",10,3));
		cards.add(new Card("Spade","Jack",11,3));
		cards.add(new Card("Spade","Queen",12,3));
		cards.add(new Card("Spade","King",13,3));
	}
	public int size() {
		return cards.size();
	}
}
