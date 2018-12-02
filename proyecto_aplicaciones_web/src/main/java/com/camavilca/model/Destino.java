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
	private long des_id;

	@Column(name = "des_nombre")
	private String des_nombre;
	
	@Column(name = "des_precio")
	private double des_precio;

	public Destino(long des_id, String des_nombre, double des_precio) {
		super();
		this.des_id = des_id;
		this.des_nombre = des_nombre;
		this.des_precio = des_precio;
	}

	public Destino () {
		super();
	}

	public long getDes_id() {
		return des_id;
	}

	public void setDes_id(long des_id) {
		this.des_id = des_id;
	}

	public String getDes_nombre() {
		return des_nombre;
	}

	public void setDes_nombre(String des_nombre) {
		this.des_nombre = des_nombre;
	}

	public double getDes_precio() {
		return des_precio;
	}

	public void setDes_precio(double des_precio) {
		this.des_precio = des_precio;
	}

	@Override
	public String toString() {
		return "Destino [des_id=" + des_id + ", des_nombre=" + des_nombre + ", des_precio=" + des_precio + "]";
	}
	
	
}
