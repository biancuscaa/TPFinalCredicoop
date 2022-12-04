package utn.credicoop.msproductopersonalizado.repositories;

import utn.credicoop.msproductopersonalizado.entities.ProductoPersonalizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="repoproductopersonalizadojpa")
public interface RepoProductoPersonalizadoJPA extends JpaRepository<ProductoPersonalizado, Long> {
}
