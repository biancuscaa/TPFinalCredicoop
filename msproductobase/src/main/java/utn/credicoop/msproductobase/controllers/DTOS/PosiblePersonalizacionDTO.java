package utn.credicoop.msproductobase.controllers.DTOS;

import utn.credicoop.msproductobase.entities.AreasDePersonalizacion;

import javax.persistence.*;
import java.util.Set;

public class PosiblePersonalizacionDTO {

    private Long id;


    private Set<AreasDePersonalizacion> areasDePersonalizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AreasDePersonalizacion> getAreasDePersonalizacion() {
        return areasDePersonalizacion;
    }

    public void setAreasDePersonalizacion(Set<AreasDePersonalizacion> areasDePersonalizacion) {
        this.areasDePersonalizacion = areasDePersonalizacion;
    }
}
