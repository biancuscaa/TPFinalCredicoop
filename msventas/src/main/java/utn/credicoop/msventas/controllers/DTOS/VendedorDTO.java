package utn.credicoop.msventas.controllers.DTOS;

import net.minidev.json.annotate.JsonIgnore;
import utn.credicoop.msventas.entities.MediosDePago;

import javax.persistence.*;
import java.util.Set;

public class VendedorDTO {

    private Long id;

    private String nombre;


    private String contrasenia;


    private Set<MediosDePago> mediosDePago;


    private Set<ProductoPersonalizado> productosPersonalizados;


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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Set<MediosDePago> getMediosDePago() {
        return mediosDePago;
    }

    public void setMediosDePago(Set<MediosDePago> mediosDePago) {
        this.mediosDePago = mediosDePago;
    }

    public Set<ProductoPersonalizado> getProductosPersonalizados() {
        return productosPersonalizados;
    }

    public void setProductosPersonalizados(Set<ProductoPersonalizado> productosPersonalizados) {
        this.productosPersonalizados = productosPersonalizados;
    }

public VendedorDTO(){}

public VendedorDTO()
}
