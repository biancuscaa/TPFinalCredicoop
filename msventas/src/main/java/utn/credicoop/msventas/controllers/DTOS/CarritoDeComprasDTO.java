package utn.credicoop.msventas.controllers.DTOS;

import utn.credicoop.msventas.entities.Comprador;
import utn.credicoop.msventas.entities.Estado;
import utn.credicoop.msventas.entities.Item;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

public class CarritoDeComprasDTO {

    private Long id;

    private Estado estadoCarrito;

    private Set<Item> Items;

    private Integer importe;

    private Comprador comprador;

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
}
