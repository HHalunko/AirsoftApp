package hlieb.service;

import hlieb.model.gear.LightMarker;

public interface LightMarkerService {
	
	public void saveLightMarker(LightMarker lightmarker);

	public LightMarker getLightMarker(Integer id);

	public Iterable<LightMarker> getAllLightMarkers();

	public void deleteLightMarker(Integer id);

	LightMarker editLightMarker(Integer id, LightMarker lightmarker);

}
