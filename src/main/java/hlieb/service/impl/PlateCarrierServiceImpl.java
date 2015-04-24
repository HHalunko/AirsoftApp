package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.PlateCarrierDAO;
import hlieb.model.gear.PlateCarrier;
import hlieb.service.PlateCarrierService;

public class PlateCarrierServiceImpl implements PlateCarrierService{

	@Autowired
	private PlateCarrierDAO dao;

	@Override
	@Transactional
	public void savePlateCarrier(PlateCarrier plateCarrier) {
		dao.save(plateCarrier);
	}

	@Override
	public PlateCarrier getPlateCarrier(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<PlateCarrier> getAllPlateCarriers() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public PlateCarrier editPlateCarrier(Integer id, PlateCarrier plateCarrier) {
		PlateCarrier newPlateCarrier = dao.findOne(id);
		newPlateCarrier.setModelName(plateCarrier.getModelName());
		return dao.save(newPlateCarrier);
	}

	@Override
	@Transactional
	public void deletePlateCarrier(Integer id) {
		dao.delete(id);
	}

}
