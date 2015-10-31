package is.ru.TicTacToe;

import is.ru.TicTacToe.TicTacToeMainLogic;
import is.ru.TicTacToe.TicTacToeUI;
import is.ru.TicTacToe.TicTacToeRepo;


public class TicTacToe{

    public static char[][] grid = new char[3][3];
	public static int turn;
	
    public TicTacToe(){
        fill(grid);
		turn = 1;
    }

    public void fill(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = '-';
            }
        }
    }

    public static char checkGrid(int x, int y){
        return grid[x][y];
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
    }
}
