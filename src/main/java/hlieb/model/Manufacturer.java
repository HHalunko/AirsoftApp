package hlieb.model;

import javax.persistence.*;
@Entity
public class Manufacturer implements Comparable <Manufacturer>{
	@Transient
	private static long count;
	@Id
	@Column(name = "id_manufacturer")
	private final long id = ++count;
	@Column(name = "name_manufacturer")
	private String name;
	@Column(name = "country_manufacturer")
	private String country;
	@OneToOne
	@JoinColumn(name = "contact_manufacturer")
	private Contact contact;

	public Manufacturer(String name, String country, Contact contact) {
		super();
		this.name = name;
		this.country = country;
		this.contact = contact;
	}

	public Manufacturer() {
		// TODO Auto-generated constructor stub
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Manufacturer [name=" + name + ", country=" + country
				+ ", contact=" + contact + "]";
	}

	@Override
	public int compareTo(Manufacturer o) {
		if(this.id - o.id > 0)
			return -1;
		else if (this.id - o.id < 0)
			return 1;
		else 
			return 0;
	}
}
