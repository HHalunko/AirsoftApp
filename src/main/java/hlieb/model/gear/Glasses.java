package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("glasses")  
public class Glasses extends Gear {
	@Enumerated(EnumType.STRING)
	@Column(name = "lense_Glasses")
	private GlassesLense lense;

	public Glasses() {
		// TODO Auto-generated constructor stub
	}



	public Glasses(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	public Glasses(String modelName, String color, Manufacturer manufacturer,
			GlassesLense lense) {
		super(modelName, color, manufacturer);
		this.lense = lense;
	}



	public GlassesLense getLense() {
		return lense;
	}

	@Override
	public String toString() {
		return "Glasses lense " + lense.toString();
	}

}
