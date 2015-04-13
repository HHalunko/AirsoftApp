package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("irmarker")  
public class IRMarker extends Gear implements HelmetAccessories {


	public IRMarker() {
		// TODO Auto-generated constructor stub
	}

	public IRMarker(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	public String toString() {
		return "IR Marker" + super.toString();
	}

}
