package hlieb.service;

import hlieb.model.gear.Gloves;

public interface GlovesService {
	
	public void saveGloves(Gloves gloves);

	public Gloves getGloves(Integer id);

	public Iterable<Gloves> getAllGloves();

	public void deleteGloves(Integer id);

	Gloves editGloves(Integer id, Gloves gloves);

}
