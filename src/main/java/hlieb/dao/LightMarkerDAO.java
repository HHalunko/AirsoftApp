package hlieb.dao;

import hlieb.model.gear.LightMarker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightMarkerDAO extends CrudRepository<LightMarker, Integer> {

}
