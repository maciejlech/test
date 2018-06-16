package pl.javastart.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import pl.javastart.model.Gra;

public interface GraRepository extends CrudRepository<Gra, Long>  {

	Gra findFirstBySiedziba(String siedziba);
	
	List<Gra> findByZloto(int zlotot);
	
	
}
