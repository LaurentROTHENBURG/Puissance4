package com.company;


import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        // declaration des variables
        String player = "joueur 1";
        int choice = 0;

        // Initialisation du tableau de jeu
        int[][] game = new int[6][7];

        // Edition du tableau vide
        editGame(game);

        // On lance le jeu
        userChoice(scan, player);

        //on enregistre la réponse du joueur
        recordGame(player, game, choice);

    }

    private static void recordGame(String player, int[][] game, int choice) {

    }

    private static int userChoice(Scanner scan, String player) {
        System.out.println(player + ", Choisissez une colonne: ");
        return scan.nextInt() -1;
    }

    private static void editGame(int[][] game) {
        //Affichage de l'entête'
        //Affichage entête
        System.out.print("-----------------------------\n");
        System.out.print("|");

        for (int i = 1; i < (game[0].length + 1); i++) {
            System.out.print(" " + i +  " |");
        }

        System.out.print("\n-----------------------------\n");

        //Affichage tableau

        for (int i = 0; i < game.length; i++) {
            System.out.print("|");

            for (int j = 0; j < game[i].length; j++) {
                //System.out.print(game[i][j] + " ");
                System.out.print("  " + " |");
            }
            System.out.print("\n");
        }
        //Affichage entête
        System.out.print("-----------------------------\n");

    }
}