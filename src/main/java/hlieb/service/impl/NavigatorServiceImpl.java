package hlieb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import hlieb.dao.NavigatorDAO;
import hlieb.model.gear.Navigator;
import hlieb.service.NavigatorService;

public class NavigatorServiceImpl implements NavigatorService{

	@Autowired
	private NavigatorDAO dao;

	@Override
	@Transactional
	public void saveNavigator(Navigator navigator) {
		dao.save(navigator);
	}

	@Override
	public Navigator getNavigator(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Navigator> getAllNavigators() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Navigator editNavigator(Integer id, Navigator navigator) {
		Navigator newNavigator = dao.findOne(id);
		newNavigator.setModelName(navigator.getModelName());
		return dao.save(newNavigator);
	}

	@Override
	@Transactional
	public void deleteNavigator(Integer id) {
		dao.delete(id);
	}

}
