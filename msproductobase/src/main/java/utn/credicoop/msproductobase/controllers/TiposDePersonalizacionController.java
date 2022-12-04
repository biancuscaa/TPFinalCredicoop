package utn.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import utn.credicoop.msproductobase.controllers.DTOS.TiposDePersonalizacionDTO;
import utn.credicoop.msproductobase.entities.TiposDePersonalizacion;
import utn.credicoop.msproductobase.respositories.RepoTiposDePersonalizacionJPA;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.transaction.Transactional;

public class TiposDePersonalizacionController {

    @Autowired
    RepoTiposDePersonalizacionJPA repoTiposDePersonalizacionJPA;

    @Transactional
    @PostMapping("/repotiposdepersonalizacionjpa/creartipodepersonalizacion")
    public @ResponseBody ResponseEntity<String> agregarTiposDePersonalizacion(@RequestBody TiposDePersonalizacionDTO tiposDePersonalizacionDTO){
        TiposDePersonalizacion tiposDePersonalizacion = new TiposDePersonalizacion(tiposDePersonalizacionDTO);
        repoTiposDePersonalizacionJPA.save(tiposDePersonalizacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
