package utn.credicoop.msproductopersonalizado.controllers;

import com.netflix.discovery.converters.Auto;
import org.springframework.web.bind.annotation.*;
import utn.credicoop.msproductopersonalizado.controllers.DTOS.ProductoPersonalizadoDTO;
import utn.credicoop.msproductopersonalizado.entities.ProductoPersonalizado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import utn.credicoop.msproductopersonalizado.repositories.RepoProductoPersonalizadoJPA;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
public class ProductoPersonalizadoController {
    @Autowired
    RepoProductoPersonalizadoJPA repoProductoPersonalizadoJPA;

    @Transactional
    @PostMapping("/repoproductopersonalizadojpa/crearproductopersonalizado")
    public @ResponseBody ResponseEntity<String> agregarProductoPersonalizado(@RequestBody ProductoPersonalizadoDTO productoPersonalizadoDTO){
        ProductoPersonalizado producto = new ProductoPersonalizado(productoPersonalizadoDTO);
        repoProductoPersonalizadoJPA.save(producto);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}