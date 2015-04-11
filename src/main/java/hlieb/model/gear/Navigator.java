package hlieb.model.gear;

public class Navigator extends Gear implements ElectronicGear{

	public Navigator() {
		// TODO Auto-generated constructor stub
	}

	public Navigator(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Navigator " + super.toString();
	}

}
