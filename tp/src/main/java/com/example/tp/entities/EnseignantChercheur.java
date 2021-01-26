package com.example.tp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Member{
    private String grade;
    private String etablissement;
    @OneToMany(mappedBy= "encadrant")
    @JsonIgnore
    private List<Etudiant> listEtud;

    public EnseignantChercheur(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email, String password, String grade, String etablissement,String role, String type) {
        super(cin, nom, prenom, date, photo, cv, email, password, role, type);
        this.grade = grade;
        this.etablissement = etablissement;
    }

    public EnseignantChercheur() {
    }

    public EnseignantChercheur(String s, String ens1, String ens11, Object o, Object o1, String cv, String s1, String pass, String professeur, String enis, String admin) {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public List<Etudiant> getListEtud() {
        return listEtud;
    }

    public void setListEtud(List<Etudiant> listEtud) {
        this.listEtud = listEtud;
    }

}
