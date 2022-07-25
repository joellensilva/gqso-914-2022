
package com.joellensilva.gqso;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.annotations.PathParam;
import io.jooby.exception.BadRequestException;

@Path("/multiplicacao/{n1}/{n2}")
public class Multiplicacao {

    @GET
    public double calculaMult(@PathParam("n1") String n1, @PathParam("n2") String n2) {
        float num1 = Float.parseFloat(n1);
        float num2 = Float.parseFloat(n2);
        try {
            return num1 * num2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Parâmetro inválido: " + n1 + " e " + n2);
        }
    }
}