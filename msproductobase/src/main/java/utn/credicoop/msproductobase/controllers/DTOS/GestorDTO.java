package utn.credicoop.msproductobase.controllers.DTOS;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Id;

public class GestorDTO {

    private Long id;


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

}
