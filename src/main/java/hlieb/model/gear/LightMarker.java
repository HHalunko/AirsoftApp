package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("lightmarker")  
public class LightMarker extends Gear implements HelmetAccessories {

	public LightMarker() {
		// TODO Auto-generated constructor stub
	}



	public LightMarker(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "LightMarker " + super.toString();
	}

	
	
}
