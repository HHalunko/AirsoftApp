package hlieb.dao;


import hlieb.model.Unit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UnitDAO extends CrudRepository<Unit, Integer>{

}
