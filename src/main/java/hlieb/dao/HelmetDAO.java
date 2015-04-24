package hlieb.dao;

import hlieb.model.gear.Helmet;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelmetDAO extends CrudRepository<Helmet, Integer> {

}
