package hlieb.dao;

import hlieb.model.gear.Navigator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavigatorDAO extends CrudRepository<Navigator, Integer> {

}
