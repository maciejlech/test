package pl.javastart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.javastart.model.User;
 
@Repository
public interface UserRepository  extends CrudRepository<User, Long> {

}
