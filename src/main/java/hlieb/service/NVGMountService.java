package hlieb.service;

import hlieb.model.gear.NVGMount;

public interface NVGMountService {
	
	public void saveNVGMount(NVGMount nvgmount);

	public NVGMount getNVGMount(Integer id);

	public Iterable<NVGMount> getAllNVGMounts();

	public void deleteNVGMount(Integer id);

	NVGMount editNVGMount(Integer id, NVGMount nvgmount);

}
