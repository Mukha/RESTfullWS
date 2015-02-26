package controllers;

import models.Disease;
import services.DiseaseService;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.*;

/**
 * Created by Мадина on 26.02.2015.
 */
@Path("/diseases")
public class DiseaseController {
    @Inject
    DiseaseService diseaseService;

    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAllDiseases(){
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for(Disease disease : diseaseService.getAllDiseases()) {
            builder.add(Json.createObjectBuilder().add("id", disease.getDiseaseId()));
            builder.add(Json.createObjectBuilder().add("name", disease.getDiseaseName()));
            builder.add(Json.createObjectBuilder().add("description", disease.getDiseaseDescription()));
        }
        return builder.build();
    }

    @Path("{id}")
    @GET
    @Produces("application/json")
    public Disease getDisease(@PathParam("id") int id) {
        return diseaseService.getDisease(id);
    }
}
