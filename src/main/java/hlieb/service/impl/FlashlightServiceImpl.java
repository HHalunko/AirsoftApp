package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.FlashlightDAO;
import hlieb.model.gear.Flashlight;
import hlieb.service.FlashlightService;

public class FlashlightServiceImpl implements FlashlightService{

	@Autowired
	private FlashlightDAO dao;

	@Override
	@Transactional
	public void saveFlashlight(Flashlight flashlight) {
		dao.save(flashlight);
	}

	@Override
	public Flashlight getFlashlight(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Flashlight> getAllFlashlights() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Flashlight editFlashlight(Integer id, Flashlight flashlight) {
		Flashlight newFlashlight = dao.findOne(id);
		newFlashlight.setModelName(flashlight.getModelName());
		return dao.save(newFlashlight);
	}

	@Override
	@Transactional
	public void deleteFlashlight(Integer id) {
		dao.delete(id);
	}


}
