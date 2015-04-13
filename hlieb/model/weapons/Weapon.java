package hlieb.model.weapons;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;
@Entity 
@Table(name="Weapon")
public class Weapon {
	@Transient
	private static long count;
	@Id
	@Column(name="id_Weapon")
	private final long id = ++count;
	//unique
	@Column(name="model_Weapon")
	private String model;
	@Column(name="manufacturer_Weapon")
	private String manufacturer;
	@Column(name="prototype_Weapon")
	private String prototype;
	@Column(name="info_Weapon")
	private String info;
	@Column(name="color_Weapon")
	private String color;
	@Column(name="exhaust_Weapon")
	private int exhaust;
	@Enumerated(EnumType.STRING)
	@Column(name="type_Weapon")
	private WeaponType type;
	@Enumerated(EnumType.STRING)
	@Column(name="energy_type_Weapon")
	private WeaponEnergyType energyType;
	@Transient
	private Set<WeaponAccessories> accessories = new TreeSet<WeaponAccessories>();

	public Weapon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weapon(String model, String manufacturer, String prototype,
			String info, String color, int exhaust, WeaponType type,
			WeaponEnergyType energyType, Set<WeaponAccessories> accessories) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.prototype = prototype;
		this.info = info;
		this.color = color;
		this.exhaust = exhaust;
		this.type = type;
		this.energyType = energyType;
		this.accessories = accessories;
	}

	public String getModel() {
		return model;
	}

	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}

	public WeaponEnergyType getEnergyType() {
		return energyType;
	}

	public void setEnergyType(WeaponEnergyType energyType) {
		this.energyType = energyType;
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
		return "Weapon [model=" + model + ", manufacturer=" + manufacturer
				+ ", prototype=" + prototype + ", info=" + info + ", color="
				+ color + ", exhaust=" + exhaust + ", type=" + type
				+ ", energyType=" + energyType + ", accessories=" + accessories
				+ "]";
	}

}
