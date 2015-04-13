package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("kneepads")  
public class KneePads extends Gear {



	public KneePads(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public KneePads() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KneePads " + super.toString();
	}
	
}
