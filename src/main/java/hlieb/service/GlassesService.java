package hlieb.service;

import hlieb.model.gear.Glasses;

public interface GlassesService {
	public void saveGlasses(Glasses glasses);
	public Glasses getGlasses(Integer id);
	public Iterable<Glasses> getAllGlasses();
	public void deleteGlasses(Integer id);
	Glasses editGlasses(Integer id, Glasses glasses);

}
