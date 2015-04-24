package hlieb.service;

import hlieb.model.gear.Headwear;

public interface HeadwearService {
	
	public void saveHeadwear(Headwear person);

	public Headwear getHeadwear(Integer id);

	public Iterable<Headwear> getAllHeadwear();

	public void deleteHeadwear(Integer id);

	Headwear editHeadwear(Integer id, Headwear headwear);

}
