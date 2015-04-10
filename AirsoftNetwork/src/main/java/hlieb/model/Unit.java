package hlieb.model;

import hlieb.model.gear.Gear;
import hlieb.model.weapons.Weapon;

import java.util.Set;
import java.util.TreeSet;

public class Unit {

	private static int count;
	private final int id = ++count;
	//unique
	private String name;
	private String country;
	private String info;
	private Set<Conflict> conflictsParticipated = new TreeSet<Conflict>();
	private Set<Camo> camosInUse = new TreeSet<Camo>();
	private Set<Weapon> weaponsInUse = new TreeSet<Weapon>();
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
	public static int getCount() {
		return count;
	}
	public int getId() {
		return id;
	}
	
	public void addConflict(Conflict conflict){
		this.conflictsParticipated.add(conflict);
		conflict.getUnitsParticipated().add(this);
	}
	
	public void addCamo(Camo camo){
		this.camosInUse.add(camo);
		camo.addUsingUnit(this);
	}
	
	public void addWeapon(Weapon weapon){
		this.weaponsInUse.add(weapon);
	}
	
	public void addGear(Gear gear){
		this.gearInUse.add(gear);
	}
	
}
