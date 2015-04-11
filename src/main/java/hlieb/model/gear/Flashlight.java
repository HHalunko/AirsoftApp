package hlieb.model.gear;

public class Flashlight extends Gear implements HelmetAccessories {

	public Flashlight() {
		// TODO Auto-generated constructor stub
	}

	public Flashlight(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Flashlight " + super.toString();
	}

}
