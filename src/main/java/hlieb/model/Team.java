package hlieb.model;

import hlieb.model.gear.Gear;
import hlieb.model.weapons.Weapon;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

@Entity
@Table(name = "Team")
public class Team implements Comparable<Team> {
	@Transient
	private static long count;
	@Id
	@Column(name = "id_Team")
	private final long id = ++count;
	// unique
	@Column(name = "teamName_Team")
	private String teamName;
	@Column(name = "info_Team")
	private String info;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_location_Team")
	private Location teamLocation;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_unit_Team")
	private Unit modelOf;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_teamleader_Team")
	private Person teamLeader;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="team_person", joinColumns = @JoinColumn(name = "id_Team"), inverseJoinColumns = @JoinColumn(name = "id_Person"))
	private Set<Person> teamMembers = new TreeSet<Person>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="team_weapon", joinColumns = @JoinColumn(name = "id_Team"), inverseJoinColumns = @JoinColumn(name = "id_Weapon"))
	private Set<Weapon> teamWeapons = new TreeSet<Weapon>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="team_camo", joinColumns = @JoinColumn(name = "id_Team"), inverseJoinColumns = @JoinColumn(name = "id_Camo"))
	private Set<Camo> teamCamos = new TreeSet<Camo>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="team_gear", joinColumns = @JoinColumn(name = "id_Team"), inverseJoinColumns = @JoinColumn(name = "id_Gear"))
	private Set<Gear> teamGear = new TreeSet<Gear>();
	@Transient
	private LocalDate startOfPeriod;
	@Column(name = "startPeriod_Team")
	private String start;
	@Transient
	private LocalDate endOfPeriod;
	@Column(name = "endPeriod_Team")
	private String end;

	public Team() {
		super();
	}

	public Team(String teamName, String info, Location teamLocation,
			Unit modelOf, Person teamLeader, Set<Person> teamMembers,
			Set<Weapon> teamWeapons, Set<Camo> teamCamos, Set<Gear> teamGear,
			LocalDate startOfPeriod, LocalDate endOfPeriod) {
		super();
		this.teamName = teamName;
		this.info = info;
		this.teamLocation = teamLocation;
		this.modelOf = modelOf;
		this.teamLeader = teamLeader;
		this.teamMembers = teamMembers;
		this.teamWeapons = teamWeapons;
		this.teamCamos = teamCamos;
		this.teamGear = teamGear;
		this.startOfPeriod = startOfPeriod;
		this.endOfPeriod = endOfPeriod;
		this.start = startOfPeriod.toString();
		this.end = endOfPeriod.toString();
	}
	
	public Team(String teamName, String info, Location teamLocation,
			Unit modelOf, Person teamLeader, 
			LocalDate startOfPeriod, LocalDate endOfPeriod) {
		super();
		this.teamName = teamName;
		this.info = info;
		this.teamLocation = teamLocation;
		this.modelOf = modelOf;
		this.teamLeader = teamLeader;
		this.startOfPeriod = startOfPeriod;
		this.endOfPeriod = endOfPeriod;
		this.start = startOfPeriod.toString();
		this.end = endOfPeriod.toString();
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


	 public void setTeamCamos(Set<Camo> teamCamos) {
	 this.teamCamos = teamCamos;
	 }

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

	public static long getCount() {
		return count;
	}

	public long getId() {
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
		Team other = (Team) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (endOfPeriod == null) {
			if (other.endOfPeriod != null)
				return false;
		} else if (!endOfPeriod.equals(other.endOfPeriod))
			return false;
		if (id != other.id)
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (modelOf == null) {
			if (other.modelOf != null)
				return false;
		} else if (!modelOf.equals(other.modelOf))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (startOfPeriod == null) {
			if (other.startOfPeriod != null)
				return false;
		} else if (!startOfPeriod.equals(other.startOfPeriod))
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

	@Override
	public int compareTo(Team o) {
		if (this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else
			return 0;
	}

}
