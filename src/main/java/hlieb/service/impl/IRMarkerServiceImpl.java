package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.IRMarkerDAO;
import hlieb.model.gear.IRMarker;
import hlieb.service.IRMarkerService;

public class IRMarkerServiceImpl implements IRMarkerService{

	@Autowired
	private IRMarkerDAO dao;

	@Override
	@Transactional
	public void saveIRMarker(IRMarker irmarker) {
		dao.save(irmarker);
	}

	@Override
	public IRMarker getIRMarker(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<IRMarker> getAllIRMarkers() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public IRMarker editIRMarker(Integer id, IRMarker irmarker) {
		IRMarker newIRMarker = dao.findOne(id);
		newIRMarker.setModelName(irmarker.getModelName());
		return dao.save(newIRMarker);
	}

	@Override
	@Transactional
	public void deleteIRMarker(Integer id) {
		dao.delete(id);
	}

}
