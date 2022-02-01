import Entity.AirportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {


        EntityManagerFactory emf =
                Persistence.
                        createEntityManagerFactory("default");
        EntityManager em =
                emf.createEntityManager();
        try {
            AirportEntity u = em.find(AirportEntity.class, 13);
            System.out.println(u.getName());
        } finally {
            em.close();
        }
    }
}
