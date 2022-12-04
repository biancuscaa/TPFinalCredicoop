package utn.credicoop.msproductopersonalizado.entities;

import utn.credicoop.msproductopersonalizado.controllers.DTOS.PublicacionDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="publicacion")

public class Publicacion{

    @Id
    @Column(name="id", nullable= false)
    private Long id;

    @OneToOne
    private Publicacion publicacion;

    @Column(name="fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    @Column(name="estado_de_publicacion")
    private Estado estadoPublicacion;

    private Integer idVendedor;

    public Publicacion(PublicacionDTO publicacionDTO){
        this.estadoPublicacion= publicacionDTO.getEstadoPublicacion();
        this.fecha= publicacionDTO.getFecha();
        this.idVendedor= publicacionDTO.getIdVendedor();
        this.id=publicacionDTO.getId();
    }

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
}
