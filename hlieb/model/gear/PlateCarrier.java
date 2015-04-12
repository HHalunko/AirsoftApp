package hlieb.model.gear;

public class PlateCarrier extends Gear implements West {

	public PlateCarrier() {
		// TODO Auto-generated constructor stub
	}

	public PlateCarrier(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlateCarrier " + super.toString();
	}

}
