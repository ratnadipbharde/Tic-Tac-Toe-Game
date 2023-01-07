package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("\t\t* Welcome To Game Tic Tac Toe *");
        System.out.println("--------------------------------------------\n");
        char[] position = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        TicTacToeGame ticTacToeGame=new TicTacToeGame();
        ticTacToeGame.printBoard(position);
        char playerLetter;
        char compLetter='O';
        playerLetter = ticTacToeGame.chooseLetter();
        if(playerLetter=='O'){
            compLetter='X';
        }
        System.out.println("Player Letter :"+playerLetter);
        System.out.println("Computer player Letter : "+compLetter);
    }
}