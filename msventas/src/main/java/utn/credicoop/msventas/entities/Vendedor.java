package utn.credicoop.msventas.entities;


import net.minidev.json.annotate.JsonIgnore;
import utn.credicoop.msventas.controllers.DTOS.VendedorDTO;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="vendedor")

public class Vendedor{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    private String nombre;

    @JsonIgnore
    private String contrasenia;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "mediosDePago_id")
    private Set<MediosDePago> mediosDePago;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "productosPersonalizado_id")
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

    public Vendedor(VendedorDTO vendedorDTO){
        this.contrasenia= vendedorDTO.getContrasenia();
        this.id= vendedorDTO.getId();
        this.nombre= vendedorDTO.getNombre();
        this.mediosDePago=vendedorDTO.getMediosDePago();
        this.productosPersonalizados= vendedorDTO.getProductosPersonalizados();
    }
}
