package org.acuellodemoya;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class EchoResource {

    @GET
    public String sayHi(){
    return "Hello, World!";
    }

    @Path("morning")
    @GET
    public String helloMorning(){
        return "Good morning!";
    }

    @Path("evening")
    @GET
    public String helloEvening(){
        return "Good Evening!";
    }

    @Path("night")
    @GET
    public String helloNight(){
        return "Good Night!";
    }
}
