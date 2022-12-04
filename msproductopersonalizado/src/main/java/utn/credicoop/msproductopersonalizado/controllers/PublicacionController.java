package utn.credicoop.msproductopersonalizado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msproductopersonalizado.controllers.DTOS.ProductoPersonalizadoDTO;
import utn.credicoop.msproductopersonalizado.controllers.DTOS.PublicacionDTO;
import utn.credicoop.msproductopersonalizado.entities.ProductoPersonalizado;
import utn.credicoop.msproductopersonalizado.entities.Publicacion;
import utn.credicoop.msproductopersonalizado.repositories.RepoProductoPersonalizadoJPA;
import utn.credicoop.msproductopersonalizado.repositories.RepoPublicacionJPA;

import javax.transaction.Transactional;

@RestController
public class PublicacionController {
    @Autowired
    RepoPublicacionJPA repoPublicacionJPA;

    @Transactional
    @PostMapping("/repopublicacionjpa/crearpublicacion")
    public @ResponseBody ResponseEntity<String> agregarPublicacion(@RequestBody PublicacionDTO publicacionDTO){
        Publicacion publicacion = new Publicacion(publicacionDTO);
        repoPublicacionJPA.save(publicacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
