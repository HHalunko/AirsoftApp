package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

@Entity
@DiscriminatorValue("headwear")  
public class Headwear extends Gear {

	@Enumerated(EnumType.STRING)
	@Column(name="type_Headwear")
	private HeadwearType type;

	public Headwear() {
		// TODO Auto-generated constructor stub
	}



	public Headwear(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	public Headwear(String modelName, String color, Manufacturer manufacturer,
			HeadwearType type) {
		super(modelName, color, manufacturer);
		this.type = type;
	}



	public HeadwearType getType() {
		return type;
	}

	public void setType(HeadwearType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Headwear [type=" + type + super.toString();
	}

}
