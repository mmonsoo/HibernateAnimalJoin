package com.mmonsoor.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="territoire")
public class Territoire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="superficie")
	private int superficie;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Animal> animal= new ArrayList<>();
	//Constructeur
	public Territoire(String tmpType,int tmpSuperficie) {
		type=tmpType;
		superficie=tmpSuperficie;
	}
	
	public  Territoire() {
		
	}
	/*
	 * Une méthode qui présente le Territoire en retournant un String (superficie en hectares)
	 */
	public String presentation() {
		return("Bonjour je suis un territoire de type "+type+","+" et j'ai une superficie de "+superficie+" hectares");
	}
	public String getType() {
		return type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Territoire [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", superficie=");
		builder.append(superficie);
		builder.append("]");
		return builder.toString();
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimals(List<Animal> animal) {
		this.animal = animal;
	}
	
	
	
	

}
