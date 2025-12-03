
package com.example.gameflix.service;

import com.example.gameflix.model.Game;
import com.example.gameflix.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    // Get all games
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    // Get a game by ID
    public Game getGameById(Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with ID: " + id));
    }

    // Save a new game
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    // Update an existing game
    public Game updateGame(Long id, Game game) {
        Game existingGame = getGameById(id);
        existingGame.setTitle(game.getTitle());
        existingGame.setPlatform(game.getPlatform());
        return gameRepository.save(existingGame);
    }

    // Delete a game by ID
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}

