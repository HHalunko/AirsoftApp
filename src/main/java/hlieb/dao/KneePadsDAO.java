package hlieb.dao;

import hlieb.model.gear.KneePads;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KneePadsDAO extends CrudRepository<KneePads, Integer> {

}
