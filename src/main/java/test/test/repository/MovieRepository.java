package test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.test.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
