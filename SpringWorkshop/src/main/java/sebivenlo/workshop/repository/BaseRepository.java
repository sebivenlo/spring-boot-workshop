package sebivenlo.workshop.repository;

import java.util.List;
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
    Optional<T> findOne(int id);
    
    /**
     * Retrieves all entries in the corresponding table.
     * 
     * @return list of all entries
     */
    List<T> findAll();
    
    /**
     * Creates or updates an entity.
     * 
     * @param t entity
     * @return the saved entity containing it's id
     */
    Optional<T> save(T t);
    
    /**
     * Deletes an entity.
     * 
     * @param t entity
     */
    void delete(T t);
}
