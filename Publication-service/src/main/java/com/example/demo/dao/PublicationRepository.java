package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.entity.Publication;

import java.util.List;

@RepositoryRestController
public interface PublicationRepository extends JpaRepository<Publication, Long> {

    Publication findByTitre(String titre);

    List<Publication> findByType(String type);
}
