package hlieb.service.impl;

import hlieb.dao.ConflictDAO;
import hlieb.model.Conflict;
import hlieb.service.ConflictService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class ConflictServiceImpl implements ConflictService{

	@Autowired
	private ConflictDAO dao;

	@Override
	@Transactional
	public void saveConflict(Conflict conflict) {
		dao.save(conflict);
	}

	@Override
	public Conflict getConflict(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Conflict> getAllConflicts() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Conflict editConflict(Integer id, Conflict conflict) {
		Conflict newConflict = dao.findOne(id);
		newConflict.setOperationName(conflict.getOperationName());
		return dao.save(newConflict);
	}

	@Override
	@Transactional
	public void deleteConflict(Integer id) {
		dao.delete(id);
	}


}
