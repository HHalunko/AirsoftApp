package hlieb.model.gear;

public class NVG extends Gear implements HelmetAccessories {

	public NVG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NVG(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NVG " + super.toString();
	}
	
}
