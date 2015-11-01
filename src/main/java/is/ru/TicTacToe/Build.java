package is.ru.TicTacToe;

public class Build{

    public static int boardSize = 3;
    public static String player1;
    public static String player2;
    public static char[][] grid;
    public static int turn;

    public Build(){
        grid = new char[boardSize][boardSize];
        fill(grid);
        turn = 1;
    }

    private void fill(char[][] grid){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                grid[i][j] = '-';
            }
        }
    }
}