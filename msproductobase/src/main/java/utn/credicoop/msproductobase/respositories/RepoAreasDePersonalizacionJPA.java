package utn.credicoop.msproductobase.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductobase.entities.AreasDePersonalizacion;

@RepositoryRestResource(path="repoareasdepersonalizacionjpa")
public interface RepoAreasDePersonalizacionJPA extends JpaRepository<AreasDePersonalizacion, Long> {
}
