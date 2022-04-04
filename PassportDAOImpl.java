import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PassportDAOImpl implements PassportDAO
{
	
	EntityManagerFactory emf;
	EntityManager em;
	
	void PassportDAOImpl()
	{
		System.out.println("passport impl.....()");
		
		System.out.println("Trying to read the  persistence.xml file ");
		
		this.emf=Persistence.createEntityManagerFactory("MyJPA");
		
		System.out.println("Entity management factory created...");
		
		this.em=emf.createEntityManager();
		System.out.println("Entity manager created");
		
	}

	public void addPassport(Passport passportObj) 
	{
		EntityTransaction et=em.getTransaction();
		et.begin();
			em.persist(passportObj);
		et.commit();
		

	}

	public void modifyPassport(Passport passportObj)
	{
		EntityTransaction et=em.getTransaction();
		et.begin();
			em.merge(passportObj);
		et.commit();

	}
	

	public void deletePassport(int passportId) 
	{
		EntityTransaction et=em.getTransaction();
		et.begin();
			Passport passportObj=em.find(Passport.class, passportId);
			em.remove(passportObj);
		et.commit();

	}

	public Passport findPassport(int passportId) 
	{
		
		return em.find(Passport.class, passportId);
	}

	public Set<Passport> findAllPassport() {
		Query query=em.createQuery("from employee");
		List<Passport> passportList=query.getResultList();
		Set<Passport> passportSet=new HashSet(List);
		return passportSet;
	}

}
