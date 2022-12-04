package utn.credicoop.msventas.entities;



import utn.credicoop.msventas.controllers.DTOS.CarritoDeComprasDTO;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="carrito_de_compra")

public class CarritoDeCompra{

    @Id
    @Column(name="id", nullable= false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Estado estadoCarrito;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Item> Items;


    private Integer importe;

    @OneToOne
    private Comprador comprador;

    @Column(name="fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estado getEstadoCarrito() {
        return estadoCarrito;
    }

    public void setEstadoCarrito(Estado estadoCarrito) {
        this.estadoCarrito = estadoCarrito;
    }

    public Set<Item> getItems() {
        return Items;
    }

    public void setItems(Set<Item> items) {
        Items = items;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }




    public CarritoDeCompra(CarritoDeComprasDTO carritoDeComprasDTO){
        this.comprador= carritoDeComprasDTO.getComprador();
        this.estadoCarrito=carritoDeComprasDTO.getEstadoCarrito();
        this.id=carritoDeComprasDTO.getId();
        this.fecha=carritoDeComprasDTO.getFecha();
        this.importe=carritoDeComprasDTO.getImporte();
        this.Items=carritoDeComprasDTO.getItems();
    }
}
