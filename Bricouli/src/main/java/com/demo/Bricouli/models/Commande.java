package com.demo.Bricouli.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommande;
	private Date date;
	private String Etat;
	private String AdresseLiv;
	private Boolean Regle;
	private Date DateLiv;
	private String DateLivPrevu;
	
	@OneToOne
	private Devis devis;
	
	@ManyToOne
	 private User client;
	
	@ManyToOne
	private Annonce annonce;
	
	@ManyToOne
	private Annonceur annonceur;
	
	
	public Commande() {
		super();
	}

	public Commande(Date date, String etat, String adresseLiv, Boolean regler) {
		super();
		this.date = date;
		Etat = etat;
		AdresseLiv = adresseLiv;
		Regle = regler;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public String getAdresseLiv() {
		return AdresseLiv;
	}

	public void setAdresseLiv(String adresseLiv) {
		AdresseLiv = adresseLiv;
	}

	public Boolean getRegler() {
		return Regle;
	}

	public void setRegler(Boolean regler) {
		Regle = regler;
	}

	public Boolean getRegle() {
		return Regle;
	}

	public void setRegle(Boolean regle) {
		Regle = regle;
	}

	public Devis getDevis() {
		return devis;
	}

	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public Date getDateLiv() {
		return DateLiv;
	}

	public void setDateLiv(Date dateLiv) {
		DateLiv = dateLiv;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public String getDateLivPrevu() {
		return DateLivPrevu;
	}

	public void setDateLivPrevu(String dateLivPrevu) {
		DateLivPrevu = dateLivPrevu;
	}

	public Annonceur getAnnonceur() {
		return annonceur;
	}

	public void setAnnonceur(Annonceur annonceur) {
		this.annonceur = annonceur;
	}
	
	
	
}
