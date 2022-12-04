package utn.credicoop.msproductobase.entities;

import utn.credicoop.msproductobase.controllers.DTOS.AreasDePersonalizacionDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="areas_de_personalizacion")

public class AreasDePersonalizacion {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nombre;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "tiposDePersonalizacion_id")
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

    public AreasDePersonalizacion() {
    }

    public AreasDePersonalizacion(AreasDePersonalizacionDTO areasDePersonalizacionDTO) {
        this.id = areasDePersonalizacionDTO.getId();
        this.nombre = areasDePersonalizacionDTO.getNombre();
    }
}
