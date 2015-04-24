package hlieb.dao;

import hlieb.model.gear.PlateCarrier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlateCarrierDAO extends CrudRepository<PlateCarrier, Integer> {

}
