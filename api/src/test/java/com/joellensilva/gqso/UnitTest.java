package com.joellensilva.gqso;

import io.jooby.MockRouter;
import io.jooby.StatusCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    MockRouter router = new MockRouter(new App());
    router.get("/", rsp -> {
      assertEquals("Bem-vindo à nossa API!", rsp.value());
      assertEquals(StatusCode.OK, rsp.getStatusCode());
    });
  }
}
