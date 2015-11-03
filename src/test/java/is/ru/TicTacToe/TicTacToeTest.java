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
	//Test check diagonal left to right (X)
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
	//Test check diagonal left to right (X)
	@Test
	public void testCheckWinner1(){
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
	//Test check left Vertical (X)
	@Test
	public void testCheckWinner3(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 6);
		game.moveTest(world.turn, 7);
		assertEquals('X', game.checkWin());
	}

	//O X O
	//- X -
	//- X -
	//Test check if middle Vertical (X)
	@Test
	public void testCheckWinner4(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 8);
		assertEquals('X', game.checkWin());
	}


	//O O X
	//- - X
	//- - X
	//Test check if middle Vertical (X)
	@Test
	public void testCheckWinner5(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 6);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 9);
		assertEquals('X', game.checkWin());
	}

	//X O X
	//- - -
	//- - -
	//Test checks if winner has not emerged.
	@Test
	public void testCheckWinner6(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 3);
		assertEquals('-', game.checkWin());
	}

	//O O O
	//X X -
	//- - -
	//Test checks horizontal top winner (0).
	@Test
	public void testCheckWinner7(){
		Build world = new Build();
		Game game = new Game();
		world.turn = game.changeTurn(world.turn);
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 3);
		assertEquals('O', game.checkWin());
	}

	//X X -
	//O O O
	//- - -
	//Test checks horizontal middle winner (0).
	@Test
	public void testCheckWinner8(){
		Build world = new Build();
		Game game = new Game();
		world.turn = game.changeTurn(world.turn);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 6);
		assertEquals('O', game.checkWin());
	}


	//X X -
	//- - -
	//O O O
	//Test checks horizontal bottom winner (0).
	@Test
	public void testCheckWinner8(){
		Build world = new Build();
		Game game = new Game();
		world.turn = game.changeTurn(world.turn);
		game.moveTest(world.turn, 7);
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 8);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 9);
		assertEquals('O', game.checkWin());
	}


	//X O X
	//O X O
	//O X X
	//Test checks if winner has not emerged.
	@Test
	public void testCheckTie(){
		Build world = new Build();
		Game game = new Game();
		game.moveTest(world.turn, 1);
		game.moveTest(world.turn, 2);
		game.moveTest(world.turn, 3);
		game.moveTest(world.turn, 4);
		game.moveTest(world.turn, 5);
		game.moveTest(world.turn, 6);
		game.moveTest(world.turn, 8);
		game.moveTest(world.turn, 7);
		game.moveTest(world.turn, 9);
		assertEquals(9, world.counter);
	}
	
}