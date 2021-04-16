package br.com.livrodereceitas.livrosdereceitasbackend.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class IndexController {

    private final Logger log = LoggerFactory.getLogger(IndexController.class);

    @GetMapping
    public ResponseEntity<String> getIndex() {
        log.info("Teste de log debug");
        return new ResponseEntity<>("Livro de Receitas", HttpStatus.OK);
    }
}
