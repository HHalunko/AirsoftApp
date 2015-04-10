package hlieb.model;

import java.util.Set;
import java.util.TreeSet;

public class Camo {
	private static int count;
	private final int id = ++count;
	//unique
	private String name;
	private String info;
	private Set<Team> usingTeams = new TreeSet<Team>();
	private Set<String> manufacturers = new TreeSet<String>();
	private Set<Unit> usingUnits = new TreeSet<Unit>();
	public Camo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camo(String name, String info, Set<Team> usingTeams,
			Set<String> manufacturers, Set<Unit> usingUnits) {
		super();
		this.name = name;
		this.info = info;
		this.usingTeams = usingTeams;
		this.manufacturers = manufacturers;
		this.usingUnits = usingUnits;
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
	public Set<String> getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(Set<String> manufacturers) {
		this.manufacturers = manufacturers;
	}
	public Set<Unit> getUsingUnits() {
		return usingUnits;
	}
	public void setUsingUnits(Set<Unit> usingUnits) {
		this.usingUnits = usingUnits;
	}
	public static int getCount() {
		return count;
	}
	public int getId() {
		return id;
	}
	
	public void addUsingTeam(Team team){
		this.usingTeams.add(team);
	}
	
	public void addUsingUnit(Unit unit){
		this.usingUnits.add(unit);
	}
	
	public void addManufacturer(String manufacturer){
		this.manufacturers.add(manufacturer);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result
				+ ((manufacturers == null) ? 0 : manufacturers.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((usingTeams == null) ? 0 : usingTeams.hashCode());
		result = prime * result
				+ ((usingUnits == null) ? 0 : usingUnits.hashCode());
		return result;
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
	
	
}
