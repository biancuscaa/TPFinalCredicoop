package utn.credicoop.msventas.controllers.DTOS;

import javax.persistence.OneToOne;

public class ItemDTO {

    private Long id;

    private Publicacion publicacion;
    private Integer cantidad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
