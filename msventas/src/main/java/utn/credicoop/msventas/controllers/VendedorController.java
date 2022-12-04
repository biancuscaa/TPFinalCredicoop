package utn.credicoop.msventas.controllers;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.credicoop.msventas.ProductoPersonalizadoProxy;
import utn.credicoop.msventas.controllers.DTOS.VendedorDTO;
import utn.credicoop.msventas.entities.MediosDePago;
import utn.credicoop.msventas.entities.Vendedor;
import utn.credicoop.msventas.repositories.RepoVendedorJPA;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.Set;
@RestController
public class VendedorController {
    @Autowired
    RepoVendedorJPA repoVendedorJPA;

    @Autowired
    ProductoPersonalizadoProxy productoPersonalizadoProxy;

    @Transactional
    @PostMapping("/repovendedorjpa/crearvendedor")
    public @ResponseBody ResponseEntity<String> agregarVendedor(@RequestBody VendedorDTO vendedorDTO) {
        Vendedor vendedor = new Vendedor(vendedorDTO);
        repoVendedorJPA.save(vendedor);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @GetMapping("/vendedor/proxy/{idVendedor}")
    public VendedorDTO buscarPorId(@PathVariable("idVendedor") Long id){
        Optional<Vendedor> vendedor = RepoVendedorJPA.findById(id);
        VendedorDTO vendedorDTO = new VendedorDTO();
        return vendedorDTO;
    }
}
