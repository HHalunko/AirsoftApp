package hlieb.model.gear;

public class Radio extends Gear implements ElectronicGear {

	public Radio(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public Radio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Radio " + super.toString();
	}

}
