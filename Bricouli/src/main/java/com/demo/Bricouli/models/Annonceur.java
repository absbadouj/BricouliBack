package com.demo.Bricouli.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Annonceur")
public class Annonceur extends User implements Serializable{
	
	private Long IdAnnonceur;
	private String Designation;
	private String Siteweb;
	private String Apropos;
	private double Avis;
	
	public Annonceur(String nom, String prenom, String email, String cin, String tel, String adresse, String ville,
			Boolean confirmed, String passe, Boolean annonceur) {
		super(nom, prenom, email, cin, tel, adresse, ville, confirmed, passe, annonceur);
	}

	public Annonceur(String nom, String prenom, String email, String cin, String tel, String adresse, String ville,
			Boolean confirmed, String passe, Boolean annonceur, Blob image, String designation, String siteweb,
			String apropos, double avis) {
		super(nom, prenom, email, cin, tel, adresse, ville, confirmed, passe, annonceur);
		Designation = designation;
		Siteweb = siteweb;
		Apropos = apropos;
		Avis = avis;
	}
	
	
	
	public Annonceur() {}

	public Long getIdAnnonceur() {
		return IdAnnonceur;
	}

	public void setIdAnnonceur(Long idAnnonceur) {
		IdAnnonceur = idAnnonceur;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getSiteweb() {
		return Siteweb;
	}

	public void setSiteweb(String siteweb) {
		Siteweb = siteweb;
	}

	public String getApropos() {
		return Apropos;
	}

	public void setApropos(String apropos) {
		Apropos = apropos;
	}

	public double getAvis() {
		return Avis;
	}

	public void setAvis(double avis) {
		Avis = avis;
	}
	
	
	

}
