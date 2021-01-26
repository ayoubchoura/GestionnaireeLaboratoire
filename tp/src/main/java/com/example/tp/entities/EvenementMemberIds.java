package com.example.tp.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EvenementMemberIds implements Serializable {
    private Long evenement_id ;
    private Long organiser_id ;

    public EvenementMemberIds(Long evenement_id, Long organiser_id) {
        this.evenement_id = evenement_id;
        this.organiser_id = organiser_id;
    }
    public EvenementMemberIds() {

    }

    public Long getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(Long evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Long getOrganiser_id() {
        return organiser_id;
    }

    public void setOrganiser_id(Long organiser_id) {
        this.organiser_id = organiser_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenementMemberIds that = (EvenementMemberIds) o;
        return Objects.equals(evenement_id, that.evenement_id) &&
                Objects.equals(organiser_id, that.organiser_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evenement_id, organiser_id);
    }
}
