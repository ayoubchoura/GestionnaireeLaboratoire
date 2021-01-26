package com.example.tp.Dao;

import com.example.tp.entities.EnseignantChercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantChercheurRepo extends JpaRepository<EnseignantChercheur,Long> {
    List<EnseignantChercheur> findByGrade(String grade);
    List<EnseignantChercheur> findByEtablissement(String etablissement);
}
