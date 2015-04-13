package hlieb.model.gear;

import java.util.Set;
import java.util.TreeSet;

public class Helmet extends Gear{

	private static long count;
	private final long id = ++count;
	private Set <HelmetAccessories> helmetAcc = new TreeSet <HelmetAccessories>();
	
	public static long getCount() {
		return count;
	}
	public long getId() {
		return id;
	}
	public void addHelmetAccessories(HelmetAccessories ha){
		this.helmetAcc.add(ha);
	}
	public void removeHelmetAccessories(HelmetAccessories ha){
		this.helmetAcc.remove(ha);
	}
	public Set<HelmetAccessories> getHelmetAcc() {
		return helmetAcc;
	}
	public void setHelmetAcc(Set<HelmetAccessories> helmetAcc) {
		this.helmetAcc = helmetAcc;
	}
	@Override
	public String toString() {
		return "Helmet [id=" + id + "]" + super.toString();
	}

}
