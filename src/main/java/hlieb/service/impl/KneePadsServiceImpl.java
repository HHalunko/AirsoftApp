package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.KneePadsDAO;
import hlieb.model.gear.KneePads;
import hlieb.service.KneePadsService;

public class KneePadsServiceImpl implements KneePadsService{

	@Autowired
	private KneePadsDAO dao;

	@Override
	@Transactional
	public void saveKneePads(KneePads kneepads) {
		dao.save(kneepads);
	}

	@Override
	public KneePads getKneePads(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<KneePads> getAllKneePads() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public KneePads editKneePads(Integer id, KneePads kneepads) {
		KneePads newKneePads = dao.findOne(id);
		newKneePads.setModelName(kneepads.getModelName());
		return dao.save(newKneePads);
	}

	@Override
	@Transactional
	public void deleteKneePads(Integer id) {
		dao.delete(id);
	}
	
}
