package hlieb.model.gear;

public abstract class Gear {

	private String modelName;
	private String color;
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
	public String toString() {
		return "Gear [modelName=" + modelName + ", color=" + color
				+ ", manufacturer=" + manufacturer + "]";
	}

	
}
