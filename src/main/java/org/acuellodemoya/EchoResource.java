package org.acuellodemoya;

import jakarta.ws.rs.*;

@Path("/hello")
public class EchoResource {

    @GET
    public String sayHi(@QueryParam("name") String name){
        if(name == null) return "Bye";
        return "Hello, " + name + "!";
    }

    @Path("/{name}")
    @GET
    public String sayHiUrlParam(@PathParam("name") String name){
        return "Hi " + name + "!";
    }
}
