package sebivenlo.workshop.repository;

import java.util.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;


/**
 * Base class for all repositories.
 * 
 * @author merve
 */
@NoRepositoryBean
public interface BaseRepository<T> extends Repository<T, Integer> {
    
    /**
     * Retrieves an entity by it's id.
     * 
     * @param id primary key
     * @return optional of T (entity)
     */
    Optional<T> findById(int id);
}
