package utn.credicoop.msproductobase.controllers.DTOS;

import utn.credicoop.msproductobase.entities.PosiblePersonalizacion;

import javax.persistence.*;
import java.util.Set;

public class ProductoBaseDTO {

    private Long id;

    private String nombre;
    private String descripcion;
    private String precioBase;


    private Integer tiempoFabricacion; //en dias


    private Set<PosiblePersonalizacion> posiblesPersonalizaciones;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(Integer tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public Set<PosiblePersonalizacion> getPosiblesPersonalizaciones() {
        return posiblesPersonalizaciones;
    }

    public void setPosiblesPersonalizaciones(Set<PosiblePersonalizacion> posiblesPersonalizaciones) {
        this.posiblesPersonalizaciones = posiblesPersonalizaciones;
    }
}
