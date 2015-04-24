package hlieb.service;

import hlieb.model.gear.IRMarker;

public interface IRMarkerService {
	public void saveIRMarker(IRMarker irmarker);
	public IRMarker getIRMarker(Integer id);
	public Iterable<IRMarker> getAllIRMarkers();
	public void deleteIRMarker(Integer id);
	IRMarker editIRMarker(Integer id, IRMarker irmarker);

}
