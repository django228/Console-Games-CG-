package gameselector.domain;

public abstract class Game {
    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();
}