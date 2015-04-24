package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.WeaponDAO;
import hlieb.model.weapons.Weapon;
import hlieb.service.WeaponService;

public class WeaponServiceImpl implements WeaponService{

	@Autowired
	private WeaponDAO dao;

	@Override
	@Transactional
	public void saveWeapon(Weapon weapon) {
		dao.save(weapon);
	}

	@Override
	public Weapon getWeapon(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Weapon> getAllWeapons() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Weapon editWeapon(Integer id, Weapon weapon) {
		Weapon newWeapon = dao.findOne(id);
		newWeapon.setModel(weapon.getModel());
		return dao.save(newWeapon);
	}

	@Override
	@Transactional
	public void deleteWeapon(Integer id) {
		dao.delete(id);
	}


}
