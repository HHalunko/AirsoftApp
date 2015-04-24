package hlieb.service;

import hlieb.model.gear.Navigator;

public interface NavigatorService {
	
	public void saveNavigator(Navigator navigator);

	public Navigator getNavigator(Integer id);

	public Iterable<Navigator> getAllNavigators();

	public void deleteNavigator(Integer id);

	Navigator editNavigator(Integer id, Navigator navigator);

}
