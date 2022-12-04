package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.CompraDTO;
import utn.credicoop.msventas.controllers.DTOS.CompradorDTO;
import utn.credicoop.msventas.entities.Comprador;
import utn.credicoop.msventas.repositories.RepoCompradorJPA;

import javax.transaction.Transactional;

@RestController
public class CompradorController {
    @Autowired
    RepoCompradorJPA repoCompradorJPA;

    @Transactional
    @PostMapping("/repocompradorjpa/crearcomprador")
    public @ResponseBody ResponseEntity<String> agregarComprador(@RequestBody CompradorDTO compradorDTO) {
        Comprador comprador = new Comprador(compradorDTO);
        repoCompradorJPA.save(comprador);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
