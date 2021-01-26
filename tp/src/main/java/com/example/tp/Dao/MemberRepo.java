package com.example.tp.Dao;

import com.example.tp.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepo extends JpaRepository<Member,Long> {
    Member findByCin(String cin);
    List<Member> findByNomStartingWith(String caractere);
    List<Member> findByNom(String nom);
    Member findByEmail(String email);
    Optional<Member> findById(Long id);

}
