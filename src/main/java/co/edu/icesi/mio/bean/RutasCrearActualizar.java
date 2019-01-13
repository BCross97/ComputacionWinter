package co.edu.icesi.mio.bean;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.primefaces.component.inputtext.InputText;

import co.edu.icesi.mio.logic.ITmio1_Conductores_Logic;
import co.edu.icesi.mio.logic.ITmio1_Rutas_Logic;

@ManagedBean
@SessionScoped
public class RutasCrearActualizar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3707989183561681006L;


	private InputText activa;
	private InputText descripcion;
	private InputText numero;
	private Date fechaFin;
	private Date fechaInicio;
	private Date horaFin;
	private Date hotaInicio;
	
	@EJB
	private ITmio1_Rutas_Logic rutasLogic;

	public RutasCrearActualizar() {

	}

	public void crear() {

	}

	public void eliminar() {

	}

	public void actualizar() {

	}

	public InputText getActiva() {
		return activa;
	}

	public void setActiva(InputText activa) {
		this.activa = activa;
	}

	public InputText getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(InputText descripcion) {
		this.descripcion = descripcion;
	}

	public InputText getNumero() {
		return numero;
	}

	public void setNumero(InputText numero) {
		this.numero = numero;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public Date getHotaInicio() {
		return hotaInicio;
	}

	public void setHotaInicio(Date hotaInicio) {
		this.hotaInicio = hotaInicio;
	}

}
