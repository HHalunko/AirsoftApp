package hlieb.dao;

import hlieb.model.gear.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlovesDAO extends CrudRepository<Gloves, Integer> {

}
