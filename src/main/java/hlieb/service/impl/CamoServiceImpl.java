package hlieb.service.impl;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.CamoDAO;
import hlieb.model.Camo;
import hlieb.service.CamoService;
public class CamoServiceImpl implements CamoService{

	@Autowired
	private CamoDAO dao;

	@Override
	@Transactional
	public void saveCamo(Camo camo) {
		dao.save(camo);
	}

	@Override
	public Camo getCamo(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Camo> getAllCamos() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Camo editCamo(Integer id, Camo camo) {
		Camo newCamo = dao.findOne(id);
		newCamo.setName(camo.getName());
		return dao.save(newCamo);
	}

	@Override
	@Transactional
	public void deleteCamo(Integer id) {
		dao.delete(id);
	}


}
