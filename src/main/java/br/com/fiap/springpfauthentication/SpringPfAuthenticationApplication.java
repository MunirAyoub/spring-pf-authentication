package br.com.fiap.springpfauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringPfAuthenticationApplication {
    public static void main(String[] args) {
        SpringApplication.run( SpringPfAuthenticationApplication.class, args );
    }
    @GetMapping(value= "/")
    public String index(){
        return "Ola sinta-se em casa";
    }
}