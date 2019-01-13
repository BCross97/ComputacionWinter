package co.edu.icesi.mio.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import co.edu.icesi.mio.logic.ITmio1_Rutas_Logic;

@ManagedBean
@SessionScoped
public class RutasMainBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4459153608280734703L;

	private String seleccionDesde;
	private ArrayList<String> listaDesde;

	private String seleccionHasta;
	private ArrayList<String> listaHasta;
	
	@EJB
	private ITmio1_Rutas_Logic rutasLogic;

	public RutasMainBean() {

	}

	public void buscar() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasCrearActualizar.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void crear() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasCrearActualizar.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void actualizar() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasCrearActualizar.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getSeleccionHasta() {
		return seleccionHasta;
	}

	public void setSeleccionHasta(String seleccionHasta) {
		this.seleccionHasta = seleccionHasta;
	}

	public ArrayList<String> getListaHasta() {
		listaHasta = new ArrayList<>();
		return listaHasta;
	}

	public void setListaHasta(ArrayList<String> listaHasta) {
		this.listaHasta = listaHasta;
	}

	public String getSeleccionDesde() {
		return seleccionDesde;
	}

	public void setSeleccionDesde(String seleccionDesde) {
		this.seleccionDesde = seleccionDesde;
	}

	public ArrayList<String> getListaDesde() {
		listaDesde = new ArrayList<>();
		return listaDesde;
	}

	public void setListaDesde(ArrayList<String> listaDesde) {
		this.listaDesde = listaDesde;
	}

}
