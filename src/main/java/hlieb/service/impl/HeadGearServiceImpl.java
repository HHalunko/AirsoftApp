package hlieb.service.impl;

import hlieb.dao.HeadGearDAO;
import hlieb.model.gear.HeadGear;
import hlieb.service.HeadGearService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class HeadGearServiceImpl implements HeadGearService {

	@Autowired
	private HeadGearDAO dao;

	@Override
	@Transactional
	public void saveHeadGear(HeadGear headgear) {
		dao.save(headgear);
	}

	@Override
	public HeadGear getHeadGear(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<HeadGear> getAllHeadGear() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public HeadGear editHeadGear(Integer id, HeadGear headgear) {
		HeadGear newHeadGear = dao.findOne(id);
		newHeadGear.setManufacturer(headgear.getManufacturer());
		return dao.save(newHeadGear);
	}

	@Override
	@Transactional
	public void deleteHeadGear(Integer id) {
		dao.delete(id);
	}

}
