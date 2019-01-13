package co.edu.icesi.mio.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import co.edu.icesi.mio.logic.ITmio1_Buses_Logic;

@Named
@SessionScoped
public class BusesBuscarBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 286639941078463008L;
	private String seleccionBus;
	private ArrayList<String> listaBuses;
	
	@EJB
	private ITmio1_Buses_Logic busesLogic;
	
	public BusesBuscarBean() {

	}

	public void buscar() {
		
	}

	public String getSeleccionBus() {
		return seleccionBus;
	}

	public void setSeleccionBus(String seleccionBus) {
		this.seleccionBus = seleccionBus;
	}

	public ArrayList<String> getListaBuses() {
		return listaBuses;
	}

	public void setListaBuses(ArrayList<String> listaBuses) {
		this.listaBuses = listaBuses;
	}

	
}
