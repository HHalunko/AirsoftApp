package hlieb;

import java.time.LocalDate;

import hlieb.model.*;
import hlieb.model.gear.Glasses;
import hlieb.model.gear.GlassesLense;
import hlieb.model.weapons.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AirsoftNetworkApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// SpringApplication.run(AirsoftNetworkApplication.class, args);
		Location l = new Location("Ukraine", "Lviv", "Pasichna", null);
		Contact c = new Contact("1234567389", "sha4d4321@ukr.net", "galunk4o13",
				"Hlieb Halunko", "4id1234456");
		Age a = new Age(LocalDate.of(1994, 6, 13));
		Location l2 = new Location("Ukraine", "Kyiv", "Lepse", null);
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
		p2.setNickname("Ky3tsya");

		Person p3 = new Person();
		p3.setAge(a2);
		p3.setContacts(c2);
		p3.setLocation(l2);
		p3.setFirstName("Marina");
		p3.setGender(Gender.MALE);
		p3.setInfo("Some girl");
		p3.setLastName("Kononenko");
		p3.setNickname("Kyt3sya");

		
		Weapon w = new Weapon("TR-16", "G&G", "Colt M4A1", "Nice rifle", "Black", 150, WeaponType.ASSAULT_RIFLE, WeaponEnergyType.AEG, null);
		Camo camo = new Camo("KitKatPat", "Very sweet camo", null, null, null);
		
		Team t = new Team("Angry Beavers", "Team of very angry beavers", l,
				new Unit("Angry MArines", "USA", "Some info about marines",
						null, null, null, null), p2, null, null, null, null,
				LocalDate.of(2011, 1, 1), LocalDate.of(2013, 1, 1));

		WeaponAccessories wa = new WeaponAccessories("ULTRABUTT-1", WeaponAccessoriesType.BUTT, "Butt Co.", "Skinny");
		Glasses g = new Glasses("CROSSBOW", "BLACK", "ESS", GlassesLense.CLEAR);
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.persist(p2);
		session.persist(p3);
		session.persist(t);
		session.persist(camo);
		session.persist(wa);
		session.persist(w);
		session.persist(g);
		session.getTransaction().commit();
		session.close();
	}
}
