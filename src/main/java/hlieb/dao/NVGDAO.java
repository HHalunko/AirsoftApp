package hlieb.dao;

import hlieb.model.gear.NVG;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NVGDAO extends CrudRepository<NVG, Integer>{

}
