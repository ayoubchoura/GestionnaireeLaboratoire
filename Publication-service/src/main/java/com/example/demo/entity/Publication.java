package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity

public class Publication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String titre;
	@NonNull
	private String type;//article de journal/ manifestation/chapitre de livre/livre/poster
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date dateApparition;
	@NonNull
	private String lien;
	@NonNull
	private String sourcePdf;

	public Publication(String article, String s, Date date, String lien, String pdf) {
		this.titre=article;
		this.type=s;
		this.dateApparition=date;
		this.lien=lien;
		this.sourcePdf=pdf;
	}

	public Publication() {
	}

	public Long getId() {
		return id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateApparition() {
		return dateApparition;
	}

	public void setDateApparition(Date dateApparition) {
		this.dateApparition = dateApparition;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getSourcePdf() {
		return sourcePdf;
	}

	public void setSourcePdf(String sourcePdf) {
		this.sourcePdf = sourcePdf;
	}

	public void setId(Long id) {
		this.id=id;
	}
}

