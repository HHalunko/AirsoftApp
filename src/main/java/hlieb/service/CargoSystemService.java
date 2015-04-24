package hlieb.service;

import hlieb.model.gear.CargoSystem;

public interface CargoSystemService {
	
	public void saveCargoSystem(CargoSystem cargosystem);

	public CargoSystem getCargoSystem(Integer id);

	public Iterable<CargoSystem> getAllCargoSystems();

	public void deleteCargoSystem(Integer id);

	CargoSystem editCargoSystem(Integer id, CargoSystem cargosystem);

}
