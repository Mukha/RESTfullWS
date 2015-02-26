package services;

import models.Question;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Мадина on 26.02.2015.
 */
@Stateless
public class QuestionService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Question> getAllQuestions() {
        TypedQuery<Question> query = entityManager.createQuery("select q from Question q", Question.class);
        return query.getResultList();
    }

    public Question getQuestion(int id) {
        return entityManager.find(Question.class,id);
    }
}
