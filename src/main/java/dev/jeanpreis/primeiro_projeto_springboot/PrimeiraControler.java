package dev.jeanpreis.primeiro_projeto_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/primeiraController")
public class PrimeiraControler {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo(){
        return "Meu primeiro método em Spring Boot!";
    }
    
}