package hlieb.model.weapons;

import java.util.Set;
import java.util.TreeSet;

public abstract class Weapon {
	
	//unique
	private String model;
	private String manufacturer;
	private String prototype;
	private String info;
	private String color;
	private int exhaust;
	private WeaponType type;
	private Set<WeaponAccessories> accessories = new TreeSet<WeaponAccessories>();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPrototype() {
		return prototype;
	}

	public void setPrototype(String prototype) {
		this.prototype = prototype;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getExhaust() {
		return exhaust;
	}

	public void setExhaust(int exhaust) {
		this.exhaust = exhaust;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public Set<WeaponAccessories> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<WeaponAccessories> accessories) {
		this.accessories = accessories;
	}



	@Override
	public String toString() {
		return "[model=" + model + ", manufacturer="
				+ manufacturer + ", prototype=" + prototype + ", info=" + info
				+ ", color=" + color + ", exhaust=" + exhaust + ", type="
				+ type + ", accessories=" + accessories + "]";
	}
	
}
