package is.ru.TicTacToe;

public class Game{

    public Game(){

    }

    public static char checkGrid(int x, int y){
        return Build.grid[x][y];
    }

    public static void main(String[] args) {
        Build world = new Build();
        System.out.print(checkGrid(1,1));
    }
}
