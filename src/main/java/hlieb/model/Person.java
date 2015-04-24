package hlieb.model;

import hlieb.model.gear.*;
import hlieb.model.weapons.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Person")
public class Person implements Comparable<Person>{

	// Fields
	@Transient
	private static long count;
	@Id
	@Column(name = "id_Person")
	private final long id = ++count;
	@Column(name = "firstName_Person")
	private String firstName;
	@Column(name = "lastName_Person")
	private String lastName;
	//unique
	@Column(name = "nickname_Person")
	private String nickname;
	@Column(name = "info_Person")
	private String info;
	@Column(name="password_Person")
	private String password;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_location_Person")
	private Location location;
	@Column(name = "gender_Person")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_contact_Person")
	private Contact contacts;
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_age_Person")
	private Age age;
	@Transient
	private LocalDateTime registDate;
	@Column(name ="registDate_Person")
    private String registDateString;	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="person_team", joinColumns = @JoinColumn(name = "id_Person"), inverseJoinColumns = @JoinColumn(name = "id_Team"))
	private Set<Team> teams = new TreeSet<Team>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="person_camo", joinColumns = @JoinColumn(name = "id_Person"), inverseJoinColumns = @JoinColumn(name = "id_Camo"))
	private Set<Camo> personCamos = new TreeSet<Camo>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="person_weapon", joinColumns = @JoinColumn(name = "id_Person"), inverseJoinColumns = @JoinColumn(name = "id_Weapon"))
	private List<Weapon> personWeapons = new ArrayList<Weapon>();
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="person_gear", joinColumns = @JoinColumn(name = "id_Person"), inverseJoinColumns = @JoinColumn(name = "id_Gear"))
	private List<Gear> personGearAll = new ArrayList<Gear>();


	// Specified only modified default constructor in order to obligatory
	// instantiate the
	// registDate value. Further initialization considered using setters.
	public Person() {
		super();
		registDate = LocalDateTime.now();
		registDateString = registDate.toString();
	}

	// Setters

	public void addPersonGear(Gear gearElement) {
		this.personGearAll.add(gearElement);
	}

	public void setPersonGear(List<Gear> personGear) {
		this.personGearAll = personGear;
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

	public List<Gear> getPersonGear() {
		return personGearAll;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void removeCamo(Camo teamCamo){
		this.personCamos.remove(teamCamo);
	}
	
	public void removeWeapon(Weapon teamWeapon){
		this.personWeapons.remove(teamWeapon);
	}
	
	public void removeGear(Gear teamGear){
		this.personGearAll.remove(teamGear);
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
		if (personGearAll == null) {
			if (other.personGearAll != null)
				return false;
		} else if (!personGearAll.equals(other.personGearAll))
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



	@Override
	public int compareTo(Person o) {
		if(this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else 
			return 0;
	}

}
