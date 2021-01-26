package com.example.tp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class PublicationMember {
    @EmbeddedId
    private PublicationMemberIds id;
    @ManyToOne
    @MapsId("auteur_id")
    private Member auteur;

    public PublicationMember(PublicationMemberIds id, Member auteur) {
        this.id = id;
        this.auteur = auteur;
    }

    public PublicationMember() {
    }

    public PublicationMemberIds getId() {
        return id;
    }

    public void setId(PublicationMemberIds id) {
        this.id = id;
    }

    public Member getAuteur() {
        return auteur;
    }

    public void setAuteur(Member auteur) {
        this.auteur = auteur;
    }
}
