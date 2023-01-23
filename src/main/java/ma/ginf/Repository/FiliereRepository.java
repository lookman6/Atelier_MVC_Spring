/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.ginf.Repository;

//import com.universite.Model.Filieres;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ma.ginf.Model.Filieres;
import javax.persistence.Persistence;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class FiliereRepository implements Repository{
    EntityManager em;
    EntityTransaction tx;
    
    public FiliereRepository() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Atelier_MVC_Spring_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        //tx = em.getTransaction();
        
    }
    
    public void add(Filieres d) {
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
    }
   public boolean update(Filieres d) {
       if(findById(d.getCodeFil()) == null)
       { System.err.println("Pas de Filiere !!");  return false;}
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
    }


    public List<Filieres> findAll() {
        Query req = em.createQuery(" select d from Filieres d");
        return req.getResultList();

    }
    
     

    public Filieres findById(String codeFil) {
        Filieres d;
        em.getTransaction().begin();
        d = em.find(Filieres.class, codeFil);
        em.getTransaction().commit();
        return d;
    }
    
    public void remove(Filieres d){
        em.getTransaction().begin();
        if (!em.contains(d)) {
            d = em.merge(d);
        }

        em.remove(d);
        em.getTransaction().commit();
    }
}
