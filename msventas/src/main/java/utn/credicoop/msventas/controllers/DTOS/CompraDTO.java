package utn.credicoop.msventas.controllers.DTOS;

import utn.credicoop.msventas.entities.CarritoDeCompra;
import utn.credicoop.msventas.entities.Estado;
import utn.credicoop.msventas.entities.MediosDePago;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class CompraDTO {

    private Long id;

    private CarritoDeCompra carritoDeCompra;

    private Estado estadoCompra;

    private MediosDePago medioDePago;

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
}
