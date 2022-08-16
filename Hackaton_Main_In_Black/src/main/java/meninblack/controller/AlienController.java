package meninblack.controller;

import jakarta.validation.Valid;
import meninblack.model.Alien;
import meninblack.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/Aliens")
    public class AlienController {

        private AlienService alienService;

        @Autowired
        public void setAlienService(AlienService alienService) {
            this.alienService = alienService;
        }

        @RequestMapping(method = RequestMethod.GET, path = {"/", "", " "})
        public ResponseEntity<List<Alien>> listAliens() {
            return new ResponseEntity<>(alienService.getAliensList(), HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.POST, path = {"/add"})
        public ResponseEntity<Alien> addAlien (@Valid @RequestBody Alien alien) {
            alienService.addNewAlien(alien);
            return new ResponseEntity<>(alien, HttpStatus.CREATED);
        }
        @RequestMapping(method = RequestMethod.PUT, path = {"/edit"})
        public ResponseEntity<Alien> updateAlien (@Valid @RequestBody Alien alien) {
            alienService.updateAlien(alien);
            return new ResponseEntity<>(alien, HttpStatus.ACCEPTED);
        }
        @RequestMapping(method = RequestMethod.PUT, path = {"/delete"})
        public ResponseEntity<Alien> deleteAlien (@Valid @RequestBody Alien alien) {
            alienService.delete(alien.getId());
            return new ResponseEntity<>(alien, HttpStatus.OK);
        }


}
