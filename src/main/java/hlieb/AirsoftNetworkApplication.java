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
        //SpringApplication.run(AirsoftNetworkApplication.class, args);
        Location l = new Location("Ukraine", "Lviv", "Pasichna");
        Contact c = new Contact("123456789", "shad4321@ukr.net", "galunko13", "Hlieb Halunko", "id123456");
        Age a = new Age(LocalDate.of(1994, 6, 13));
        Person p = new Person();
        p.setAge(a);
        p.setContacts(c);
        p.setLocation(l);
        p.setFirstName("Hlieb");
        p.setGender(Gender.MALE);
        p.setInfo("Some guy");
        p.setLastName("Halunko");
        p.setNickname("Kilo");
        SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
    }
}
