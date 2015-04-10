package hlieb.model.weapons;

public class GrenadeLauncher extends Weapon{
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
		return "Greande Launcher [id=" + id + "]" + super.toString();
	}
}
