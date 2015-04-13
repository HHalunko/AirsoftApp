package hlieb.model.gear;

public class PTT extends Gear implements ElectronicGear {

	public PTT() {
		// TODO Auto-generated constructor stub
	}

	public PTT(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PTT " + super.toString();
	}

}
