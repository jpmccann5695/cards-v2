package cards;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class THBackEnd {

	CardGroup dealPile;
	THUser user, playerOne, playerTwo, playerThree, dealer, firstToAct;
	int handCount, whosTheDealer, whosFirstToAct, currentPlayers, bigBlind, smallBlind;
	ArrayList<THUser> playersInTheGame;

	public void newGame(int startChips) {
		user = new THUser("User", startChips);
		playerOne = new THUser("Player One", startChips);
		playerTwo = new THUser("Player Two", startChips);
		playerThree = new THUser("Player Three", startChips);
		handCount = 0;
		currentPlayers = 4;
		whosTheDealer = ThreadLocalRandom.current().nextInt(0, 4);
		bigBlind = 2;
		smallBlind = 1;
		playersInTheGame = new ArrayList<>();
		playersInTheGame.add(user);
		playersInTheGame.add(playerOne);
		playersInTheGame.add(playerTwo);
		playersInTheGame.add(playerThree);
		dealer = playersInTheGame.get(whosTheDealer);
	}

	public void newHand() {
		int mainPot = 0;
		dealPile = new CardGroup();
		dealPile.addDeck();
		dealPile.shuffle();
		// Deal to players who are still in the game
		for (int j = 0; j < 2; j++) {
			for (int i = 1; i <= playersInTheGame.size(); i++) {
				playersInTheGame.get((whosTheDealer + i) % currentPlayers).getHand()
						.addCard(dealPile.drawCard());
			}
		}
		if(currentPlayers > 2) {
			if(playersInTheGame.get((whosTheDealer+1)%currentPlayers).getChips()>=smallBlind)
				mainPot+= playersInTheGame.get((whosTheDealer+1)%currentPlayers).betChips(smallBlind);
			else
				mainPot+= playersInTheGame.get((whosTheDealer+1)%currentPlayers).allIn();
			if(playersInTheGame.get((whosTheDealer+2)%currentPlayers).getChips()>=bigBlind)
				mainPot+= playersInTheGame.get((whosTheDealer+2)%currentPlayers).betChips(bigBlind);
			else
				mainPot+= playersInTheGame.get((whosTheDealer+2)%currentPlayers).allIn();
		}
		
		
//		for(int i = 0; i<4; i++) {
//			
//		}
	}
}
