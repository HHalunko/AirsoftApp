package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.PTTDAO;
import hlieb.model.gear.PTT;
import hlieb.service.PTTService;

public class PTTServiceImpl implements PTTService{

	@Autowired
	private PTTDAO dao;

	@Override
	@Transactional
	public void savePTT(PTT ptt) {
		dao.save(ptt);
	}

	@Override
	public PTT getPTT(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<PTT> getAllPTTs() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public PTT editPTT(Integer id, PTT ptt) {
		PTT newPTT = dao.findOne(id);
		newPTT.setModelName(ptt.getModelName());
		return dao.save(newPTT);
	}

	@Override
	@Transactional
	public void deletePTT(Integer id) {
		dao.delete(id);
	}

}
