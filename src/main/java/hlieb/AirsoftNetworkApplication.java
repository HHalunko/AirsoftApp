package hlieb;

import java.time.LocalDate;

import hlieb.model.*;
import hlieb.model.gear.*;
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
				"Hlieb Halunko", "4id1234456", null);
		Age a = new Age(LocalDate.of(1994, 6, 13));
		Location l2 = new Location("Ukraine", "Kyiv", "Lepse", null);
		Contact c2 = new Contact("123456789", "shad4321@ukr.net", "123",
				"Marinka Kononenko", "id123456", null);
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
		Manufacturer m1 = new Manufacturer("USGI", "USA", c);
		Manufacturer m2 = new Manufacturer("China Made", "China", c2);
		
		Weapon w = new Weapon("TR-16", m1, "Colt M4A1", "Nice rifle", "Black", 150, WeaponType.ASSAULT_RIFLE, WeaponEnergyType.AEG);
		Camo camo = new Camo("KitKatPat", "Very sweet camo");
		Camo camo2 = new Camo("UCP", "YUK");
		Camo camo3 = new Camo("MARPAT", "Very good camo");
		Team t = new Team("Angry Beavers", "Team of very angry beavers", l,
				new Unit("Angry MArines", "USA", "Some info about marines",
						null, null, null, null), p2,
				LocalDate.of(2011, 1, 1), LocalDate.of(2013, 1, 1));
		p.addTeam(t);
		p2.addTeam(t);
		p3.addTeam(t);
		p.addCamo(camo);
		p2.addCamo(camo);
		p3.addCamo(camo);
		p2.addCamo(camo2);
		p3.addCamo(camo2);
		p3.addCamo(camo3);
		p.addWeapon(w);
		p2.addWeapon(w);
		t.addTeamCamo(camo3);
		t.addTeamCamo(camo2);
		t.addTeamCamo(camo);
		
		
		
		WeaponAccessories wa = new WeaponAccessories("ULTRABUTT-1", WeaponAccessoriesType.BUTT, m2, "Skinny");
		Glasses g = new Glasses("CROSSBOW", "BLACK", m1, GlassesLense.CLEAR);
		Headwear h = new Headwear("Watch Cap", "Foliage Green", m1, HeadwearType.HAT);
		KneePads kn = new KneePads("KP-1", "Tan", m1);
		Shoes sh = new Shoes("Zephyr", "Black", m1);
		Gloves gl = new Gloves("Impact", "Black", m1);
		Helmet hlmt = new Helmet("ACH 2000", "Foliage Green", m2);
		HelmetCover hlmtcvr = new HelmetCover("ACH 2000 COVER", "Multicam", m2);
		IRMarker ir = new IRMarker("123", "Green", m2); 
		LightMarker lm = new LightMarker("Manta Strobe", "Red", m2);
		Flashlight fl = new Flashlight("123-3", "Black", m2);
		NVGMount nvgm = new NVGMount("Rhino Mount", "Grey", m2);
		CargoSystem cs = new CargoSystem("SAAV M83", "Flectarn", m2);
		PlateCarrier pc = new PlateCarrier("MBAV", "Khaki", m2);
		HeadGear hg = new HeadGear("Comtac IV", "Green", m2, true);
		Navigator nav = new Navigator("Nav-1", "Grey", m2);
		NVG nvg = new NVG("123", "test", m1);
		Radio r = new Radio("Airsoft", "Black", m1);
		PTT ptt = new PTT("test", "Black", m1);
//		System.out.println(ptt.getClass().getSimpleName());
		t.addTeamGear(g);
		t.addTeamGear(hg);
		t.addTeamGear(nvg);
		t.addTeamMember(p);
		t.addTeamMember(p2);
		t.addTeamMember(p3);
		t.addTeamWeapon(w);
		p.addPersonGear(g);
		p.addPersonGear(h);
		p.addPersonGear(ir);
		p2.addPersonGear(nav);
		p2.addPersonGear(nvgm);
		p3.addPersonGear(nvgm);
		p3.addPersonGear(kn);
		Conflict conf = new Conflict("OEF", LocalDate.of(2011, 1, 1), LocalDate.of(2014, 1, 1), "pew pew pew");
		Unit unit = new Unit();
		unit.addCamo(camo3);
		unit.addCamo(camo2);
		unit.addCamo(camo);
		unit.addConflict(conf);
		unit.addGear(r);
		unit.addGear(hg);
		unit.addGear(ptt);
		unit.addWeapon(w);
		unit.setCountry("USA");
		unit.setName("75RR");
		unit.setInfo("Huray!");
		w.addAccessories(wa);
		camo.addManufacturer(m1);
		camo.addManufacturer(m2);

		
		System.out.println(Counter.getCount());
		
//		SessionFactory sessionFactory = new Configuration().configure()
//				.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.persist(p);
//		session.persist(p2);
//		session.persist(p3);
//		session.persist(t);
//		session.persist(camo);
//		session.persist(wa);
//		session.persist(w);
//		session.persist(g);
//		session.persist(h);
//		session.persist(kn);
//		session.persist(sh);
//		session.persist(gl);
//		session.persist(hlmt);
//		session.persist(hlmtcvr);
//		session.persist(ir);
//		session.persist(lm);
//		session.persist(fl);
//		session.persist(nvgm);
//		session.persist(cs);
//		session.persist(pc);
//		session.persist(hg);
//		session.persist(nav);
//		session.persist(nvg);
//		session.persist(r);
//		session.persist(ptt);
//		session.persist(unit);
//		session.getTransaction().commit();
//		session.close();
	}
}
