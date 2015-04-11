package hlieb.model.gear;

public class Glasses extends Gear {
	private GlassesLense lense;

	public Glasses() {
		// TODO Auto-generated constructor stub
	}

	public Glasses(String modelName, String color, String manufacturer,
			GlassesLense value) {
		super(modelName, color, manufacturer);
		this.lense = value;
		// TODO Auto-generated constructor stub
	}

	public GlassesLense getLense() {
		return lense;
	}

	@Override
	public String toString() {
		return "Glasses lense " + lense.toString();
	}

}
