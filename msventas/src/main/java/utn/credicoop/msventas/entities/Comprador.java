package utn.credicoop.msventas.entities;


import utn.credicoop.msventas.controllers.DTOS.CompraDTO;
import utn.credicoop.msventas.controllers.DTOS.CompradorDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comprador")

public class Comprador{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    private String nombre;
    //datos de facturacion?


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

    public Comprador(CompradorDTO compradorDTO){
        this.id=compradorDTO.getId();
        this.nombre=compradorDTO.getNombre();

    }
}
