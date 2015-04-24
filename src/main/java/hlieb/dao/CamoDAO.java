package hlieb.dao;

import hlieb.model.Camo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamoDAO extends CrudRepository<Camo, Integer>{

}
