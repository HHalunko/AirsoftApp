package hlieb.model.gear;

public class Headwear extends Gear {
	private HeadwearType type;

	public Headwear() {
		// TODO Auto-generated constructor stub
	}

	public Headwear(String modelName, String color, String manufacturer,
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
