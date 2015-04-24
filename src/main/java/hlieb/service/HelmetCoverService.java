package hlieb.service;

import hlieb.model.gear.HelmetCover;

public interface HelmetCoverService {
	
	public void saveHelmetCover(HelmetCover helmetcover);

	public HelmetCover getHelmetCover(Integer id);

	public Iterable<HelmetCover> getAllHelmetCovers();

	public void deleteHelmetCover(Integer id);

	HelmetCover editHelmetCover(Integer id, HelmetCover helmetcover);

}
