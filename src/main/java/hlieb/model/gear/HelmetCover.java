package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("helmetcover")  
public class HelmetCover extends Gear implements HelmetAccessories{


	public HelmetCover() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HelmetCover(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "HelmetCover " + super.toString();
	}

}
