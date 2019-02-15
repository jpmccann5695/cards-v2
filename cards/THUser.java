package cards;

public class THUser {
	CardGroup hand = new CardGroup();
	int chips;
	String name;
	public THUser(String name, int chips) {
		this.name= name;
		this.chips = chips;
	}
	
	public void setHand(CardGroup hand) {
		this.hand = hand;
	}
	public CardGroup getHand() {
		return hand;
	}
	public void setChips(int ammount) {
		chips = ammount;
	}
	public void zeroChips() {
		chips = 0;
	}
	public int getChips() {
		return chips;
	}
	public int betChips(int ammount) {
		if(ammount<=chips) {
			chips = chips - ammount;
			return ammount;
		}
		else
			return -1;
	}
	public void addChips(int ammount) {
		chips+= ammount;
	}
	public boolean hasChips() {
		if(chips >0) {
			return true;
		}
		else
			return false;
	}
	public int allIn() {
		int allIn= this.chips;
		this.chips = 0;
		return allIn;
	}
}
