package hlieb.dao;

import hlieb.model.gear.Radio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioDAO extends CrudRepository<Radio, Integer> {

}
