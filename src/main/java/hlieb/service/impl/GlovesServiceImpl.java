package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.GlovesDAO;
import hlieb.model.gear.Gloves;
import hlieb.service.GlovesService;

public class GlovesServiceImpl implements GlovesService{

	@Autowired
	private GlovesDAO dao;

	@Override
	@Transactional
	public void saveGloves(Gloves gloves) {
		dao.save(gloves);
	}

	@Override
	public Gloves getGloves(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Gloves> getAllGloves() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Gloves editGloves(Integer id, Gloves gloves) {
		Gloves newGloves = dao.findOne(id);
		newGloves.setModelName(gloves.getModelName());
		return dao.save(newGloves);
	}

	@Override
	@Transactional
	public void deleteGloves(Integer id) {
		dao.delete(id);
	}

}
