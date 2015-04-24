package hlieb.service.impl;

import hlieb.dao.ManufacturerDAO;
import hlieb.model.Manufacturer;
import hlieb.service.ManufacturerService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	private ManufacturerDAO dao;

	@Override
	@Transactional
	public void saveManufacturer(Manufacturer manufacturer) {
		dao.save(manufacturer);
	}

	@Override
	public Manufacturer getManufacturer(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Manufacturer> getAllManufacturers() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Manufacturer editManufacturer(Integer id, Manufacturer manufacturer) {
		Manufacturer newManufacturer = dao.findOne(id);
		newManufacturer.setName(manufacturer.getName());
		return dao.save(newManufacturer);
	}

	@Override
	@Transactional
	public void deleteManufacturer(Integer id) {
		dao.delete(id);
	}

}
