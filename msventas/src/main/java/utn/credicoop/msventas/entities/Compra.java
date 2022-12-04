package utn.credicoop.msventas.entities;


import utn.credicoop.msventas.controllers.DTOS.CompraDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="compra")

public class Compra{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    @OneToOne
    private CarritoDeCompra carritoDeCompra;

    @Enumerated(EnumType.STRING)
    private Estado estadoCompra;

    @OneToOne
    private MediosDePago medioDePago;

    @Column(name="fecha", columnDefinition = "DATE")
    private LocalDate fechaEmision;
    // factura?


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarritoDeCompra getCarritoDeCompra() {
        return carritoDeCompra;
    }

    public void setCarritoDeCompra(CarritoDeCompra carritoDeCompra) {
        this.carritoDeCompra = carritoDeCompra;
    }

    public Estado getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(Estado estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    public MediosDePago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(MediosDePago medioDePago) {
        this.medioDePago = medioDePago;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Compra(CompraDTO compraDTO){
        this.carritoDeCompra=compraDTO.getCarritoDeCompra();
        this.id=compraDTO.getId();
        this.estadoCompra=compraDTO.getEstadoCompra();
        this.medioDePago=compraDTO.getMedioDePago();
        this.fechaEmision=compraDTO.getFechaEmision();

    }
}
