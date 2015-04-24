package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.LightMarkerDAO;
import hlieb.model.gear.LightMarker;
import hlieb.service.LightMarkerService;

public class LightMarkerServiceImpl implements LightMarkerService{

	@Autowired
	private LightMarkerDAO dao;

	@Override
	@Transactional
	public void saveLightMarker(LightMarker lightmarker) {
		dao.save(lightmarker);
	}

	@Override
	public LightMarker getLightMarker(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<LightMarker> getAllLightMarkers() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public LightMarker editLightMarker(Integer id, LightMarker lightmarker) {
		LightMarker newLightMarker = dao.findOne(id);
		newLightMarker.setModelName(lightmarker.getModelName());
		return dao.save(newLightMarker);
	}

	@Override
	@Transactional
	public void deleteLightMarker(Integer id) {
		dao.delete(id);
	}
	
}
