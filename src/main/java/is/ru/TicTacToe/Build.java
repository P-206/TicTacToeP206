package is.ru.TicTacToe;

public class Build{

    public static int boardSize = 3;
    public static String player1;
    public static String player2;
    public static char[][] grid;
    public static boolean[] availeble_slots;
    public static char turn;
    public static int counter;
    public static char winner;
    public static boolean gameOver;

    public Build(){
        grid = new char[boardSize][boardSize];
        fill(grid);
        turn = 'X';
        availeble_slots = new boolean[] {true, true , true , true, true, true, true, true, true};
        counter = 0;
        winner = '-';
        gameOver = false;
    }

    private void fill(char[][] grid){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                grid[i][j] = '-';
            }
        }
    }
}