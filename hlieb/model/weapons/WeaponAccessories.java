package hlieb.model.weapons;

import javax.persistence.*;
@Entity
@Table(name="WeaponAccessories")
public class WeaponAccessories {
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
	@Column(name = "manufacturer_WA")
	private String manufacturer;
	@Column(name = "color_WA")
	private String color;

	public WeaponAccessories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeaponAccessories(String modelName, WeaponAccessoriesType type,
			String manufacturer, String color) {
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "WeaponAccessories [id=" + id + ", modelName=" + modelName
				+ ", type=" + type + ", manufacturer=" + manufacturer
				+ ", color=" + color + "]";
	}

	
	
}
