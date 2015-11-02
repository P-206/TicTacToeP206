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
		do{
			play(Build.turn);
			}while(!Build.gameOver);
    }

	private static void play(char player_turn){
        System.out.println("Player turn: " + player_turn);
        System.out.println("Select slot 1 - 9");
        print(Build.grid);
        move(player_turn, 0); 
    }

    private static void print(char [][] grid){
        for(int i = 0; i < Build.boardSize; i++){
            for(int j = 0; j < Build.boardSize; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	public static void moveTest(char player_turn, int x){
        move(player_turn, x);
    }
	
	private static void move(char player_turn, int x){
        Scanner in = new Scanner(System.in);
        int num = x;
        int temp = 0;

        // for test purposes, by default x will be 0
        if(x == 0) {

            do {
                if (temp > 0) {
                    System.out.println("Invalid input, pick a legal spot!");
                }
                try {
                    num = in.nextInt();
                } catch (java.util.InputMismatchException e) {
                    in.next();
                }

                temp++;
            } while (num < 1 || num > 9 || !Build.availeble_slots[num - 1]);
        }

        if(num == 1){
            Build.grid[0][0] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 2){
            Build.grid[0][1] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 3){
            Build.grid[0][2] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 4){
            Build.grid[1][0] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 5){
            Build.grid[1][1] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 6){
            Build.grid[1][2] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 7){
            Build.grid[2][0] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 8){
            Build.grid[2][1] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
        else if(num == 9){
            Build.grid[2][2] = player_turn;
            Build.availeble_slots[num - 1] = false;
            Build.turn = changeTurn(player_turn);
        }
		
		Build.counter++;
    }
	
	public static char checkWin(){
        return checkWin(Build.grid);
    }

    private static char checkWin(char [][] grid){

        // Check horizontal matches
        if((grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2]) && grid[0][0] != '-'){
            return grid[0][0];
        }

        if((grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2]) && grid[1][0] != '-'){
            return grid[1][0];
        }

        if((grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2]) && grid[2][0] != '-'){
            return grid[2][0];
        }

        // Check vertical matches
        if((grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0]) && grid[0][0] != '-'){
            return grid[0][0];
        }

        if((grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1]) && grid[0][1] != '-'){
            return grid[0][1];
        }

        if((grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2]) && grid[0][2] != '-'){
            return grid[0][2];
        }

        // Check cross matches
        if((grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]) && grid[0][0] != '-'){
            return grid[0][0];
        }

        if((grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0]) && grid[0][2] != '-'){
            return grid[0][2];
        }

        return '-';
    }

	public static void main(String[] args){
        Build world;
        System.out.println("Welcome to TicTacToe");
        Scanner in = new Scanner(System.in);
        char cont = 'y';
        do{
            world = new Build();
            play();
            System.out.println("Press Y and hit Enter to play again!");
            cont = in.next().charAt(0);
        }while(cont == 'y' || cont == 'Y');
        System.out.println("Good Game!");
    }
}