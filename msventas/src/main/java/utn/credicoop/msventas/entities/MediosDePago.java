package utn.credicoop.msventas.entities;



import utn.credicoop.msventas.controllers.DTOS.MediosDePagoDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medios_de_pago")

public class MediosDePago{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    private String nombre;
    private String contenido; // CVU o informacion para realizar el pago


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


    public MediosDePago(MediosDePagoDTO mediosDePagoDTO){
        this.contenido= mediosDePagoDTO.getContenido();
        this.id= mediosDePagoDTO.getId();
        this.nombre= mediosDePagoDTO.getNombre();
    }
}
