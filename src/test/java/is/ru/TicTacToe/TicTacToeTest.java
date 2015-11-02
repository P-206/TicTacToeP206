package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]){
      		org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    	}

	@Test
	public void testGrid(){
		Build grid = new Build();
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
	public void checkBuildWorldInitializer(){
		Build grid = new Build();
		Game game = new Game();
		assertEquals(3, game.boardSize);
		assertEquals('X', game.turn);
		assertEquals(0, game.counter);
		assertEquals('-', game.winner);
		assertEquals(false, game.gameOver);
	}
	
	@Test
	public void checkTurn(){
		Build game = new Build();
		int temp = game.turn;
		assertEquals(1, temp);
	}
	
	@Test
	public void checkMove(){
		Build game = new Build();
		int temp = game.turn;
		assertEquals(1, temp);
	}

	@Test
	public void checkTurn1(){
		Build grid = new Build();
		Game game = new Game();
		assertEquals(0, game.changeTurn(grid.turn));
	}
}
