package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.HelmetDAO;
import hlieb.model.gear.Helmet;
import hlieb.service.HelmetService;

public class HelmetServiceImpl implements HelmetService{

	@Autowired
	private HelmetDAO dao;

	@Override
	@Transactional
	public void saveHelmet(Helmet helmet) {
		dao.save(helmet);
	}

	@Override
	public Helmet getHelmet(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Helmet> getAllHelmets() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Helmet editHelmet(Integer id, Helmet helmet) {
		Helmet newHelmet = dao.findOne(id);
		newHelmet.setModelName(helmet.getModelName());
		return dao.save(newHelmet);
	}

	@Override
	@Transactional
	public void deleteHelmet(Integer id) {
		dao.delete(id);
	}

	
}
