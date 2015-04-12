package hlieb.model.weapons;

public class WeaponAccessories {
	private String modelName;
	private WeaponAccessoriesType type;
	private String manufacturer;
	private String color;

	public WeaponAccessories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeaponAccessories(WeaponAccessoriesType type, String manufacturer, String color) {
		super();
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
		return "Accessories [modelName=" + modelName + ", type=" + type
				+ ", manufacturer=" + manufacturer + ", color=" + color + "]";
	}

	
	
}
