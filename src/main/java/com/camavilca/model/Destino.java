package com.camavilca.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Destino {
	
	//John
	
	@Id
	@GeneratedValue
	@Column(name = "des_id")
	private int id;

	@Column(name = "des_nombre")
	private String nombre;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Destino [id=" + id + ", nombre=" + nombre + "]";
	}
}
