package utn.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import utn.credicoop.msproductobase.controllers.DTOS.AreasDePersonalizacionDTO;
import utn.credicoop.msproductobase.controllers.DTOS.GestorDTO;
import utn.credicoop.msproductobase.entities.AreasDePersonalizacion;
import utn.credicoop.msproductobase.entities.Gestor;
import utn.credicoop.msproductobase.respositories.RepoAreasDePersonalizacionJPA;
import utn.credicoop.msproductobase.respositories.RepoGestorJPA;

import javax.transaction.Transactional;

public class GestorController {
    @Autowired
    RepoGestorJPA repoGestorJPA;

    @Transactional
    @PostMapping("/repogestorjpa/crearareasdepersonalizacion")
    public @ResponseBody ResponseEntity<String> agregarGestor(@RequestBody GestorDTO gestorDTO){
        Gestor gestor = new Gestor(gestorDTO);
        repoGestorJPA.save(gestor);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
