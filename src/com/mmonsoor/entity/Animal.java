package com.mmonsoor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nom")
	protected String nom;
	@Column(name="espece")
	protected String espece;
	@Column(name="age")
	protected Short age;
	
	public Animal(String tmpNom, String tmpEspece, Short tmpAge) {
		// TODO Auto-generated constructor stub
		nom=tmpNom;
		espece=tmpEspece;
		age=tmpAge;
	}
	
	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
		nom="";
		espece="";
		age=0;
	}
	
	

	/**
	 * Retourne un String avec les attributs de l'animal
	 */
	
	public String presentation() {
			
			return("Bonjour je suis "+nom+", "+"je suis un "+espece+" et j'ai "+age+" ans !"+"Et je n'ai pas encore de territoire attribué.");
	
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", espece=");
		builder.append(espece);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	


}