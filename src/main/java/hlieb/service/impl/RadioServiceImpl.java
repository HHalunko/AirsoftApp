package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.RadioDAO;
import hlieb.model.gear.Radio;
import hlieb.service.RadioService;

public class RadioServiceImpl implements RadioService{

	@Autowired
	private RadioDAO dao;

	@Override
	@Transactional
	public void saveRadio(Radio radio) {
		dao.save(radio);
	}

	@Override
	public Radio getRadio(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Radio> getAllRadios() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Radio editRadio(Integer id, Radio radio) {
		Radio newRadio = dao.findOne(id);
		newRadio.setModelName(radio.getModelName());
		return dao.save(newRadio);
	}

	@Override
	@Transactional
	public void deleteRadio(Integer id) {
		dao.delete(id);
	}

}
