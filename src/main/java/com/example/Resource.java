package com.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

// ✅ Resource (Controller) remains the same
@Path("/entities")
public class Resource {
    @Inject MyRemoteService service;

    @GET public List<MyEntity> getAll() { return service.getAllEntities(); }
    @POST public void create(MyEntity entity) { service.addEntity(entity); }
    @GET
    @Path("/{id}")
    public MyEntity getById(@PathParam("id") Long id) {
        return service.getEntityById(id);
    }
}
