package com.example.tp.Dao;

import com.example.tp.entities.OutilMember;
import com.example.tp.entities.OutilMemberIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OutilMemberRepo extends JpaRepository<OutilMember, OutilMemberIds> {
    @Query("select o from OutilMember o where developpeur_id=:x")
    List<OutilMember> findOutilById(@Param("x") Long developpeur_id);
}
