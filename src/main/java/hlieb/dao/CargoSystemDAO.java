package hlieb.dao;

import hlieb.model.gear.CargoSystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoSystemDAO extends CrudRepository<CargoSystem, Integer> {

}
