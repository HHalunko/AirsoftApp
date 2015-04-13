package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("radio")  
public class Radio extends Gear implements ElectronicGear {



	public Radio(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public Radio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Radio " + super.toString();
	}

}
