package hlieb.service;

import hlieb.model.Conflict;

public interface ConflictService {
	public void saveConflict(Conflict conflict);
	public Conflict getConflict(Integer id);
	public Iterable<Conflict> getAllConflicts();
	public void deleteConflict(Integer id);
	Conflict editConflict(Integer id, Conflict conflict);
}
