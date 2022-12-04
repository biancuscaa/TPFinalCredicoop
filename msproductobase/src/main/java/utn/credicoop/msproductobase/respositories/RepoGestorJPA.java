package utn.credicoop.msproductobase.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductobase.entities.Gestor;

@RepositoryRestResource(path="repogestorjpa")
public interface RepoGestorJPA extends JpaRepository<Gestor, Long> {
}
