package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.CarritoDeCompra;


@RepositoryRestResource(path = "repocarritodecomprajpa")
public interface RepoCarritoDeCompraJPA  extends JpaRepository<CarritoDeCompra, Long> {
}
