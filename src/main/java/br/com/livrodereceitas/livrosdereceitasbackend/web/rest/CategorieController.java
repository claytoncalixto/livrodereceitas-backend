package br.com.livrodereceitas.livrosdereceitasbackend.web.rest;

import br.com.livrodereceitas.livrosdereceitasbackend.domain.Categorie;
import br.com.livrodereceitas.livrosdereceitasbackend.service.CategorieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategorieController {

    private final Logger log = LoggerFactory.getLogger(CategorieController.class);

    @Autowired
    private CategorieService categorieService;

    public CategorieController(CategorieService categorieService){
        this.categorieService = categorieService;
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Categorie>> getAllCategories() {
        log.info("REST get all categories");
        return  ResponseEntity.ok(categorieService.findAll());
    }
}
