package gameselector.domain;

import java.util.List;

public class GameService {
    private final IGameRepository repository;

    public GameService(IGameRepository repository) {
        this.repository = repository;
    }

    public List<Game> getAllGames() {
        return repository.getAllGames();
    }
}