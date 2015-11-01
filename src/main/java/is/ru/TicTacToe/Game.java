package is.ru.TicTacToe;

import java.util.Scanner;

public class Game{

    public Game(){

    }

    public static char checkGrid(int x, int y){
        return Build.grid[x][y];
    }

    public static char changeTurn(char turn){
        if(turn == 'X'){
            turn = 'O';
        } else {
            turn = 'X';
        }

        return turn;
    }

    public static void play(){
        play(Build.turn);
    }

    private static void play(char player_turn){
        System.out.print("Player turn: ");
        System.out.println(player_turn);
        System.out.println("Select slot 1 - 9");
        print(Build.grid);

        //move(player_turn);
    }

    private static void move(char player_turn){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    }

    private static void print(char [][] grid){
        for(int i = 0; i < Build.boardSize; i++){
            for(int j = 0; j < Build.boardSize; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Build world = new Build();
        System.out.println("Welcome to TicTacToe");
        play();
    }
}