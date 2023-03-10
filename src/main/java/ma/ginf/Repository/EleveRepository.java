/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ginf.Repository;

//import com.universite.Model.Eleves;
//import com.universite.Model.Filieres;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ma.ginf.Model.Eleves;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class EleveRepository implements Repository{
    EntityManager em;
    EntityTransaction tx;
    
    public EleveRepository() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Atelier_MVC_Spring_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        //tx = em.getTransaction();
        
    }
    
    public void add(Eleves d) {
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
    }
  /* public boolean update(Eleves d) {
       if(findById(d.getCne()) == null)
       { System.err.println("Pas d'eleve !!");  return false;}
        em.getTransaction().begin();
        try
        {
            em.merge(d);
        }
        catch(Exception ex)
        {
            em.getTransaction().commit();
            return false;
        }
        em.getTransaction().commit();
        return true;
    }*/


    public List<Eleves> findAll() {
        Query req = em.createQuery(" select d from Eleves d");
        return req.getResultList();

    }

    public Eleves findById(String cne) {
        Eleves d;
        em.getTransaction().begin();
        d = em.find(Eleves.class, cne);
        em.getTransaction().commit();
        return d;
    }
    
    public void remove(Eleves d){
        em.getTransaction().begin();
        if (!em.contains(d)) {
            d = em.merge(d);
        }

        em.remove(d);
        em.getTransaction().commit();
    }
}
