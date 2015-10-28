package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      		org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    	}

	@Test
	public void testEmptyString() {
		TTT ttt = new TTT();
		assertEquals("Tic Tac Toe Mothafucka", ttt.print());
	}

}
