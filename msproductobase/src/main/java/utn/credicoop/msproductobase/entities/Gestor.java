package utn.credicoop.msproductobase.entities;


import net.minidev.json.annotate.JsonIgnore;
import utn.credicoop.msproductobase.controllers.DTOS.GestorDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gestor")

public class Gestor {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonIgnore
    private String contrasenia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Gestor() {
    }

    public Gestor(GestorDTO gestorDTO) {
        this.id = gestorDTO.getId();
        this.contrasenia = gestorDTO.getContrasenia();
    }
}
