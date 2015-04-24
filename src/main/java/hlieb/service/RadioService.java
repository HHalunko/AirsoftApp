package hlieb.service;

import hlieb.model.gear.Radio;

public interface RadioService {
	
	public void saveRadio(Radio radio);

	public Radio getRadio(Integer id);

	public Iterable<Radio> getAllRadios();

	public void deleteRadio(Integer id);

	Radio editRadio(Integer id, Radio radio);

}
