package hlieb.dao;

import hlieb.model.gear.Flashlight;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashlightDAO extends CrudRepository<Flashlight, Integer> {

}
