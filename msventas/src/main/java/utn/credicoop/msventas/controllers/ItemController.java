package utn.credicoop.msventas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import utn.credicoop.msventas.controllers.DTOS.ItemDTO;
import utn.credicoop.msventas.entities.Item;
import utn.credicoop.msventas.repositories.RepoItemJPA;

import javax.transaction.Transactional;

@RestController
public class ItemController {
    @Autowired
    RepoItemJPA repoItemJPA;

    @Transactional
    @PostMapping("/repoitemjpa/crearitem")
    public @ResponseBody ResponseEntity<String> agregarItem(@RequestBody ItemDTO itemDTO) {
        Item item = new Item(itemDTO);
        repoItemJPA.save(item);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
