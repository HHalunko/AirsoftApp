package hlieb.service;

import hlieb.model.gear.HeadGear;

public interface HeadGearService {
	
	public void saveHeadGear(HeadGear headgear);

	public HeadGear getHeadGear(Integer id);

	public Iterable<HeadGear> getAllHeadGear();

	public void deleteHeadGear(Integer id);

	HeadGear editHeadGear(Integer id, HeadGear headgear);

}
