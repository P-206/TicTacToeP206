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
		Build world = new Build();
		Game game = new Game();
		assertEquals(3, world.boardSize);
		assertEquals('X', world.turn);
		assertEquals(0, world.counter);
		assertEquals('-', world.winner);
		assertEquals(false, world.gameOver);
	}
	
	@Test
	public void testMove(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		assertEquals('X', game.checkGrid(0,0));
	}
	
	@Test
	public void testCounterIncrease(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 3);
		assertEquals(3, world.counter);
	}
	

	//X O X
	//O X O
	//X - -
	//Test check
	@Test
	public void testCheckWinner(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 6);
		game.moveTest(world.turn, 7);
		assertEquals('X', game.checkWin());
	}

	//X O O
	//- X -
	//- - X
	//Test check 
	@Test
	public void testCehcWinner1(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 9);
		assertEquals('X', game.checkWin());
	}
	//X - O
	//X - O
	//X - -
	//Test check X wins
	@Test
	public void testCehcWinner3(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 6);
		game.moveTest(world.turn, 7);
		assertEquals('X', game.checkWin());
	}


	//X O X
	//- - -
	//- - -
	//Test checks if winner has not emerged.
	@Test
	public void testCheckWinner4(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 3);
		assertEquals('-', game.checkWin());
	}
	
}