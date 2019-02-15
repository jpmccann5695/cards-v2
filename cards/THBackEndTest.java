package cards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class THBackEndTest {

	THBackEnd game;
	@Before
	public void setUp() {
		game = new THBackEnd();
		game.newGame(50);
	}

	@Test
	public void dealHand(){
		game.newHand();
		assertEquals(4,game.playersInTheGame.size());
	}
	@Test
	public void userTwoCards() {
		game.newHand();
		assertEquals(2,game.user.getHand().size());
	}
	
	@Test
	public void firstSmallBlind() {
		game.newHand();
		assertEquals(49, game.playersInTheGame.get((game.whosTheDealer +1) % game.currentPlayers).getChips());
	}
	
	@Test
	public void firstBigBlind() {
		game.newHand();
		assertEquals(48, game.playersInTheGame.get((game.whosTheDealer +2) % game.currentPlayers).getChips());
	}
	@Test
	public void bigBlindAllIn() {
		game.whosTheDealer=3;
		game.bigBlind = 100;
		game.newHand();
		
		assertEquals(0, game.playersInTheGame.get((game.whosTheDealer +2) % game.currentPlayers).getChips());
	}
}
