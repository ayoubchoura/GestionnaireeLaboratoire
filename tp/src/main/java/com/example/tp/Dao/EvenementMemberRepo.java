package com.example.tp.Dao;

import com.example.tp.entities.EvenementMember;
import com.example.tp.entities.EvenementMemberIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EvenementMemberRepo extends JpaRepository<EvenementMember, EvenementMemberIds> {
    @Query("select e from EvenementMember e where organiser_id=:x")
    List<EvenementMember> findEvenementById(@Param("x") Long org_id);
}
