package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.Item;

@RepositoryRestResource(path = "repoitemjpa")
public interface RepoItemJPA  extends JpaRepository<Item, Long> {
}
