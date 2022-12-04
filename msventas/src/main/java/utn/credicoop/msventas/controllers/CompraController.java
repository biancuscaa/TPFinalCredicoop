package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.CompraDTO;
import utn.credicoop.msventas.entities.Compra;
import utn.credicoop.msventas.repositories.RepoCompraJPA;

import javax.transaction.Transactional;

@RestController
public class CompraController {
    @Autowired
    RepoCompraJPA repoCompraJPA;

    @Transactional
    @PostMapping("/repocomprajpa/crearcompra")
    public @ResponseBody ResponseEntity<String> agregarCompra(@RequestBody CompraDTO compraDTO) {
        Compra compra = new Compra(compraDTO);
        repoCompraJPA.save(compra);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
