package com.example.demo.service;

import com.example.demo.entity.Publication;

import java.util.List;

public interface IPublicationService {
    public Publication addPublication(Publication p);
    public void deletePublication(Publication p);
    public void deletePublicationById(Long id);
    public Publication updatePublication(Publication p);
    //public Member findMember(Long id);
    public List<Publication> findAllPublications();
    //Filtrage par propriété
    public Publication findPublicationById(Long id);
    public Publication findPublicationByTitre(String titre);
    public List<Publication> findPublicationByType(String type);
}
