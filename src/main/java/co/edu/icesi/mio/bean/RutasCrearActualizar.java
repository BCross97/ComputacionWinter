package co.edu.icesi.mio.bean;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.component.inputtext.InputText;

import co.edu.icesi.mio.logic.ITmio1_Conductores_Logic;
import co.edu.icesi.mio.logic.ITmio1_Rutas_Logic;
import co.edu.icesi.mio.model.Tmio1Ruta;

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

		try {
			Tmio1Ruta ruta = new Tmio1Ruta();
			ruta.setActiva(activa.getValue().toString());
			ruta.setDescripcion(descripcion.getValue().toString());
			ruta.setNumero(numero.getValue().toString());
			System.out.println("Check");
			ruta.setDiaFin(new BigDecimal(fechaFin.getDay()));
			ruta.setDiaInicio(new BigDecimal(fechaInicio.getDay()));
			ruta.setHoraInicio(new BigDecimal(1));
			ruta.setHoraFin(new BigDecimal(2));
			if (hotaInicio != null)
				ruta.setHoraInicio(new BigDecimal(hotaInicio.getTime()));
			if (horaFin != null)
				ruta.setHoraFin(new BigDecimal(horaFin.getTime()));
			rutasLogic.create(ruta);
			System.out.println("pasa el crear");
//		FacesContext context = FacesContext.getCurrentInstance();
//		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
//		try {
//			FacesContext.getCurrentInstance().getExternalContext()
//					.redirect(request.getContextPath() + "/pages/Rutas/RutasMainBean.xhtml");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("No grabo");
		}
	}

	public void eliminar() {

		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasMainBean.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void actualizar() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasMainBean.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

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
