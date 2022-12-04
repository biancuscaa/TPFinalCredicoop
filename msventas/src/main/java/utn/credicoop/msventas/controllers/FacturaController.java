package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.FacturaDTO;
import utn.credicoop.msventas.entities.Factura;
import utn.credicoop.msventas.repositories.RepoFacturaJPA;

import javax.transaction.Transactional;

@RestController
public class FacturaController {
    @Autowired
    RepoFacturaJPA repoFacturaJPA;

    @Transactional
    @PostMapping("/repofacturajpa/crearfactura")
    public @ResponseBody ResponseEntity<String> agregarFactura(@RequestBody FacturaDTO facturaDTO) {
        Factura factura = new Factura(facturaDTO);
        repoFacturaJPA.save(factura);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
