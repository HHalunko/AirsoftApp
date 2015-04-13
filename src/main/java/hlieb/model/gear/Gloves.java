package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("gloves")  
public class Gloves extends Gear{

	public Gloves() {
		// TODO Auto-generated constructor stub
	}



	public Gloves(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Gloves " + super.toString();
	}

}
