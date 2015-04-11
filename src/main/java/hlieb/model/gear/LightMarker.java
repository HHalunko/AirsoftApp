package hlieb.model.gear;

public class LightMarker extends Gear implements HelmetAccessories {

	public LightMarker() {
		// TODO Auto-generated constructor stub
	}

	public LightMarker(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LightMarker " + super.toString();
	}

	
	
}
