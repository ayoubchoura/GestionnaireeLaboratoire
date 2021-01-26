package com.example.demo.controller;

import com.example.demo.entity.Publication;
import com.example.demo.service.PublicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PublicationRestController {
    @Autowired
    PublicationServiceImpl publicationService;

    @RequestMapping(value="/publications",method = RequestMethod.GET)
    public List<Publication> findMembers(){
        return publicationService.findAllPublications();
    }
    @GetMapping(value = "/publications/{id}")
    public Publication findOnePublicationById(@PathVariable Long id){

        return publicationService.findPublicationById(id);
    }
    @GetMapping(value = "/publication/search/titre")
    public Publication findOneMemberByTitre(@RequestParam String titre){
        return publicationService.findPublicationByTitre(titre);
    }
    @GetMapping(value="/publications/search/type")
    public List<Publication> findOnePublicationsByType(@RequestParam String type) {
        return publicationService.findPublicationByType(type);
    }
    /* _________________________________________________   */
    @PostMapping(value = "/publications/ajouter")
    public Publication addPublication(@RequestBody Publication unePub){

        return publicationService.addPublication(unePub);
    }

    /*--------------------------------------------------------*/
    @DeleteMapping(value = "/publications/{id}")
    public void deletePublication(@PathVariable Long id){
        publicationService.deletePublicationById(id);
    }
    /*---------------------------------------------------------*/
    @PutMapping(value="/publications/publication/{id}")
    public Publication updatepublication(@PathVariable Long id, @RequestBody Publication p) {
        p.setId(id);
        return publicationService.updatePublication(p);
    }

}
