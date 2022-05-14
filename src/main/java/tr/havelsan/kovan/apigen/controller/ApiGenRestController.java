package tr.havelsan.kovan.apigen.controller;

import tr.havelsan.kovan.apigen.model.ApiModel;
import tr.havelsan.kovan.apigen.service.ApiGenService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/api-gen")
public class ApiGenRestController {

    @Inject
    ApiGenService apiGenService;

    @GET
    @Path("/sayMyName")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("Running sayMyName api");
        return "Walter White";
    }


    @POST
    @Path("/generate")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean generateApi(ApiModel apiModel) {
        System.out.println("Start generate api");
        try {
            apiGenService.generate(apiModel);
            System.out.println("End generate api");
        } catch (IOException e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }finally {
            System.out.println("End generate api");
        }
        return Boolean.TRUE;
    }


}