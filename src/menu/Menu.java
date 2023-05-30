package menu;

import java.util.Scanner;

public class Menu {
    private String[] menuArgs;
    private int lengthQuit;

    public Menu(String... menuArgs) {
        this.menuArgs = menuArgs;
        this.lengthQuit = menuArgs.length;
    }

    public int getMenuChoice() {
        for (int index = 0; index < menuArgs.length; index++) {
            System.out.println((index + 1) + ". " + menuArgs[index]);
        }

        System.out.print("Choose an option: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return userChoice;
    }

    public void justPrintMenu() {
        for (int index = 0; index < menuArgs.length; index++) {
            System.out.println((index + 1) + ". " + menuArgs[index]);
        }
    }

    public void printInitialMenu() {
        System.out.println("============== BLINDER HEADS AND TAILS GAME V1.3 ==============");
        System.out.println("Welcome to heads and tails game");
        System.out.println("Please select an option:");
    }

    public void printAboutGame() {
        System.out.println();
        System.out.println("This is a simple heads or tails game");
        System.out.println("where you pick your choice and let fate");
        System.out.println("decides which one will be the winner");
        System.out.println("developed by blinder inc.");
        System.out.println();
    }

    public void printChoiceMenu() {
        System.out.println("Pick your side:");
    }

    public int getLengthQuit() {
        return lengthQuit;
    }
}
