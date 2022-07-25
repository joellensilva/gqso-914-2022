package com.joellensilva.gqso;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    get("/", ctx -> "Bem-vindo à nossa API!");
    mvc(new Adicao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
