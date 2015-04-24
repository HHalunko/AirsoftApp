package hlieb.dao;

import hlieb.model.gear.Glasses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlassesDAO extends CrudRepository<Glasses, Integer>{

}
