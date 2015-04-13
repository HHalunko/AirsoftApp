package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cargosystem")  
public class CargoSystem extends Gear implements West {

	public CargoSystem() {
		// TODO Auto-generated constructor stub
	}



	public CargoSystem(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "CargoSystem " + super.toString();
	}

}
