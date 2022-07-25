package com.joellensilva.gqso;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{n1}/{n2}")
public class Subtracao {

    @GET
    public double calculaSub(@PathParam("n1") String n1, @PathParam("n2") String n2) {
        double numero1 = Double.parseDouble(n1);
        double numero2 = Double.parseDouble(n2);
        try {
            return numero1 - numero2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + n1 + " e " + n2);
        }
    }
}
