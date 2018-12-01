package com.camavilca.model;
import javax.persistence.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Reserva {
	
	//David
	
	@Id
	@GeneratedValue
	@Column
	private int res_id;
	
	@Column 
	private int cli_id;
	@Column 
	private int des_id;
	@Column 
	private int res_asiento;
	@Column 
	private Time res_hora;
	@Column 
	private Date res_fecha;
	@Column 
	private Date res_fecha_reserva;
	
	public int getRes_id() {
		return res_id;
	}
	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public int getDes_id() {
		return des_id;
	}
	public void setDes_id(int des_id) {
		this.des_id = des_id;
	}
	public int getRes_asiento() {
		return res_asiento;
	}
	public void setRes_asiento(int res_asiento) {
		this.res_asiento = res_asiento;
	}
	public Time getRes_hora() {
		return res_hora;
	}
	public void setRes_hora(Time res_hora) {
		this.res_hora = res_hora;
	}
	public Date getRes_fecha() {
		return res_fecha;
	}
	public void setRes_fecha(Date res_fecha) {
		this.res_fecha = res_fecha;
	}
	public Date getRes_fecha_reserva() {
		return res_fecha_reserva;
	}
	public void setRes_fecha_reserva(Date res_fecha_reserva) {
		this.res_fecha_reserva = res_fecha_reserva;
	}
	
	@Override
	public String toString() {
		return "Reserva [res_id=" + res_id + ", cli_id=" + cli_id + ", des_id=" + des_id + ", res_asiento="
				+ res_asiento + ", res_hora=" + res_hora + ", res_fecha=" + res_fecha + ", res_fecha_reserva="
				+ res_fecha_reserva + "]";
	}
	
	
}
