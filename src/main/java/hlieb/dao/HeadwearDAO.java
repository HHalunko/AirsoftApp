package hlieb.dao;

import hlieb.model.gear.Headwear;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadwearDAO extends CrudRepository<Headwear, Integer> {

}
