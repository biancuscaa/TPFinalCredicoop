package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.CarritoDeComprasDTO;
import utn.credicoop.msventas.entities.CarritoDeCompra;
import utn.credicoop.msventas.repositories.RepoCarritoDeCompraJPA;

import javax.transaction.Transactional;

@RestController
public class CarritoDeCompraController {
    @Autowired
    RepoCarritoDeCompraJPA repoCarritoDeCompraJPA;

    @Transactional
    @PostMapping("/repocarritodecomprajpa/crearcarritodecompra")
    public @ResponseBody ResponseEntity<String> agregarCarritoDeCompra(@RequestBody CarritoDeComprasDTO carritoDeComprasDTO) {
        CarritoDeCompra carritoDeCompra = new CarritoDeCompra(carritoDeComprasDTO);
        repoCarritoDeCompraJPA.save(carritoDeCompra);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
