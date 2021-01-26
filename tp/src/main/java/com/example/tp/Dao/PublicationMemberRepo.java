package com.example.tp.Dao;

import com.example.tp.entities.PublicationMember;
import com.example.tp.entities.PublicationMemberIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicationMemberRepo extends JpaRepository<PublicationMember, PublicationMemberIds> {
    @Query("select m from PublicationMember m where auteur_id=:x")
    List<PublicationMember> findpubId(@Param("x")Long auteur_id);
}
