package com.example.demo.Model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Produit")

public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ref;
	private String panne;
	private float prix;
	private String image;
	private String categorie;
	private LocalDateTime dispoAt;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	private Boolean state;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private User user;

	public Produit() {

	}

	public Produit(int id, String ref, String categorie, String panne, float prix, String image, LocalDateTime dispoAt,
			LocalDateTime createdAt, LocalDateTime updatedAt, Boolean state, User user) {

		this.id = id;
		this.ref = ref;
		this.panne = panne;
		this.prix = prix;
		this.image = image;
		this.dispoAt = dispoAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.state = state;
		this.user = user;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getPanne() {
		return panne;
	}

	public void setPanne(String panne) {
		this.panne = panne;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getDispoAt() {
		return dispoAt;
	}

	public void setDispoAt(LocalDateTime dispoAt) {
		this.dispoAt = dispoAt;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", ref=" + ref + ", panne=" + panne + ", prix=" + prix + ", image=" + image
				+ ", categorie=" + categorie + ", dispoAt=" + dispoAt + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", state=" + state + ", user=" + user + "]";
	}

}
