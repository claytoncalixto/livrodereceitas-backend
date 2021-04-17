package br.com.livrodereceitas.livrosdereceitasbackend.repository;

import br.com.livrodereceitas.livrosdereceitasbackend.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
