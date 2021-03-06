package hlieb.model;

import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
	@Transient
	private static long count;
	@Id
	@Column(name = "id_contact")
	private final long id = ++count;
	//unique
	@Column(name = "phone_contact")
	private String phoneNumber;
	//unique
	@Column(name = "email_contact")
	private String emailAdress;
	@Column(name = "skype_contact")
	private String skype;
	@Column(name = "facebook_contact")
	private String facebook;
	@Column(name = "vk_contact")
	private String vkontakte;
	@Column(name = "website_contact")
	private String website;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String phoneNumber, String emailAdress, String skype,
			String facebook, String vkontakte, String website) {
		super();
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
		this.skype = skype;
		this.facebook = facebook;
		this.vkontakte = vkontakte;
		this.website = website;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getVkontakte() {
		return vkontakte;
	}

	public void setVkontakte(String vkontakte) {
		this.vkontakte = vkontakte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emailAdress == null) ? 0 : emailAdress.hashCode());
		result = prime * result
				+ ((facebook == null) ? 0 : facebook.hashCode());
		result = prime * result
				+ ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((skype == null) ? 0 : skype.hashCode());
		result = prime * result
				+ ((vkontakte == null) ? 0 : vkontakte.hashCode());
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
		Contact other = (Contact) obj;
		if (emailAdress == null) {
			if (other.emailAdress != null)
				return false;
		} else if (!emailAdress.equals(other.emailAdress))
			return false;
		if (facebook == null) {
			if (other.facebook != null)
				return false;
		} else if (!facebook.equals(other.facebook))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (skype == null) {
			if (other.skype != null)
				return false;
		} else if (!skype.equals(other.skype))
			return false;
		if (vkontakte == null) {
			if (other.vkontakte != null)
				return false;
		} else if (!vkontakte.equals(other.vkontakte))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", phoneNumber=" + phoneNumber
				+ ", emailAdress=" + emailAdress + ", skype=" + skype
				+ ", facebook=" + facebook + ", vkontakte=" + vkontakte
				+ ", website=" + website + "]";
	}



}
