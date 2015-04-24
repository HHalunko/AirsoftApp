package hlieb.service.impl;

import hlieb.dao.UnitDAO;
import hlieb.model.Unit;
import hlieb.service.UnitService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class UnitServiceImpl implements UnitService{

	@Autowired
	private UnitDAO dao;

	@Override
	@Transactional
	public void saveUnit(Unit unit) {
		dao.save(unit);
	}

	@Override
	public Unit getUnit(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Unit> getAllUnits() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Unit editUnit(Integer id, Unit unit) {
		Unit newUnit = dao.findOne(id);
		newUnit.setName(unit.getName());
		return dao.save(newUnit);
	}

	@Override
	@Transactional
	public void deleteUnit(Integer id) {
		dao.delete(id);
	}


}
