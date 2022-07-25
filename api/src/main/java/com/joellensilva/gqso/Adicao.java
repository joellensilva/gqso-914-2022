package com.joellensilva.gqso;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/adicao/{n1}/{n2}")
public class Adicao {

    @GET
    public float calculaAdic(@PathParam("n1") String n1, @PathParam("n2") String n2) {
        float numero1 = Float.parseFloat(n1);
        float numero2 = Float.parseFloat(n2);
        try {
            return numero1 + numero2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + n1 + " e " + n2);
        }
    }
}