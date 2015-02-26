package controllers;

import models.Question;
import services.QuestionService;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Мадина on 26.02.2015.
 */
@Path("/questions")
public class QuestionController {
    @Inject
    private QuestionService questionService;

    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAllQuestions(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
            for (Question q : questionService.getAllQuestions()) {
                builder.add(Json.createObjectBuilder().add("question_id", q.getQuestionId()));
                builder.add(Json.createObjectBuilder().add("question_body",q.getQuestionBody()));
            }
        return builder.build();
    }

    @Path("/{id}")
    @GET
    @Produces("application/json")
    public Question findById(@PathParam("id") int id){
        return questionService.getQuestion(id);
    }
}
