package utn.credicoop.msproductopersonalizado.controllers.DTOS;

import utn.credicoop.msproductopersonalizado.entities.Estado;
import utn.credicoop.msproductopersonalizado.entities.Publicacion;

import javax.persistence.*;
import java.time.LocalDate;

public class PublicacionDTO {

    private Long id;
    private Publicacion publicacion;
    private LocalDate fecha;
    private Estado estadoPublicacion;
    private Integer idVendedor;



    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(Estado estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

