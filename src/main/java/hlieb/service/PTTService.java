package hlieb.service;

import hlieb.model.gear.PTT;

public interface PTTService {

	public void savePTT(PTT ptt);

	public PTT getPTT(Integer id);

	public Iterable<PTT> getAllPTTs();

	public void deletePTT(Integer id);

	PTT editPTT(Integer id, PTT ptt);

}
