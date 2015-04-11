package hlieb;

import java.time.LocalDate;

import hlieb.model.Age;
import hlieb.model.Contact;
import hlieb.model.Gender;
import hlieb.model.Location;
import hlieb.model.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AirsoftNetworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(AirsoftNetworkApplication.class, args);
		Location l = new Location("Ukraine", "Lviv", "Pasichna");
		Contact c = new Contact("123456789", "shad4321@ukr.net", "galunko13",
				"Hlieb Halunko", "id123456");
		Age a = new Age(LocalDate.of(1994, 6, 13));
		Location l2 = new Location("Ukraine", "Kyiv", "Lepse");
		Contact c2 = new Contact("123456789", "shad4321@ukr.net", "123",
				"Marinka Kononenko", "id123456");
		Age a2 = new Age(LocalDate.of(1993, 6, 13));
		Person p = new Person();
		p.setAge(a);
		p.setContacts(c);
		p.setLocation(l);
		p.setFirstName("Hlieb");
		p.setGender(Gender.MALE);
		p.setInfo("Some guy");
		p.setLastName("Halunko");
		p.setNickname("Kilo");
		Person p2 = new Person();
		p2.setAge(a2);
		p2.setContacts(c2);
		p2.setLocation(l2);
		p2.setFirstName("Marina");
		p2.setGender(Gender.FEMALE);
		p2.setInfo("Some girl");
		p2.setLastName("Kononenko");
		p2.setNickname("Kytsya");
		
		Person p3 = new Person();
		p3.setAge(a2);
		p3.setContacts(c2);
		p3.setLocation(l2);
		p3.setFirstName("Marina");
		p3.setGender(Gender.MALE);
		p3.setInfo("Some girl");
		p3.setLastName("Kononenko");
		p3.setNickname("Kytsya");

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.persist(p2);
		session.persist(p3);
		session.getTransaction().commit();
		session.close();
	}
}
