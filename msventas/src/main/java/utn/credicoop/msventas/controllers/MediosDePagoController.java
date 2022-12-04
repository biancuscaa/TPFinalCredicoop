package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.MediosDePagoDTO;
import utn.credicoop.msventas.entities.MediosDePago;
import utn.credicoop.msventas.repositories.RepoMediosDePagoJPA;

import javax.transaction.Transactional;

@RestController
public class MediosDePagoController {
    @Autowired
    RepoMediosDePagoJPA repoMediosDePagoJPA;

    @Transactional
    @PostMapping("/repomediosdepagojpa/crearmediodepago")
    public @ResponseBody ResponseEntity<String> agregarMedioDePago(@RequestBody MediosDePagoDTO mediosDePagoDTO) {
        MediosDePago medioDePago = new MediosDePago(mediosDePagoDTO);
        repoMediosDePagoJPA.save(medioDePago);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
