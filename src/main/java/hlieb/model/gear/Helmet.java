package hlieb.model.gear;

import hlieb.model.Manufacturer;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

@Entity
@DiscriminatorValue("helmet")  
public class Helmet extends Gear {
@Transient
//	@ManyToMany(cascade=CascadeType.PERSIST)
//	@JoinTable(name="helmet_helmetAccessories", joinColumns = @JoinColumn(name = "id_helmet"), inverseJoinColumns = @JoinColumn(name = "id_helmetAccessories"))
	private Set<HelmetAccessories> helmetAcc = new TreeSet<HelmetAccessories>();



	public Helmet() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Helmet(String modelName, String color, Manufacturer manufacturer) {
		super(modelName, color, manufacturer);
		// TODO Auto-generated constructor stub
	}





	public void addHelmetAccessories(HelmetAccessories ha) {
		this.helmetAcc.add(ha);
	}

	public void removeHelmetAccessories(HelmetAccessories ha) {
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
		return "Helmet [id=" +  super.toString();
	}

}
