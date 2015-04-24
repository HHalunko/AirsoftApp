package hlieb.service;

import hlieb.model.Camo;

public interface CamoService {

	public void saveCamo(Camo camo);
	public Camo getCamo(Integer id);
	public Iterable<Camo> getAllCamos();
	public void deleteCamo(Integer id);
	Camo editCamo(Integer id, Camo camo);

}
