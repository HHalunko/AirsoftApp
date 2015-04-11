package hlieb.model.gear;

public class HelmetCover extends Gear implements HelmetAccessories{

	public HelmetCover() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelmetCover(String modelName, String color, String manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HelmetCover " + super.toString();
	}

}
