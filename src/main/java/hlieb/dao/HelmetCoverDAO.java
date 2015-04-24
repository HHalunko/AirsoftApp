package hlieb.dao;

import hlieb.model.gear.HelmetCover;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelmetCoverDAO extends CrudRepository<HelmetCover, Integer>{

}
