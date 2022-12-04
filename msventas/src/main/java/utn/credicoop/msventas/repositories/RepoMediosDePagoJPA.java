package utn.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.credicoop.msventas.entities.MediosDePago;

@RepositoryRestResource(path = "repomediosdepagojpa")
public interface RepoMediosDePagoJPA  extends JpaRepository<MediosDePago, Long> {
}
