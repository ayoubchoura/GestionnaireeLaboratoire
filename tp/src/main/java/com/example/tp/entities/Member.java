package com.example.tp.entities;

import com.example.tp.beans.EvenementBean;
import com.example.tp.beans.OutilBean;
import com.example.tp.beans.PublicationBean;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType = DiscriminatorType.STRING,length = 3)
public abstract class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private Date date;
    @Lob
    private byte[] photo;
    private String cv;
    private String email;
    private String password;
    private String type;



    @Transient
    Collection<PublicationBean> publications;
    @Transient
    Collection<EvenementBean> evenements;
    @Transient
    Collection<OutilBean> outils;

    public Member() {
    }

    public Member(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email, String password, String role, String type) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.photo = photo;
        this.cv = cv;
        this.email = email;
        this.password = password;
        this.role=role;
        this.type=type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<PublicationBean> getPublications() {
        return publications;
    }

    public void setPublications(Collection<PublicationBean> publications) {
        this.publications = publications;
    }
    public void setEvenements(Collection<EvenementBean> evenements) {
        this.evenements=evenements;
    }

    public Collection<EvenementBean> getEvenements() {
        return evenements;
    }

    public Collection<OutilBean> getOutils() {
        return outils;
    }

    public void setOutils(Collection<OutilBean> outils) {
        this.outils = outils;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
