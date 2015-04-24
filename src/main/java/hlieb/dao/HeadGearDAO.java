package hlieb.dao;

import hlieb.model.gear.HeadGear;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadGearDAO extends CrudRepository<HeadGear, Integer> {

}
