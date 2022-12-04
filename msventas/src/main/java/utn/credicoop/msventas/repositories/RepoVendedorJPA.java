package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.Vendedor;

@RepositoryRestResource(path = "repovendedorjpa")
public interface RepoVendedorJPA  extends JpaRepository<Vendedor, Long> {
}
