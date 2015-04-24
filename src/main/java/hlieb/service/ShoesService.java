package hlieb.service;

import hlieb.model.gear.Shoes;

public interface ShoesService {
	
	public void saveShoes(Shoes shoes);

	public Shoes getShoes(Integer id);

	public Iterable<Shoes> getAllShoes();

	public void deleteShoes(Integer id);

	Shoes editShoes(Integer id, Shoes shoes);

}
