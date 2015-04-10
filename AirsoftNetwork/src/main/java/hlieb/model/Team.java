package hlieb.model;

import hlieb.model.gear.Gear;
import hlieb.model.weapons.Weapon;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Team {

	private static int count;
	private final int id = ++count;
	//unique
	private String teamName;
	private String info;
	private Location teamLocation;
	private Unit modelOf;
	private Person teamLeader;
	private Set<Person> teamMembers = new TreeSet<Person>();
	private Set<Weapon> teamWeapons = new TreeSet<Weapon>();
	private Set<Camo> teamCamos = new TreeSet<Camo>();
	private Set<Gear> teamGear = new TreeSet<Gear>();
	private LocalDate startOfPeriod;
	private LocalDate endOfPeriod;

	public Team() {
		super();
	}

	public Team(String teamName, Location teamLocation, Unit modelOf,
			Person teamLeader, Set<Person> teamMembers,
			Set<Weapon> teamWeapons, Set<Camo> teamCamos, Set<Gear> teamGear) {
		super();
		this.teamName = teamName;
		this.teamLocation = teamLocation;
		this.modelOf = modelOf;
		this.teamLeader = teamLeader;
		this.teamMembers = teamMembers;
		this.teamWeapons = teamWeapons;
		this.teamCamos = teamCamos;
		this.teamGear = teamGear;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Location getTeamLocation() {
		return teamLocation;
	}

	public void setTeamLocation(Location teamLocation) {
		this.teamLocation = teamLocation;
	}

	public Unit getModelOf() {
		return modelOf;
	}

	public void setModelOf(Unit modelOf) {
		this.modelOf = modelOf;
	}

	public Person getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(Person teamLeader) {
		this.teamLeader = teamLeader;
	}

	public LocalDate getStartOfPeriod() {
		return startOfPeriod;
	}

	public void setStartOfPeriod(LocalDate startOfPeriod) {
		this.startOfPeriod = startOfPeriod;
	}

	public LocalDate getEndOfPeriod() {
		return endOfPeriod;
	}

	public void setEndOfPeriod(LocalDate endOfPeriod) {
		this.endOfPeriod = endOfPeriod;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set<Person> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(Set<Person> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public void addTeamMember(Person teamMember) {
		this.teamMembers.add(teamMember);
	}

	public Set<Weapon> getTeamWeapons() {
		return teamWeapons;
	}

	public void setTeamWeapons(Set<Weapon> teamWeapons) {
		this.teamWeapons = teamWeapons;
	}

	public void addTeamWeapon(Weapon weapon) {
		this.teamWeapons.add(weapon);
	}

	public Set<Camo> getTeamCamos() {
		return teamCamos;
	}

	// Problem with crossclass adding
	// public void setTeamCamos(Set<Camo> teamCamos) {
	// this.teamCamos = teamCamos;
	//
	// }

	public void addTeamCamo(Camo camo) {
		this.teamCamos.add(camo);
		camo.addUsingTeam(this);
	}

	public Set<Gear> getTeamGear() {
		return teamGear;
	}

	public void setTeamGear(Set<Gear> teamGear) {
		this.teamGear = teamGear;
	}

	public void addTeamGear(Gear gear) {
		this.teamGear.add(gear);
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public void removeMember(Person teamMember) {
		this.teamMembers.remove(teamMember);
	}

	public void removeCamo(Camo teamCamo) {
		this.teamCamos.remove(teamCamo);
	}

	public void removeWeapon(Weapon teamWeapon) {
		this.teamWeapons.remove(teamWeapon);
	}

	public void removeGear(Gear teamGear) {
		this.teamGear.remove(teamGear);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((modelOf == null) ? 0 : modelOf.hashCode());
		result = prime * result
				+ ((teamCamos == null) ? 0 : teamCamos.hashCode());
		result = prime * result
				+ ((teamGear == null) ? 0 : teamGear.hashCode());
		result = prime * result
				+ ((teamLeader == null) ? 0 : teamLeader.hashCode());
		result = prime * result
				+ ((teamLocation == null) ? 0 : teamLocation.hashCode());
		result = prime * result
				+ ((teamMembers == null) ? 0 : teamMembers.hashCode());
		result = prime * result
				+ ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result
				+ ((teamWeapons == null) ? 0 : teamWeapons.hashCode());
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
		Team other = (Team) obj;
		if (id != other.id)
			return false;
		if (modelOf == null) {
			if (other.modelOf != null)
				return false;
		} else if (!modelOf.equals(other.modelOf))
			return false;
		if (teamCamos == null) {
			if (other.teamCamos != null)
				return false;
		} else if (!teamCamos.equals(other.teamCamos))
			return false;
		if (teamGear == null) {
			if (other.teamGear != null)
				return false;
		} else if (!teamGear.equals(other.teamGear))
			return false;
		if (teamLeader == null) {
			if (other.teamLeader != null)
				return false;
		} else if (!teamLeader.equals(other.teamLeader))
			return false;
		if (teamLocation == null) {
			if (other.teamLocation != null)
				return false;
		} else if (!teamLocation.equals(other.teamLocation))
			return false;
		if (teamMembers == null) {
			if (other.teamMembers != null)
				return false;
		} else if (!teamMembers.equals(other.teamMembers))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (teamWeapons == null) {
			if (other.teamWeapons != null)
				return false;
		} else if (!teamWeapons.equals(other.teamWeapons))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", info=" + info
				+ ", teamLocation=" + teamLocation + ", modelOf=" + modelOf
				+ ", teamLeader=" + teamLeader + ", teamMembers=" + teamMembers
				+ ", teamWeapons=" + teamWeapons + ", teamCamos=" + teamCamos
				+ ", teamGear=" + teamGear + ", startOfPeriod=" + startOfPeriod
				+ ", endOfPeriod=" + endOfPeriod + "]";
	}



}
