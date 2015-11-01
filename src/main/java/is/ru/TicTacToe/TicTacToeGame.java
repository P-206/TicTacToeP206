package is.ru.TicTacToe;

public class TicTacToeGame{

	int boardSize = 3;
	String player1;
	String player2;
	public static char[][] grid = new char[3][3];
	public static int turn;
	
	public TicTacToeGame(){
		fill(grid);
		turn = 1;
	}
		
	private void fill(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = '-';
            }
        }
	}
	
    public static void main(String[] args) {
		
    }
}