package com.joellensilva.gqso;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{n1}/{n2}")
public class Divisao {

    @GET
    public double calculaDiv(@PathParam("n1") String n1, @PathParam("n2") String n2) {
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        try {
            return num1 / num2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + n1 + " e " + n2);
        }
    }
}