package hlieb.model.gear;

public class Gloves extends Gear{

	public Gloves() {
		// TODO Auto-generated constructor stub
	}

	public Gloves(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gloves " + super.toString();
	}

}
