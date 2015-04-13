package hlieb.model.weapons;


import hlieb.model.Manufacturer;

import javax.persistence.*;
@Entity
@Table(name="WeaponAccessories")
public class WeaponAccessories implements Comparable<WeaponAccessories> {
	@Transient
	private static long count;
	@Id
	@Column(name = "id_WA")
	private final long id = ++count;
	@Column(name = "name_WA")
	private String modelName;
	@Column(name="type_WA")
	@Enumerated(EnumType.STRING)
	private WeaponAccessoriesType type;
	@OneToOne
	@JoinColumn(name = "manufacturer_WA")
	private Manufacturer manufacturer;
	@Column(name = "color_WA")
	private String color;

	public WeaponAccessories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeaponAccessories(String modelName, WeaponAccessoriesType type,
			Manufacturer manufacturer, String color) {
		super();
		this.modelName = modelName;
		this.type = type;
		this.manufacturer = manufacturer;
		this.color = color;
	}



	public WeaponAccessoriesType getType() {
		return type;
	}

	public void setType(WeaponAccessoriesType type) {
		this.type = type;
	}

	public String getModelName() {
		return modelName;
	}

	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(WeaponAccessories o) {
		if(this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else 
			return 0;
	}
	
	@Override
	public String toString() {
		return "WeaponAccessories [id=" + id + ", modelName=" + modelName
				+ ", type=" + type + ", manufacturer=" + manufacturer
				+ ", color=" + color + "]";
	}
	
}
