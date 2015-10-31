package is.ru.TicTacToe;

public class TicTacToe{

    private char[][] grid = new char[3][3];
    
    public TicTacToe(){
        fill(grid);
    }

    public void fill(char[][] grid){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = '-';
            }
        }
    }

    public static char checkGrid(int x, int y, char[][] grid ){
        return grid[x][y];
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
    }
}
