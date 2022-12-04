package utn.credicoop.msproductobase.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msproductobase.entities.ProductoBase;

@RepositoryRestResource(path="repoproductobasejpa")
public interface RepoProductoBaseJPA extends JpaRepository<ProductoBase, Long> {
}
