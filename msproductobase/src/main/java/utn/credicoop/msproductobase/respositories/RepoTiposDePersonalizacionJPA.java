package utn.credicoop.msproductobase.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductobase.entities.TiposDePersonalizacion;

@RepositoryRestResource(path="repotiposdepersonalizacionjpa")
public interface RepoTiposDePersonalizacionJPA extends JpaRepository<TiposDePersonalizacion, Long> {
}
