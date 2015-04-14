package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("helmet")
public class Helmet extends Gear {

	public Helmet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Helmet(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Helmet [id=" + super.toString();
	}

}
