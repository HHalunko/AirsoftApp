package hlieb.model.gear;

import javax.persistence.*; 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
public abstract class Gear {
	@Column(name="model_name")
	private String modelName;
	@Column(name="color")
	private String color;
	@Column(name="manufacturer")
	private String manufacturer;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Gear(String modelName, String color, String manufacturer) {
		super();
		this.modelName = modelName;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public Gear() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((modelName == null) ? 0 : modelName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gear other = (Gear) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gear [modelName=" + modelName + ", color=" + color
				+ ", manufacturer=" + manufacturer + "]";
	}

	
}