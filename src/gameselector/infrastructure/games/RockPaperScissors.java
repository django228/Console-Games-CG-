package gameselector.infrastructure.games;

import gameselector.domain.Game;

public class RockPaperScissors extends Game {
    public RockPaperScissors() {
        super("Rock Paper Scissors");
    }

    @Override
    public void play() {
        System.out.println("Starting Rock Paper Scissors...");
        //TODO
    }
}