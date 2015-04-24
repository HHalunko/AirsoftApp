package hlieb.service;

import hlieb.model.Unit;

public interface UnitService {
	
	public void saveUnit(Unit unit);

	public Unit getUnit(Integer id);

	public Iterable<Unit> getAllUnits();

	public void deleteUnit(Integer id);

	Unit editUnit(Integer id, Unit unit);
}
