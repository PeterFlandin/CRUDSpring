package edu.exercice.Crud.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Montre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String marque;
    private String mouvement;
    private Short diametre;

    public Montre() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
	return Objects.hash(diametre, id, marque, mouvement);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Montre other = (Montre) obj;
	return Objects.equals(this.diametre, other.diametre) && Objects.equals(this.id, other.id)
		&& Objects.equals(this.marque, other.marque) && Objects.equals(this.mouvement, other.mouvement);
    }

    @Override
    public String toString() {
	return "Montre [id=" + this.id + ", marque=" + this.marque + ", mouvement=" + this.mouvement + ", diametre="
		+ this.diametre + "]";
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getMarque() {
	return this.marque;
    }

    public void setMarque(String marque) {
	this.marque = marque;
    }

    public String getMouvement() {
	return this.mouvement;
    }

    public void setMouvement(String mouvement) {
	this.mouvement = mouvement;
    }

    public Short getDiametre() {
	return this.diametre;
    }

    public void setDiametre(Short diametre) {
	this.diametre = diametre;
    }

}
