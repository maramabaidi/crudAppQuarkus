package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/entities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Resource {

    @Inject
    MyRemoteService service;

    @GET
    public List<MyEntity> getAll() {
        return service.getAllEntities();
    }

    @GET
    @Path("/{id}")
    public MyEntity getById(@PathParam("id") Long id) {
        return service.getEntityById(id);
    }

    @POST
    public void create(MyEntity entity) {
        service.addEntity(entity);
    }

    @DELETE
    @Path("/{id}")
    public boolean delete(@PathParam("id") Long id) {
        return service.deleteEntity(id);
    }
}
