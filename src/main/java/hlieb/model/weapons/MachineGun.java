package hlieb.model.weapons;

public class MachineGun extends Weapon{
	private static long count;
	private final long id = ++count;
	public static long getCount() {
		return count;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Machine Gun [id=" + id + "]" + super.toString();
	}
}
