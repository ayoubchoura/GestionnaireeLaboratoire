package com.example.demo.service;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entity.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl implements IPublicationService {
    @Autowired
    PublicationRepository pubRepo;

    @Override
    public Publication addPublication(Publication p) {
        pubRepo.save(p);
        return p;
    }

    @Override
    public void deletePublicationById(Long id) {
        pubRepo.deleteById(id);
    }
    @Override
    public void deletePublication(Publication p) {
        pubRepo.delete(p);
    }

    @Override
    public Publication updatePublication(Publication p) {
        return pubRepo.saveAndFlush(p);
    }

    @Override
    public List<Publication> findAllPublications() {
        return pubRepo.findAll();
    }

    @Override
    public Publication findPublicationById(Long id) {
        Publication pub=pubRepo.findById(id).get();
        return pub;
    }

    @Override
    public Publication findPublicationByTitre(String titre) {
        return pubRepo.findByTitre(titre);
    }

    @Override
    public List<Publication> findPublicationByType(String type) {
        return pubRepo.findByType(type);
    }
}
