package org.example;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("\t\t* Welcome To Game Tic Tac Toe *");
        System.out.println("--------------------------------------------\n");
        char position[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        printBoard(position);
    }

    private static void printBoard(char position[]) {

        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[1] + "  |  " + position[2] + "  |  " + position[3] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[4] + "  |  " + position[5] + "  |  " + position[6] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[7] + "  |  " + position[8] + "  |  " + position[9] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
    }
}