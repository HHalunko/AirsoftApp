package hlieb.model;

import hlieb.model.gear.Gear;
import hlieb.model.weapons.Weapon;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

@Entity
@Table(name = "Unit")
public class Unit implements Comparable <Unit>{
	@Transient
	private static long count;
	@Id
	@Column(name = "id_Unit")
	private final long id = ++count;
	// unique
	@Column(name="name_Unit")
	private String name;
	@Column(name="country_Unit")
	private String country;
	@Column(name="info_Unit")
	private String info;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="unit_conflict", joinColumns = @JoinColumn(name = "id_unit"), inverseJoinColumns = @JoinColumn(name = "id_conflict"))
	private Set<Conflict> conflictsParticipated = new TreeSet<Conflict>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="unit_camo", joinColumns = @JoinColumn(name = "id_unit"), inverseJoinColumns = @JoinColumn(name = "id_camo"))
	private Set<Camo> camosInUse = new TreeSet<Camo>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="unit_weapon", joinColumns = @JoinColumn(name = "id_unit"), inverseJoinColumns = @JoinColumn(name = "id_weapon"))
	private Set<Weapon> weaponsInUse = new TreeSet<Weapon>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="unit_gear", joinColumns = @JoinColumn(name = "id_unit"), inverseJoinColumns = @JoinColumn(name = "id_Gear"))
	private Set<Gear> gearInUse = new TreeSet<Gear>();

	public Unit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unit(String name, String country, String info,
			Set<Conflict> conflictsParticipated, Set<Camo> camosInUse,
			Set<Weapon> weaponsInUse, Set<Gear> gearInUse) {
		super();
		this.name = name;
		this.country = country;
		this.info = info;
		this.conflictsParticipated = conflictsParticipated;
		this.camosInUse = camosInUse;
		this.weaponsInUse = weaponsInUse;
		this.gearInUse = gearInUse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set<Conflict> getConflictsParticipated() {
		return conflictsParticipated;
	}

	public void setConflictsParticipated(Set<Conflict> conflictsParticipated) {
		this.conflictsParticipated = conflictsParticipated;
	}

	public Set<Camo> getCamosInUse() {
		return camosInUse;
	}

	public void setCamosInUse(Set<Camo> camosInUse) {
		this.camosInUse = camosInUse;
	}

	public Set<Weapon> getWeaponsInUse() {
		return weaponsInUse;
	}

	public void setWeaponsInUse(Set<Weapon> weaponsInUse) {
		this.weaponsInUse = weaponsInUse;
	}

	public Set<Gear> getGearInUse() {
		return gearInUse;
	}

	public void setGearInUse(Set<Gear> gearInUse) {
		this.gearInUse = gearInUse;
	}

	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}

	public void addConflict(Conflict conflict) {
		this.conflictsParticipated.add(conflict);
		conflict.getUnitsParticipated().add(this);
	}

	public void addCamo(Camo camo) {
		this.camosInUse.add(camo);
		camo.addUsingUnit(this);
	}

	public void addWeapon(Weapon weapon) {
		this.weaponsInUse.add(weapon);
	}

	public void addGear(Gear gear) {
		this.gearInUse.add(gear);
	}

	@Override
	public int compareTo(Unit o) {
		if(this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else 
			return 0;
	}

}
