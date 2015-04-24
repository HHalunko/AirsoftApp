package hlieb.service.impl;

import hlieb.dao.HeadwearDAO;
import hlieb.model.gear.Headwear;
import hlieb.service.HeadwearService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class HeadwearServiceImpl implements HeadwearService{

	@Autowired
	private HeadwearDAO dao;

	@Override
	@Transactional
	public void saveHeadwear(Headwear headwear) {
		dao.save(headwear);
	}

	@Override
	public Headwear getHeadwear(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Headwear> getAllHeadwear() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Headwear editHeadwear(Integer id, Headwear headwear) {
		Headwear newHeadwear = dao.findOne(id);
		newHeadwear.setModelName(headwear.getModelName());
		return dao.save(newHeadwear);
	}

	@Override
	@Transactional
	public void deleteHeadwear(Integer id) {
		dao.delete(id);
	}
}
