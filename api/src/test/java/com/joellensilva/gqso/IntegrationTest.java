package com.joellensilva.gqso;

import io.jooby.JoobyTest;
import io.jooby.StatusCode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JoobyTest(App.class)
public class IntegrationTest {

  static OkHttpClient client = new OkHttpClient();

  @Test

  public void multiplicacao (int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/multiplicacao/5/8")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals("40.0", rsp.body().string());
      assertEquals(StatusCode.OK.value(), rsp.code());
    }
  }
  @Test
  public void Erro_Multiplicacao (int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/multiplicacao/a/b")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals(StatusCode.BAD_REQUEST.value(), rsp.code());
    }
  }

  public void subtracao(int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/subtracao/46/33")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals("13.0", rsp.body().string());
      assertEquals(StatusCode.OK.value(), rsp.code());
    }
  }

  @Test
  public void Erro_subtracao(int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/subtracao/45/c")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals(StatusCode.BAD_REQUEST.value(), rsp.code());
    }
  }
  
  @Test
  public void divisao (int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/divisao/4/2")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals("2.0", rsp.body().string());
      assertEquals(StatusCode.OK.value(), rsp.code());
    }
  }
  
  @Test
  public void Erro_Divisao (int serverPort) throws IOException {
    Request req = new Request.Builder()
        .url("http://localhost:" + serverPort + "/divisao/c/d")
        .build();

    try (Response rsp = client.newCall(req).execute()) {
      assertEquals(StatusCode.BAD_REQUEST.value(), rsp.code());
    }
  }
}

        
        
