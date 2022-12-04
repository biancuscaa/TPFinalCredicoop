package utn.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import utn.credicoop.msproductobase.controllers.DTOS.ProductoBaseDTO;
import utn.credicoop.msproductobase.entities.ProductoBase;
import utn.credicoop.msproductobase.respositories.RepoProductoBaseJPA;

import javax.transaction.Transactional;

public class ProductoBaseController {
    @Autowired
    RepoProductoBaseJPA repoProductoBaseJPA;

    @Transactional
    @PostMapping("/repoproductobasejpa/crearproductobase")
    public @ResponseBody ResponseEntity<String> agregarProductoBase(@RequestBody ProductoBaseDTO productoBaseDTO){
        ProductoBase productoBase = new ProductoBase(productoBaseDTO);
        repoProductoBaseJPA.save(productoBase);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
