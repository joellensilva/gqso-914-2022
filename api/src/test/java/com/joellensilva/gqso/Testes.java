package com.joellensilva.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import io.jooby.MockRouter;
import io.jooby.StatusCode;
import io.jooby.exception.BadRequestException;

public class Testes {

  @Test
  public void adicao() {
    MockRouter router = new MockRouter(new App());
    router.get("/adicao/9/6", rsp -> {
      assertEquals(15.0, rsp.value());
      assertEquals(StatusCode.OK, rsp.getStatusCode());
    });
  }
}