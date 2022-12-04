package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.Comprador;

@RepositoryRestResource(path = "repocompradorjpa")
public interface RepoCompradorJPA  extends JpaRepository<Comprador, Long> {
}
