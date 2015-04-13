package hlieb.model.gear;

import hlieb.model.Manufacturer;

import javax.persistence.*; 
@Entity 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
public abstract class Gear implements Comparable <Gear>{
	@Transient
	private static long count;
	@Id
	@Column(name="id")
	private final long id = ++count;
	@Column(name="model_name")
	private String modelName;
	@Column(name="color")
	private String color;
	@OneToOne
	@JoinColumn(name="id_manufacturer_gear")
	private Manufacturer manufacturer;


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

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Gear(String modelName, String color, Manufacturer manufacturer) {
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
	public int compareTo(Gear o){
		return this.modelName.compareToIgnoreCase(o.modelName);
	}
	
	@Override
	public String toString() {
		return "Gear [modelName=" + modelName + ", color=" + color
				+ ", manufacturer=" + manufacturer + "]";
	}

	
}
