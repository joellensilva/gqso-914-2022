package com.joellensilva.gqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.jooby.MockRouter;
import io.jooby.StatusCode;

public class Testes {

  @Test
  public void adicao() {
    MockRouter router = new MockRouter(new App());
    router.get("/adicao/9/6", resposta -> {
      assertEquals(15.0, resposta.value());
      assertEquals(StatusCode.OK, resposta.getStatusCode());
    });
  }

  @Test
  public void multiplicacao() {
    MockRouter router = new MockRouter(new App());
    router.get("/multiplicacao/7/3", resposta -> {
      assertEquals(21.0, resposta.value());
      assertEquals(StatusCode.OK, resposta.getStatusCode());
    });
  }

  @Test
  public void subtracao() {
    MockRouter router = new MockRouter(new App());
    router.get("/subtracao/17/4", resp -> {
      assertEquals(13.0, resp.value());
      assertEquals(StatusCode.OK, resp.getStatusCode());
    });
  }

  @Test
  public void divisao() {
    MockRouter router = new MockRouter(new App());
    router.get("/divisao/16/4", resp -> {
      assertEquals(4.0, resp.value());
      assertEquals(StatusCode.OK, resp.getStatusCode());
    });
  }
}