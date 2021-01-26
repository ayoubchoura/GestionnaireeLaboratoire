package com.example.tp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Member{
    private Date dateInscr;
    private String diplome;
    @ManyToOne
    private EnseignantChercheur encadrant;

    public Etudiant(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email, String password, Date dateInscr, String diplome, String role, String type) {
        super(cin, nom, prenom, date, photo, cv, email, password, role, type);
        this.dateInscr = dateInscr;
        this.diplome = diplome;
    }

    public Etudiant() {
    }

    public Date getDateInscr() {
        return dateInscr;
    }

    public void setDateInscr(Date dateInscr) {
        this.dateInscr = dateInscr;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public EnseignantChercheur getEncadrant() {
        return encadrant;
    }

    public void setEncadrant(EnseignantChercheur encadrant) {
        this.encadrant = encadrant;
    }
}
