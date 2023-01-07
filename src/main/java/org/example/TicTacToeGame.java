package org.example;

import java.util.Scanner;

public class TicTacToeGame {
    public char chooseLetter() {
        System.out.print("Please Chose Your letter (X or O) :");
        Scanner sc=new Scanner(System.in);
        return sc.next().toUpperCase().charAt(0);
    }

    public void printBoard(char[] position) {
        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[1] + "  |  " + position[2] + "  |  " + position[3] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[4] + "  |  " + position[5] + "  |  " + position[6] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
        System.out.println("\t\t\t|  " + position[7] + "  |  " + position[8] + "  |  " + position[9] + "  |");
        System.out.println("\t\t\t|-----|-----|-----|");
    }
}