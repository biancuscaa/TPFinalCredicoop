package utn.credicoop.msventas.entities;


import utn.credicoop.msventas.controllers.DTOS.FacturaDTO;

import javax.persistence.*;

@Entity
@Table(name="factura")

public class Factura{
    @Id
    @Column(name="id", nullable= false)
    private Long id;

    @OneToOne
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

    public Factura(FacturaDTO facturaDTO){
        this.compra=facturaDTO.getCompra();
        this.id= facturaDTO.getId();
    }
}
