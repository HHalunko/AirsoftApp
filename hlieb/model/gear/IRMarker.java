package hlieb.model.gear;

public class IRMarker extends Gear implements HelmetAccessories {

	public IRMarker() {
		// TODO Auto-generated constructor stub
	}
	
	public IRMarker(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return "IR Marker" + super.toString();
	}

}
