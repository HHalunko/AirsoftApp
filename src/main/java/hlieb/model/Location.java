package hlieb.model;

import javax.persistence.*;

@Entity
@Table(name="Location")
public class Location {
	@Transient
	private static long count;
	@Id
	@Column(name="id_Location")
	private final long id = ++count;
	@Column(name="country_Location")
	private String country;
	@Column(name="city_Location")
	private String city;
	@Column(name="street_Location")
	private String street;
	@Column(name="coordinates_Location")
	private String coordinates;

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String country, String city, String street,
			String coordinates) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
		this.coordinates = coordinates;
	}

	public static long getCount() {
		return count;
	}

	public long getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", country=" + country + ", city=" + city
				+ ", street=" + street + ", coordinates=" + coordinates + "]";
	}

 
	
}
