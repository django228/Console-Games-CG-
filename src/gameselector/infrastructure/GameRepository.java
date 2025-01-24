package gameselector.infrastructure;

import gameselector.domain.Game;
import gameselector.domain.IGameRepository;
import gameselector.infrastructure.games.RockPaperScissors;
import gameselector.infrastructure.games.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class GameRepository implements IGameRepository {
    @Override
    public List<Game> getAllGames() {
        List<Game> games = new ArrayList<>();
        games.add(new TicTacToe());
        games.add(new RockPaperScissors());
        return games;
    }
}
