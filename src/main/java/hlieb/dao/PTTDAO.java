package hlieb.dao;

import hlieb.model.gear.PTT;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PTTDAO extends CrudRepository<PTT, Integer>{

}
