package hlieb.dao;

import hlieb.model.gear.Shoes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoesDAO extends CrudRepository<Shoes, Integer>{

}
