package hlieb.model;

import java.time.LocalDate;

public class Age {

	private LocalDate birthDate;
	private int currentFullAge;
	
	public Age() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Age(LocalDate birthDate) {
		super();
		this.birthDate = birthDate;
		this.currentFullAge = LocalDate.now().minusYears(birthDate.getYear()).getYear();
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public int getCurrentFullAge() {
		return currentFullAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + currentFullAge;
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
		Age other = (Age) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (currentFullAge != other.currentFullAge)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Age [birthDate=" + birthDate + ", currentFullAge="
				+ currentFullAge + "]";
	}
	
}
