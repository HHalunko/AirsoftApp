package hlieb.service;

import hlieb.model.gear.KneePads;

public interface KneePadsService {
	
	public void saveKneePads(KneePads kneepads);

	public KneePads getKneePads(Integer id);

	public Iterable<KneePads> getAllKneePads();

	public void deleteKneePads(Integer id);

	KneePads editKneePads(Integer id, KneePads kneepads);

}
