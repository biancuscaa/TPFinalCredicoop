package utn.credicoop.msproductobase.controllers.DTOS;

import utn.credicoop.msproductobase.entities.TiposDePersonalizacion;

import javax.persistence.*;
import java.util.Set;

public class AreasDePersonalizacionDTO {

    private Long id;
    private String nombre;


    private Set<TiposDePersonalizacion> tiposDePersonalizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<TiposDePersonalizacion> getTiposDePersonalizacion() {
        return tiposDePersonalizacion;
    }

    public void setTiposDePersonalizacion(Set<TiposDePersonalizacion> tiposDePersonalizacion) {
        this.tiposDePersonalizacion = tiposDePersonalizacion;
    }
}
