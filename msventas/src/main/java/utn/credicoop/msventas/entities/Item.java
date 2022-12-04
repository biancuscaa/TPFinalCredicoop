package utn.credicoop.msventas.entities;



import utn.credicoop.msventas.controllers.DTOS.ItemDTO;

import javax.persistence.*;

@Entity
@Table(name="item")

public class Item{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    @OneToOne
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


    public Item(ItemDTO itemDTO){
        this.cantidad= itemDTO.getCantidad();
        this.id= itemDTO.getId();
        this.publicacion= itemDTO.getPublicacion();
    }
}
