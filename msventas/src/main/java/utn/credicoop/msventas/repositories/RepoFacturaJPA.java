package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.Factura;

@RepositoryRestResource(path = "repofacturajpa")
public interface RepoFacturaJPA  extends JpaRepository<Factura, Long> {
}
