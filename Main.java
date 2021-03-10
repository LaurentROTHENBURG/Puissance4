package com.company;


import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declaration des variables
            //Permet de stocker la valeur dans le tableau
        int player = 1;
            //Permet de switcher d'utilisateur
        String playerTurn = "Joueur 1";
            //Stocke le coix de l'utilisateur
        int choice = 0;

        //Instructions
            // Initialisation du tableau de jeu
        String[][] game = new String[6][7];

            // Edition du tableau vide
        editGame(game);

            // On lance le jeu
        userChoice(scan, player);

            //on enregistre la réponse du joueur
        recordGame(player, game, choice);

    }

    private static void recordGame(int player, String[][] game, int choice) {

    }

    private static int userChoice(Scanner scan, int player) {
        System.out.println(player + ", Choisissez une colonne: ");
        //On retire -1 pour tenir compte du tableau qui commence à 0
        return scan.nextInt() -1;
    }

    private static void editGame(String[][] game) {
        //Affichage de l'entête'
        //Affichage entête
        System.out.print("-----------------------------\n");
        System.out.print("|");

        for (int i = 1; i < (game[0].length + 1); i++) {
            System.out.print(" " + i + " |");
        }

        System.out.print("\n-----------------------------\n");

        //Affichage tableau

        for (int i = 0; i < game.length; i++) {
            System.out.print("|");

            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] == null) {
                    System.out.print("  " + " |");
                }
                /*else {
                    switch (game[i][j]) {
                        case "1":
                            System.out.print("X" + " | ");
                            break;
                        case "2":
                            System.out.print("O" + " | ");
                            break;
                    }}*/
                }
                System.out.print("\n");
            }
            //Affichage entête
            System.out.print("-----------------------------\n");

        }
    }