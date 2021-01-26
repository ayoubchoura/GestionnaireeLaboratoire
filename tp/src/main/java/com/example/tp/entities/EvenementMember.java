package com.example.tp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class EvenementMember {
    @EmbeddedId
    private EvenementMemberIds id;
    @ManyToOne
    @MapsId("organiser_id")
    private Member organiser;

    public EvenementMember(EvenementMemberIds id, Member organiser) {
        this.id = id;
        this.organiser = organiser;
    }

    public EvenementMember() {
    }

    public EvenementMemberIds getId() {
        return id;
    }

    public void setId(EvenementMemberIds id) {
        this.id = id;
    }

    public Member getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Member organiser) {
        this.organiser = organiser;
    }


}
