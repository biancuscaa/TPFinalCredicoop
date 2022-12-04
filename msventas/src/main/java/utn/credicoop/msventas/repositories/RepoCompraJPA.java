package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.Compra;

@RepositoryRestResource(path = "repocomprajpa")
public interface RepoCompraJPA  extends JpaRepository<Compra, Long> {
}
