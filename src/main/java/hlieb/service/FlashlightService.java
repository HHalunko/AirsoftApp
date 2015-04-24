package hlieb.service;

import hlieb.model.gear.Flashlight;

public interface FlashlightService {
	
	public void saveFlashlight(Flashlight flashlight);

	public Flashlight getFlashlight(Integer id);

	public Iterable<Flashlight> getAllFlashlights();

	public void deleteFlashlight(Integer id);

	Flashlight editFlashlight(Integer id, Flashlight flashlight);

}
