package is.ru.TicTakToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTakToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.TicTakToe.TicTakToeTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals("Tic Tac Toe Mothafucka", TicTakToe.main(""));
	}

}
