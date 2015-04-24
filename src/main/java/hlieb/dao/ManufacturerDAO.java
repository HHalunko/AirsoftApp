package hlieb.dao;

import hlieb.model.Manufacturer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerDAO extends CrudRepository<Manufacturer, Integer>{

}
