package hlieb.service;

import hlieb.model.gear.NVG;

public interface NVGService {
	
	public void saveNVG(NVG nvg);

	public NVG getNVG(Integer id);

	public Iterable<NVG> getAllNVGs();

	public void deleteNVG(Integer id);

	NVG editNVG(Integer id, NVG nvg);

}
