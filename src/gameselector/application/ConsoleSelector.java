package gameselector.application;

import gameselector.domain.Game;
import gameselector.domain.GameService;
import gameselector.infrastructure.GameRepository;

import java.util.List;
import java.util.Scanner;

public class ConsoleSelector {
    private final GameService gameService;

    public ConsoleSelector() {
        GameRepository repository = new GameRepository();
        this.gameService = new GameService(repository);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        List<Game> games = gameService.getAllGames();

        System.out.println("=== Welcome to the Game Selector ===");

        while (true) {
            System.out.println("Choose a game to play or type 'exit' to quit:");
            for (int i = 0; i < games.size(); i++) {
                System.out.println((i + 1) + ". " + games.get(i).getName());
            }

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice < 1 || choice > games.size()) {
                    System.out.println("Invalid choice. Please try again.");
                } else {
                    games.get(choice - 1).play();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }
}
