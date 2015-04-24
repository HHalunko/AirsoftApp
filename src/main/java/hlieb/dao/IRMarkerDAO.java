package hlieb.dao;

import hlieb.model.gear.IRMarker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRMarkerDAO extends CrudRepository<IRMarker, Integer>{

}
