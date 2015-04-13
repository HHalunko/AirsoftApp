package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("nvg")  
public class NVG extends Gear implements ElectronicGear {

	public NVG() {
		super();
		// TODO Auto-generated constructor stub
	}



	public NVG(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "NVG " + super.toString();
	}
	
}
