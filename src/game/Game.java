package game;

import player.*;
import menu.*;
import play.*;

public class Game {
    private Player player;
    private Menu menu;
    private Menu htMenu;
    private Menu finalMenu;
    private int mux;
    private int strikes;

    public Game() {
        player = new Player();
        menu = new Menu("Play", "About", "Quit");
        htMenu = new Menu("Heads", "Tails", "Quit");
        finalMenu = new Menu("Yes", "No (quit)");
        mux = 1;
        strikes = 0;
    }

    public void start() {
        menu.printInitialMenu();
            int choice;
            while ((choice = menu.getMenuChoice()) != 0) {
                switch (choice) {
                    case 1:
                        System.out.println("Let's play!");
                        System.out.println();
                        playGame();
                        break;
                    case 2:
                        menu.printAboutGame();
                        break;
                    case 3:
                        System.exit(0);
                        break;
            }
        }
    }

    private void playGame() {
        htMenu.printChoiceMenu();
        int htChoice;
        while ((htChoice = htMenu.getMenuChoice()) != 0) {
            switch (htChoice) {
                case 1:
                    System.out.println("You picked heads!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You picked tails!");
                    System.out.println();
                    htChoice = 0;  // h = 1, t = 0
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            Play play = new Play(htChoice);
            int result = play.start();
            if (result == 1) {
                strikes++;
                if (strikes > 1) {
                    mux = 2;
                }
                player.getPlayerscore().setIvalue(player.getPlayerscore().getIvalue() + (1 * mux));
                System.out.println("You've won");
                System.out.println("You have " + player.getLifes() + " lives left");
                System.out.println("Your new score is " + player.getPlayerscore().getIvalue());
                System.out.println();
            } else {
                if (player.getLifes() == 0) {

                    System.out.println("You've lost all your lives");
                    System.out.println("Your final score was " + player.getPlayerscore().getIvalue());
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                } else {
                    System.out.println("You've lost one life");
                    strikes = 0;
                    player.setLifes(player.getLifes() - 1);
                    System.out.println("You have " + player.getLifes() + " lives left");
                    System.out.println("Your score is " + player.getPlayerscore().getIvalue());
                    System.out.println();
                }
            }

            if (player.getLifes() != 0) {
                System.out.println("Wanna play again?");
                int finalChoice;
                while ((finalChoice = finalMenu.getMenuChoice()) != 0) {
                    switch (finalChoice) {
                        case 1:
                            System.out.println("Restarting...");
                            System.out.println();
                            playGame();
                            return;
                        case 2:
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                            break;
                    }
                }
            }
        }
    }
}
