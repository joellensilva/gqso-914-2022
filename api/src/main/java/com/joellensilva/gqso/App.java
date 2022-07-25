package com.joellensilva.gqso;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    get("/", ctx -> "Welcome to Jooby!");
    mvc(new Multiplicacao());
    mvc(new Adicao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
