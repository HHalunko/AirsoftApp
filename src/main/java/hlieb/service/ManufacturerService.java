package hlieb.service;

import hlieb.model.Manufacturer;

public interface ManufacturerService {
	public void saveManufacturer(Manufacturer manufacturer);
	public Manufacturer getManufacturer(Integer id);
	public Iterable<Manufacturer> getAllManufacturers();
	public void deleteManufacturer(Integer id);
	Manufacturer editManufacturer(Integer id, Manufacturer manufacturer);
}
