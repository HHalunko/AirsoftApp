package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;
@Entity
@DiscriminatorValue("nvgmount")  
public class NVGMount extends Gear implements HelmetAccessories {

	public NVGMount() {
		// TODO Auto-generated constructor stub
	}



	public NVGMount(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "NVGMount " + super.toString();
	}

}
