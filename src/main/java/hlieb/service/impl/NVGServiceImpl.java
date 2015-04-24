package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.NVGDAO;
import hlieb.model.gear.NVG;
import hlieb.service.NVGService;

public class NVGServiceImpl implements NVGService{

	@Autowired
	private NVGDAO dao;

	@Override
	@Transactional
	public void saveNVG(NVG nvg) {
		dao.save(nvg);
	}

	@Override
	public NVG getNVG(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<NVG> getAllNVGs() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public NVG editNVG(Integer id, NVG nvg) {
		NVG newNVG = dao.findOne(id);
		newNVG.setModelName(nvg.getModelName());
		return dao.save(newNVG);
	}

	@Override
	@Transactional
	public void deleteNVG(Integer id) {
		dao.delete(id);
	}

}
