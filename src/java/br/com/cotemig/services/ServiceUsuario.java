/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.services;

import br.com.cotemig.to.TOUsuario;
import javax.persistence.Access;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author usuario
 */
@Path("usuario")
public class ServiceUsuario {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ServiceUsuario
     */
    public ServiceUsuario() {
    }

    @POST
    @Path("autenticacao")
    @Produces(MediaType.APPLICATION_JSON)
    public TOUsuario autentica(TOUsuario usuario) {

        if (usuario.getEmail().equals("dirceu@fourtime.com")
                && usuario.getSenha().equals("123")) {

            TOUsuario u = new TOUsuario();
            u.setEmail("dirceu@fourtime.com");
            u.setNome("Dirceu Belem");
            u.setId("1234");

            return u;

        } else {

            TOUsuario u = new TOUsuario();
            return u;

        }

    }

    /**
     * Retrieves representation of an instance of
     * br.com.cotemig.services.ServiceUsuario
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        //TODO return proper representation object
        return "Olá";
    }

    /**
     * PUT method for updating or creating an instance of ServiceUsuario
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
