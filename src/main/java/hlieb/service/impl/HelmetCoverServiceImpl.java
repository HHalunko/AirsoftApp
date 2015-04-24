package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.HelmetCoverDAO;
import hlieb.model.gear.HelmetCover;
import hlieb.service.HelmetCoverService;

public class HelmetCoverServiceImpl implements HelmetCoverService {

	@Autowired
	private HelmetCoverDAO dao;

	@Override
	@Transactional
	public void saveHelmetCover(HelmetCover helmetcover) {
		dao.save(helmetcover);
	}

	@Override
	public HelmetCover getHelmetCover(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<HelmetCover> getAllHelmetCovers() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public HelmetCover editHelmetCover(Integer id, HelmetCover helmetcover) {
		HelmetCover newHelmetCover = dao.findOne(id);
		newHelmetCover.setModelName(helmetcover.getModelName());
		return dao.save(newHelmetCover);
	}

	@Override
	@Transactional
	public void deleteHelmetCover(Integer id) {
		dao.delete(id);
	}

}
