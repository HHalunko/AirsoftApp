package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@DiscriminatorValue("headgear")  
public class HeadGear extends Gear implements ElectronicGear {

	@Type(type = "yes_no")
	@Column(name="isActive_HeadGear")
	private boolean isActive;

	public HeadGear() {
		
	}



	public HeadGear(String modelName, String color, Manufacturer manufacturer,
			boolean isActive) {
		super(modelName, color, manufacturer);
		this.isActive = isActive;
	}



	public HeadGear(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}



	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isActive ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadGear other = (HeadGear) obj;
		if (isActive != other.isActive)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HeadGear [isActive=" + isActive + super.toString();
	}

}
