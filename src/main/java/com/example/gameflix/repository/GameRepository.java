
package com.example.gameflix.repository;

import com.example.gameflix.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
