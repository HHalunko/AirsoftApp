package hlieb.service;

import hlieb.model.gear.Helmet;

public interface HelmetService {
	
	public void saveHelmet(Helmet helmet);

	public Helmet getHelmet(Integer id);

	public Iterable<Helmet> getAllHelmets();

	public void deleteHelmet(Integer id);

	Helmet editHelmet(Integer id, Helmet helmet);

}
