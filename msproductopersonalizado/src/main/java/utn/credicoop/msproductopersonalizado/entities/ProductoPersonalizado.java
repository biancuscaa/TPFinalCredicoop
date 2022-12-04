package utn.credicoop.msproductopersonalizado.entities;
import utn.credicoop.msproductopersonalizado.controllers.DTOS.ProductoPersonalizadoDTO;
import javax.persistence.*;

@Entity
@Table(name="producto_personalizado")

public class ProductoPersonalizado{

    @Id
    @Column(name="id",nullable= false)
    private Long id;

    public ProductoPersonalizado() {};

    public ProductoPersonalizado(ProductoPersonalizadoDTO productoPersonalizadoDTO){
        this.id = productoPersonalizadoDTO.getId();
        this.precioFinal = productoPersonalizadoDTO.getPrecioFinal();
    }
    private Integer precioFinal;
    //TODO: funcion que calcule precio final

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Integer precioFinal) {
        this.precioFinal = precioFinal;}
    }