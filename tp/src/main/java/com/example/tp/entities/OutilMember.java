package com.example.tp.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class OutilMember {
    @EmbeddedId
    OutilMemberIds outilMemberIds;
    @ManyToOne
    @MapsId("developpe=r_id")
    private Member developpeur;

    public OutilMember(OutilMemberIds outilMemberIds, Member developpeur) {
        this.outilMemberIds = outilMemberIds;
        this.developpeur = developpeur;
    }

    public OutilMember() {
    }

    public OutilMemberIds getOutilMemberIds() {
        return outilMemberIds;
    }

    public void setOutilMemberIds(OutilMemberIds outilMemberIds) {
        this.outilMemberIds = outilMemberIds;
    }

    public Member getDeveloppeur() {
        return developpeur;
    }

    public void setDeveloppeur(Member developpeur) {
        this.developpeur = developpeur;
    }


}
