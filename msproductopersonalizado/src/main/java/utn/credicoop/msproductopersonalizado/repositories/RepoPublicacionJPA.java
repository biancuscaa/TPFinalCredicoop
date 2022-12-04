package utn.credicoop.msproductopersonalizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductopersonalizado.entities.ProductoPersonalizado;
import utn.credicoop.msproductopersonalizado.entities.Publicacion;

@RepositoryRestResource(path="repopublicacionJPA")
public interface RepoPublicacionJPA extends JpaRepository<Publicacion, Long> {
}
