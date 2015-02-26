package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Мадина on 26.02.2015.
 */
@Entity
@Table(name="questions")
public class Question {
    @Id
    @Column(name="id")
    private int questionId;
    @Column(name="question_body")
    private String questionBody;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }
}
