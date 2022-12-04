package utn.credicoop.msproductobase.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductobase.entities.PosiblePersonalizacion;

@RepositoryRestResource(path="repoposiblepersonalizacionjpa")
public interface RepoPosiblePersonalizacionJPA extends JpaRepository<PosiblePersonalizacion, Long> {
}
