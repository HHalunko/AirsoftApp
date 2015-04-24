package hlieb.dao;

import hlieb.model.weapons.Weapon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponDAO extends CrudRepository<Weapon, Integer> {

}
