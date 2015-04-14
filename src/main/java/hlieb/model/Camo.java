package hlieb.model;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

@Entity
@Table(name="Camo")
public class Camo implements Comparable<Camo>{
	@Transient
	private static long count;
	@Id
	@Column(name="id_Camo")
	private final long id = ++count;
	//unique
	@Column(name="name_Camo")
	private String name;
	@Column(name="info_Camo")
	private String info;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="camo_team", joinColumns = @JoinColumn(name = "id_camo"), inverseJoinColumns = @JoinColumn(name = "id_team"))
	private Set<Team> usingTeams = new TreeSet<Team>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="camo_manufacturers", joinColumns = @JoinColumn(name = "id_camo"), inverseJoinColumns = @JoinColumn(name = "id_manufacturer"))
	private Set<Manufacturer> manufacturers = new TreeSet<Manufacturer>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="camo_unit", joinColumns = @JoinColumn(name = "id_camo"), inverseJoinColumns = @JoinColumn(name = "id_unit"))
	private Set<Unit> usingUnits = new TreeSet<Unit>();
	public Camo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camo(String name, String info, Set<Team> usingTeams,
			Set<Manufacturer> manufacturers, Set<Unit> usingUnits) {
		super();
		this.name = name;
		this.info = info;
		this.usingTeams = usingTeams;
		this.manufacturers = manufacturers;
		this.usingUnits = usingUnits;
	}
	
	public Camo(String name, String info) {
		super();
		this.name = name;
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Set<Team> getUsingTeams() {
		return usingTeams;
	}
	public void setUsingTeams(Set<Team> usingTeams) {
		this.usingTeams = usingTeams;
	}
	public Set<Manufacturer> getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(Set<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}
	public Set<Unit> getUsingUnits() {
		return usingUnits;
	}
	public void setUsingUnits(Set<Unit> usingUnits) {
		this.usingUnits = usingUnits;
	}
	public static long getCount() {
		return count;
	}
	public long getId() {
		return id;
	}
	
	public void addUsingTeam(Team team){
		this.usingTeams.add(team);
	}
	
	public void addUsingUnit(Unit unit){
		this.usingUnits.add(unit);
	}
	
	public void addManufacturer(Manufacturer manufacturer){
		this.manufacturers.add(manufacturer);
	}

	@Override
	public int hashCode() {
		return (int) this.id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camo other = (Camo) obj;
		if (id != other.id)
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (manufacturers == null) {
			if (other.manufacturers != null)
				return false;
		} else if (!manufacturers.equals(other.manufacturers))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (usingTeams == null) {
			if (other.usingTeams != null)
				return false;
		} else if (!usingTeams.equals(other.usingTeams))
			return false;
		if (usingUnits == null) {
			if (other.usingUnits != null)
				return false;
		} else if (!usingUnits.equals(other.usingUnits))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Camo [id=" + id + ", name=" + name + ", info=" + info
				+ ", usingTeams=" + usingTeams + ", manufacturers="
				+ manufacturers + ", usingUnits=" + usingUnits + "]";
	}
	@Override
	public int compareTo(Camo o) {
		if(this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else 
			return 0;
	}
	
	
}
