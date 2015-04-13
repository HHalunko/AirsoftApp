package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("shoes")  
public class Shoes extends Gear {

	public Shoes() {
		// TODO Auto-generated constructor stub
	}



	public Shoes(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Shoes " + super.toString();
	}

}
