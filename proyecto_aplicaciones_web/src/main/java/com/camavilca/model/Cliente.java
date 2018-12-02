package com.camavilca.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table
public class Cliente {
	
	//Camavilca
	
	@Id
	@GeneratedValue
	@Column(name = "cli_id")
	private long cli_id;

	@Column(name = "cli_dni")
	private int cli_dni;

	@Column(name = "cli_nombre")
	private String cli_nombre;

	@Column(name = "cli_apellido")
	private String cli_apellido;

	@Column(name = "cli_razon_social")
	private String cli_razon_social;
	
	public Cliente(long cli_id, int cli_dni, String cli_nombre, String cli_apellido, String cli_razon_social) {
		super();
		this.cli_id = cli_id;
		this.cli_dni = cli_dni;
		this.cli_nombre = cli_nombre;
		this.cli_apellido = cli_apellido;
		this.cli_razon_social = cli_razon_social;
	}

	public Cliente() {
		super();
	}

	public long getCli_id() {
		return cli_id;
	}

	public void setCli_id(long cli_id) {
		this.cli_id = cli_id;
	}

	public int getCli_dni() {
		return cli_dni;
	}

	public void setCli_dni(int cli_dni) {
		this.cli_dni = cli_dni;
	}

	public String getCli_nombre() {
		return cli_nombre;
	}

	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}

	public String getCli_apellido() {
		return cli_apellido;
	}

	public void setCli_apellido(String cli_apellido) {
		this.cli_apellido = cli_apellido;
	}

	public String getCli_razon_social() {
		return cli_razon_social;
	}

	public void setCli_razon_social(String cli_razon_social) {
		this.cli_razon_social = cli_razon_social;
	}

	@Override
	public String toString() {
		return "Cliente [cli_id=" + cli_id + ", cli_dni=" + cli_dni + ", cli_nombre=" + cli_nombre + ", cli_apellido="
				+ cli_apellido + ", cli_razon_social=" + cli_razon_social + "]";
	}

}
