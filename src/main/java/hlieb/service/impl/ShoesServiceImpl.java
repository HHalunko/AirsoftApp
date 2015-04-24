package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.ShoesDAO;
import hlieb.model.gear.Shoes;
import hlieb.service.ShoesService;

public class ShoesServiceImpl implements ShoesService{

	@Autowired
	private ShoesDAO dao;

	@Override
	@Transactional
	public void saveShoes(Shoes shoes) {
		dao.save(shoes);
	}

	@Override
	public Shoes getShoes(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Shoes> getAllShoes() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Shoes editShoes(Integer id, Shoes shoes) {
		Shoes newShoes = dao.findOne(id);
		newShoes.setModelName(shoes.getModelName());
		return dao.save(newShoes);
	}

	@Override
	@Transactional
	public void deleteShoes(Integer id) {
		dao.delete(id);
	}

}
