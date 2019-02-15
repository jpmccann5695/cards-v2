package cards;

public class Card {
	
	int point;
	int suitCode;
	String suit;
	String value;
	public Card(String suit, String value, int point, int suitCode) {
		this.suit = suit;
		this.value = value;
		this.point = point;
		this.suitCode = suitCode;
		
	}
	public void setPoint(int newValue) {
		this.point = newValue;
	}
	public int getPoint() {
		return point;
	}
	public void setSuit(String newValue) {
		this.suit = newValue;
	}
	public String getSuit() {
		return suit;
	}
	public void setValue(String newValue) {
		this.value = newValue;
	}
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return "The " + value + " of " + suit;
	}
}
