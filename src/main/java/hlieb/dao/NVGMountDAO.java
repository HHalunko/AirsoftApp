package hlieb.dao;

import hlieb.model.gear.NVGMount;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NVGMountDAO extends CrudRepository<NVGMount, Integer> {

}
