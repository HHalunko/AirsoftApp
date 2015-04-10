package hlieb.model.weapons;

public class Melee extends Weapon{
	private static long count;
	private final long id = ++count;
	private String material;
	public static long getCount() {
		return count;
	}
	public long getId() {
		return id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Melee [id=" + id + "]" + super.toString();
	}
}
