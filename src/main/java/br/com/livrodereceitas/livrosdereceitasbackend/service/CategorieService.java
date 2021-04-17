package br.com.livrodereceitas.livrosdereceitasbackend.service;

import br.com.livrodereceitas.livrosdereceitasbackend.domain.Categorie;
import br.com.livrodereceitas.livrosdereceitasbackend.repository.CategorieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategorieService {

    private final Logger log = LoggerFactory.getLogger(CategorieService.class);

    @Autowired
    private CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Transactional
    public List<Categorie> findAll() {
       log.debug("Find all categorie ok!");
       return categorieRepository.findAll();
    }

}
