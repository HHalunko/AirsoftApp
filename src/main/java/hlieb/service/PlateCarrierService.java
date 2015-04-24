package hlieb.service;

import hlieb.model.gear.PlateCarrier;

public interface PlateCarrierService {
	
	public void savePlateCarrier(PlateCarrier plateCarrier);

	public PlateCarrier getPlateCarrier(Integer id);

	public Iterable<PlateCarrier> getAllPlateCarriers();

	public void deletePlateCarrier(Integer id);

	PlateCarrier editPlateCarrier(Integer id, PlateCarrier plateCarrier);

}
