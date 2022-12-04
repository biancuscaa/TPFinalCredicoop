package utn.credicoop.msproductobase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import utn.credicoop.msproductobase.controllers.DTOS.PosiblePersonalizacionDTO;
import utn.credicoop.msproductobase.entities.PosiblePersonalizacion;
import utn.credicoop.msproductobase.respositories.RepoPosiblePersonalizacionJPA;

import javax.transaction.Transactional;

public class PosiblePersonalizacionController {
    @Autowired
    RepoPosiblePersonalizacionJPA repoPosiblePersonalizacionJPA;

    @Transactional
    @PostMapping("/repoposiblepersonalizacionjpa/crearproductopersonalizado")
    public @ResponseBody ResponseEntity<String> agregarPosiblePersonalizacion(@RequestBody PosiblePersonalizacionDTO posiblePersonalizacionDTO){
        PosiblePersonalizacion posiblePersonalizacion = new PosiblePersonalizacion(posiblePersonalizacionDTO);
        repoPosiblePersonalizacionJPA.save(posiblePersonalizacion);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
