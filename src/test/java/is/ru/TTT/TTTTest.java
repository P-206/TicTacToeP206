package is.ru.TTT;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TTTTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.TTT.TTTTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals("Tic Tac Toe Mothafucka", TTT.main(""));
	}

}
