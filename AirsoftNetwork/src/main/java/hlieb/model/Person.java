package hlieb.model;

import hlieb.model.gear.Gear;
import hlieb.model.weapons.Weapon;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Person {

	// Fields
	private static long count;
	private final long id = ++count;
	//unique
	private String firstName;
	private String lastName;
	//unique
	private String nickname;
	private String info;
	private Location location;
	private Gender gender;
	private Contact contacts;
	private Age age;
	private LocalDateTime registDate;
	private Set<Team> teams = new TreeSet<Team>();
	private Set<Camo> personCamos = new TreeSet<Camo>();
	private List<Weapon> personWeapons = new ArrayList<Weapon>();
	private Set<Gear> personGear = new TreeSet<Gear>();

	// Specified only modified default constructor in order to obligatory
	// instantiate the
	// registDate value. Further initialization considered using setters.
	public Person() {
		super();
		registDate = LocalDateTime.now();
	}

	// Setters

	public void addPersonGear(Gear gearElement) {
		this.personGear.add(gearElement);
	}

	public void setPersonGear(Set<Gear> personGear) {
		this.personGear = personGear;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setContacts(Contact contacts) {
		this.contacts = contacts;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

	public void addTeam(Team team) {
		this.teams.add(team);
	}

	public void setCamos(Set<Camo> camos) {
		this.personCamos = camos;
	}

	public void addCamo(Camo camo) {
		this.personCamos.add(camo);
	}

	public void setWeapons(List<Weapon> weapons) {
		this.personWeapons = weapons;
	}

	public void addWeapon(Weapon weapon) {
		this.personWeapons.add(weapon);
	}

	public static long getCount() {
		return count;
	}

	public static void setCount(long count) {
		Person.count = count;
	}

	public LocalDateTime getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDateTime registDate) {
		this.registDate = registDate;
	}

	// Getters

	public Set<Gear> getPersonGear() {
		return personGear;
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public String getInfo() {
		return info;
	}

	public Location getLocation() {
		return location;
	}

	public Gender getGender() {
		return gender;
	}

	public Contact getContacts() {
		return contacts;
	}

	public Age getAge() {
		return age;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public Set<Camo> getCamos() {
		return personCamos;
	}

	public List<Weapon> getWeapons() {
		return personWeapons;
	}

	public void removeCamo(Camo teamCamo){
		this.personCamos.remove(teamCamo);
	}
	
	public void removeWeapon(Weapon teamWeapon){
		this.personWeapons.remove(teamWeapon);
	}
	
	public void removeGear(Gear teamGear){
		this.personGear.remove(teamGear);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result
				+ ((personCamos == null) ? 0 : personCamos.hashCode());
		result = prime * result
				+ ((personGear == null) ? 0 : personGear.hashCode());
		result = prime * result
				+ ((personWeapons == null) ? 0 : personWeapons.hashCode());
		result = prime * result
				+ ((registDate == null) ? 0 : registDate.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
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
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (personCamos == null) {
			if (other.personCamos != null)
				return false;
		} else if (!personCamos.equals(other.personCamos))
			return false;
		if (personGear == null) {
			if (other.personGear != null)
				return false;
		} else if (!personGear.equals(other.personGear))
			return false;
		if (personWeapons == null) {
			if (other.personWeapons != null)
				return false;
		} else if (!personWeapons.equals(other.personWeapons))
			return false;
		if (registDate == null) {
			if (other.registDate != null)
				return false;
		} else if (!registDate.equals(other.registDate))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", nickname=" + nickname + ", info=" + info
				+ ", location=" + location + ", gender=" + gender
				+ ", contacts=" + contacts + ", age=" + age + ", registDate="
				+ registDate + ", teams=" + teams + ", camos=" + personCamos
				+ ", weapons=" + personWeapons + "]";
	}

}
