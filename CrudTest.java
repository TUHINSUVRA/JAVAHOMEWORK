import java.time.LocalDateTime;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudTest {
	

	public static void main(String[] args) {
		
		System.out.println("Trying to read persistence.xml file...");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em=emf.createEntityManager();
		System.out.println("EntityManager created....");

		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		
		/*System.out.println("trying to create table");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		String a=sc1.nextLine();
		String b=sc2.nextLine();
		String c=sc3.nextLine();
		float d=sc3.nextFloat();
		int e=sc4.nextInt();
		
		
		Flight theFlight= new Flight();
		
		theFlight.setFlightName(a);
		theFlight.setFlightSource(b);
		theFlight.setFlightDestination(c);
		theFlight.setFlighTicketcost(d);
		theFlight.setNumberOfPassenger(e);
		theFlight.setFlightDepartureFromSource(LocalDateTime.now());
		theFlight.setFlightArrivalAtDestination(LocalDateTime.now());*/
		
		
		/*et.begin();
		
		em.persist(theFlight);
		 et.commit();
		 
		 
		 System.out.println("=================");*/
		 
		/* et.begin();
			Flight f = em.find(Flight.class, 6);
			f.setNumberOfPassenger(20);
			em.merge(f);
		et.commit();*/
			
		
		
		
		//System.out.println("Created the record.....");
		
		
		et.begin();
		Flight f1 = em.find(Flight.class,7);
		em.remove(f1);
		et.commit(); 
	}

}
