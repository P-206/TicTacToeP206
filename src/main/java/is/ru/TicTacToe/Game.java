package is.ru.TicTacToe;

public class Game{

    public Game(){

    }

    public static char checkGrid(int x, int y){
        return Build.grid[x][y];
    }

    public static int changeTurn(int turn){
    	if(turn == 1){
    		turn = 0;
    	} else {
    		turn = 1;
    	}

    	return turn;
    }

    public static void main(String[] args) {
        Build world = new Build();
        System.out.print("Welcome to TicTacToe");
    }
}
