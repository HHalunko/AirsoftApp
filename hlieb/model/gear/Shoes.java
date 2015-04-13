package hlieb.model.gear;

public class Shoes extends Gear {

	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public Shoes(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Shoes " + super.toString();
	}

}
