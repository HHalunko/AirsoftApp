package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("flashlight")  
public class Flashlight extends Gear implements HelmetAccessories {

	public Flashlight() {
		// TODO Auto-generated constructor stub
	}



	public Flashlight(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Flashlight " + super.toString();
	}

}
