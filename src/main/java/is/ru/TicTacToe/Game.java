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

    private static void play(char playerTurn){
        System.out.printf("Player turn: %s\n", sendPlayerName(playerTurn));
        System.out.println("Select slot 1 - 9");
        print(Build.grid);
        move(playerTurn, 0);
        Build.winner = checkWin(Build.grid);
        if(Build.winner != '-'){
            print(Build.grid);
            System.out.println(findWinner(Build.winner));
            Build.gameOver = true;
            gatherStats(Build.winner);
        }
        if(Build.counter >= 9){
            print(Build.grid);
            System.out.println(findWinner(Build.winner));
            Build.gameOver = true;
            gatherStats(Build.winner);
        }
    }


    public static String sendPlayerNameTest(char playerTurn){
        return sendPlayerName(playerTurn);
    }

    private static String sendPlayerName(char playerTurn){
        String playa;
        if(playerTurn == 'X') playa = Build.player1;
        else playa = Build.player2;

        return playa;
    }

    public static String findWinnerTest(char winner){
        return findWinner(winner);
    }

    private static String findWinner(char winner){
        String win;
        if(winner == '-') win = "It's tie!\nBoth players must be very smart!";
        else if(winner == 'X') win = "Player " + Build.player1 + " Wins!";
        else  win = "Player " + Build.player2 + " Wins!";

        return win;
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

    public static void selectNamesTest(String name1, String name2){
        selectNames(name1, name2);
    }

    private static void selectNames(String name1, String name2){
        if(!name1.isEmpty()) Build.player1 = name1;
        else Build.player1 = "X";

        if(!name2.isEmpty()) Build.player2 = name2;
        else Build.player2 = "O";
    }

    public static void chooseNames(){
        Scanner in = new Scanner(System.in);
        String name1, name2;
        System.out.println("Player1\nType your name:\n" + "Press enter for default name.");
        name1 = in.nextLine();
        System.out.println("Player2\nType your name:\n" + "Press enter for default name.");
        name2 = in.nextLine();
        selectNames(name1, name2);
    }

    public static void gatherStatsTest(char result){
        gatherStats(result);
    }

    private static void gatherStats(char result){
        if(result == 'X') Build.player1Wins += 1;
        else if(result == 'O') Build.player2Wins += 1;
        else Build.gameTies += 1;
    }

    public static void printStats(){
        double totalRounds = totalRounds();
        double player1WinRatio = ratioCalc(returnPlayer(Build.player1), totalRounds);
        double player2WinRatio = ratioCalc(returnPlayer(Build.player2), totalRounds);
        double tieRatio = ratioCalc('-', totalRounds);
        System.out.printf("Player %s has a winning ratio of %.2f %% or %d victories.\n", Build.player1, player1WinRatio, Build.player1Wins);
        System.out.printf("Player %s has a winning ratio of %.2f %% or %d victories.\n", Build.player2, player2WinRatio, Build.player2Wins);
        System.out.printf("Player %s and %s have a tie ratio of %.2f%% or %d ties.", Build.player1, Build.player2, tieRatio, Build.gameTies);
    }

    public static char returnPlayerTest(String player){      
        return returnPlayer(player);
    }

    private static char returnPlayer(String player){
        char tmp;
        if(Build.player1 == player ) tmp = 'X';
        else tmp = 'O';
        
        return tmp;
    }


    public static double totalRoundsTest(){
        return totalRounds();
    }

    private static double totalRounds(){
        return Build.player1Wins + Build.player2Wins + Build.gameTies;
    }

    public static double ratioCalcTest(char playerIndicator, double totalRounds){
        return ratioCalc(playerIndicator, totalRounds);
    }


    private static double ratioCalc(char playerIndicator, double totalRounds){
        double tmp = 0;
        if(playerIndicator == 'X') tmp = (Build.player1Wins/totalRounds)*100;

        if(playerIndicator == 'O') tmp = (Build.player2Wins/totalRounds)*100;

        if(playerIndicator == '-') tmp = (Build.gameTies/totalRounds)*100;

        return tmp;
    }

    public static void main(String[] args){
        Build world;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe");
        chooseNames();
        char cont = 'y';
        do{
            world = new Build();
            play();
            System.out.println("Press Y and hit Enter to play again!");
            System.out.println("Press any other key and hit Enter to quit!");
            cont = in.next().charAt(0);
        }while(cont == 'y' || cont == 'Y');
        System.out.println("Good Game!");
        printStats();
    }
}