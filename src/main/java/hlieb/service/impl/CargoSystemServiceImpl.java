package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.CargoSystemDAO;
import hlieb.model.gear.CargoSystem;
import hlieb.service.CargoSystemService;

public class CargoSystemServiceImpl implements CargoSystemService{
	@Autowired
	private CargoSystemDAO dao;

	@Override
	@Transactional
	public void saveCargoSystem(CargoSystem cargosystem) {
		dao.save(cargosystem);
	}

	@Override
	public CargoSystem getCargoSystem(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<CargoSystem> getAllCargoSystems() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public CargoSystem editCargoSystem(Integer id, CargoSystem cargosystem) {
		CargoSystem newCargoSystem = dao.findOne(id);
		newCargoSystem.setModelName(cargosystem.getModelName());
		return dao.save(newCargoSystem);
	}

	@Override
	@Transactional
	public void deleteCargoSystem(Integer id) {
		dao.delete(id);
	}


}
