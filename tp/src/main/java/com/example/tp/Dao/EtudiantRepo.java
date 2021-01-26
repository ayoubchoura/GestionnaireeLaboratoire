package com.example.tp.Dao;

import com.example.tp.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByDiplome(String diplome);
    List<Etudiant> findByDiplomeOrderByDateInscrDesc(String diplome);

}
