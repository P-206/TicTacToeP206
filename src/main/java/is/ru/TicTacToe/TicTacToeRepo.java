package is.ru.TicTacToe;

public class TicTacToeRepo{

    public void fill(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = '-';
            }
        }
    }

    public static void main(String[] args) {
        
    }
}