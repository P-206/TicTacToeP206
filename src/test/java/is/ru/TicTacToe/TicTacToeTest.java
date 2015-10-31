package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      		org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    	}

	@Test
	public void testGrid() {
		TicTacToe tictactoe = new TicTacToe();
		assertEquals('-', tictactoe.checkGrid(0,0));
		assertEquals('-', tictactoe.checkGrid(0,1));
		assertEquals('-', tictactoe.checkGrid(0,2));
		assertEquals('-', tictactoe.checkGrid(1,0));
		assertEquals('-', tictactoe.checkGrid(1,1));
		assertEquals('-', tictactoe.checkGrid(1,2));
		assertEquals('-', tictactoe.checkGrid(2,0));
		assertEquals('-', tictactoe.checkGrid(2,1));
		assertEquals('-', tictactoe.checkGrid(2,2));	
	}
}
