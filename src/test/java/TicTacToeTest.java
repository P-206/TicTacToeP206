package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      		org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    	}

	@Test
	public void testGrid() {
		Game game = new Game();
		assertEquals('-', game.checkGrid(0,0));
		assertEquals('-', game.checkGrid(0,1));
		assertEquals('-', game.checkGrid(0,2));
		assertEquals('-', game.checkGrid(1,0));
		assertEquals('-', game.checkGrid(1,1));
		assertEquals('-', game.checkGrid(1,2));
		assertEquals('-', game.checkGrid(2,0));
		assertEquals('-', game.checkGrid(2,1));
		assertEquals('-', game.checkGrid(2,2));	
	}
	
	@Test
	public void checkTurn() {
		Game game = new Game();
		int temp = game.turn;
		assertEquals(1, temp);
	}
}
