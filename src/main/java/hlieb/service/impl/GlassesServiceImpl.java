package hlieb.service.impl;

import hlieb.dao.GlassesDAO;
import hlieb.model.gear.Glasses;
import hlieb.service.GlassesService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class GlassesServiceImpl implements GlassesService {

	@Autowired
	private GlassesDAO dao;

	@Override
	@Transactional
	public void saveGlasses(Glasses glasses) {
		dao.save(glasses);
	}

	@Override
	public Glasses getGlasses(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Glasses> getAllGlasses() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Glasses editGlasses(Integer id, Glasses glasses) {
		Glasses newGlasses = dao.findOne(id);
		newGlasses.setModelName(glasses.getModelName());
		return dao.save(newGlasses);
	}

	@Override
	@Transactional
	public void deleteGlasses(Integer id) {
		dao.delete(id);
	}

}
