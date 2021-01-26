package com.example.tp.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OutilMemberIds implements Serializable {
    private Long outil_id ;
    private Long developpeur_id ;

    public OutilMemberIds(Long outil_id, Long developpeur_id) {
        this.outil_id = outil_id;
        this.developpeur_id = developpeur_id;
    }

    public OutilMemberIds() {
    }

    public Long getOutil_id() {
        return outil_id;
    }

    public void setOutil_id(Long outil_id) {
        this.outil_id = outil_id;
    }

    public Long getDeveloppeur_id() {
        return developpeur_id;
    }

    public void setDeveloppeur_id(Long developpeur_id) {
        this.developpeur_id = developpeur_id;
    }
}
