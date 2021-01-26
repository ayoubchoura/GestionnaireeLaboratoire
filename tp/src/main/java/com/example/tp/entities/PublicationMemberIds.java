package com.example.tp.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PublicationMemberIds implements Serializable {
    private Long publication_id ;
    private Long auteur_id ;

    public PublicationMemberIds(Long publication_id, Long auteur_id) {
        this.publication_id = publication_id;
        this.auteur_id = auteur_id;
    }

    public PublicationMemberIds() {
    }

    public Long getPublication_id() {
        return publication_id;
    }

    public void setPublication_id(Long publication_id) {
        this.publication_id = publication_id;
    }

    public Long getAuteur_id() {
        return auteur_id;
    }

    public void setAuteur_id(Long auteur_id) {
        this.auteur_id = auteur_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicationMemberIds that = (PublicationMemberIds) o;
        return Objects.equals(publication_id, that.publication_id) &&
                Objects.equals(auteur_id, that.auteur_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publication_id, auteur_id);
    }
}
