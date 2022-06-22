import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Multiplicacao implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            String[] partes = exchange.getRequestURI().getPath().split("/");
            float numero1 = Float.parseFloat(partes[2]);
            float numero2 = Float.parseFloat(partes[3]);
            float multiplicacao = numero1*numero2;
                byte[] resposta = Float.toString(multiplicacao).getBytes();  
                exchange.sendResponseHeaders(200, resposta.length);
                exchange.getResponseBody().write(resposta);
                return; 
    
        } finally {
            exchange.close();
        }
    }
}