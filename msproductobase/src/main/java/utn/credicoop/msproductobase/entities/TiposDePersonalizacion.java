package utn.credicoop.msproductobase.entities;



import utn.credicoop.msproductobase.controllers.DTOS.TiposDePersonalizacionDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipos_de_personalizacion")

public class TiposDePersonalizacion{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    private String nombre;
    private String contenido;

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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public TiposDePersonalizacion(){}

    public TiposDePersonalizacion(TiposDePersonalizacionDTO tiposDePersonalizacionDTO){
        this.id=tiposDePersonalizacionDTO.getId();
        this.nombre=tiposDePersonalizacionDTO.getNombre();
        this.contenido=tiposDePersonalizacionDTO.getContenido();
    }
}
