package utn.credicoop.msproductobase.entities;



import utn.credicoop.msproductobase.controllers.DTOS.ProductoBaseDTO;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="productos")

public class ProductoBase{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    private String nombre;
    private String descripcion;
    private String precioBase;

    @Column(name= "tiempoFabricacionEnDias")
    private Integer tiempoFabricacion; //en dias

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "posiblesPersonalizaciones_id")
    private Set<PosiblePersonalizacion> posiblesPersonalizaciones;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(Integer tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public Set<PosiblePersonalizacion> getPosiblesPersonalizaciones() {
        return posiblesPersonalizaciones;
    }

    public void setPosiblesPersonalizaciones(Set<PosiblePersonalizacion> posiblesPersonalizaciones) {
        this.posiblesPersonalizaciones = posiblesPersonalizaciones;
    }

    public ProductoBase(ProductoBaseDTO productoBaseDTO){
        this.id= productoBaseDTO.getId();
        this.precioBase= productoBaseDTO.getPrecioBase();
        this.nombre= productoBaseDTO.getNombre();
        this.descripcion= productoBaseDTO.getDescripcion();
        this.tiempoFabricacion= productoBaseDTO.getTiempoFabricacion();
        this.posiblesPersonalizaciones=productoBaseDTO.getPosiblesPersonalizaciones();
    }

}
