package utn.credicoop.msventas.controllers.DTOS;

import utn.credicoop.msventas.entities.Compra;

import javax.persistence.OneToOne;

public class FacturaDTO {
    private Long id;

    private Compra compra;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
