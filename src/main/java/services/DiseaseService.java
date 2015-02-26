package services;

import models.Disease;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Мадина on 26.02.2015.
 */
@Stateless
public class DiseaseService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Disease> getAllDiseases() {
        TypedQuery<Disease> query = entityManager.createQuery("select d from Disease d", Disease.class);
        return query.getResultList();
    }
}
