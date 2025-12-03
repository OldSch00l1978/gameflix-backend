
import com.example.gameflix.model.Movie;
import com.example.gameflix.repository.MovieRepository;
import com.example.gameflix.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        // Sample movies for testing
        List<Movie> movies = List.of(
                new Movie(),
                new Movie(),
                new Movie()
        );

        // Mock repository behavior
        when(movieRepository.findAll()).thenReturn(movies);
    }

    @Test
    void getAllMovies_ShouldReturnList() {
        List<Movie> result = movieService.getAllMovies();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void getAllMovies_FirstMovieShouldNotBeNull() {
        List<Movie> result = movieService.getAllMovies();
        assertNotNull(result.get(0));
    }

    @Test
    void getAllMovies_TwoCallsShouldReturnSameSize() {
        List<Movie> firstCall = movieService.getAllMovies();
        List<Movie> secondCall = movieService.getAllMovies();
        assertEquals(firstCall.size(), secondCall.size());
    }
}

