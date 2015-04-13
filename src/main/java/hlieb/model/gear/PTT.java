package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ptt")  
public class PTT extends Gear implements ElectronicGear {

	public PTT() {
		// TODO Auto-generated constructor stub
	}



	public PTT(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "PTT " + super.toString();
	}

}
