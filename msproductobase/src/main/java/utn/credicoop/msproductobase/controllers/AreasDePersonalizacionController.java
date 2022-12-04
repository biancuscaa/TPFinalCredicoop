package utn.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msproductobase.controllers.DTOS.AreasDePersonalizacionDTO;
import utn.credicoop.msproductobase.entities.AreasDePersonalizacion;
import utn.credicoop.msproductobase.entities.TiposDePersonalizacion;
import utn.credicoop.msproductobase.respositories.RepoAreasDePersonalizacionJPA;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Set;

@RestController
public class AreasDePersonalizacionController {
    @Autowired
    RepoAreasDePersonalizacionJPA repoAreasDePersonalizacionJPA;

    @Transactional
    @PostMapping("/repoareasdepersonalizacionjpa/crearareasdepersonalizacion")
    public @ResponseBody ResponseEntity<String> agregarAreaDePersonalizacion(@RequestBody AreasDePersonalizacionDTO areasDePersonalizacionDTO){
        AreasDePersonalizacion areasDePersonalizacion = new AreasDePersonalizacion(areasDePersonalizacionDTO);
        repoAreasDePersonalizacionJPA.save(areasDePersonalizacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
