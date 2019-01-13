package co.edu.icesi.mio.bean;

import java.util.ArrayList;

import javax.ejb.EJB;

import co.edu.icesi.mio.logic.ITmio1_Servicios_Logic;

public class ServicioCrearActualizar {

	private String seleccionMio;
	private ArrayList<String> listaMio;

	private String seleccionConductor;
	private ArrayList<String> listaConductor;

	private String seleccionRuta;
	private ArrayList<String> listaRuta;

	@EJB
	private ITmio1_Servicios_Logic serviciosLogic;

	public ServicioCrearActualizar() {

	}

	public void crear() {

	}

	public void borrar() {

	}

	public void actualizar() {

	}

	public String getSeleccionMio() {
		return seleccionMio;
	}

	public void setSeleccionMio(String seleccionMio) {
		this.seleccionMio = seleccionMio;
	}

	public ArrayList<String> getListaMio() {
		return listaMio;
	}

	public void setListaMio(ArrayList<String> listaMio) {
		this.listaMio = listaMio;
	}

	public String getSeleccionConductor() {
		return seleccionConductor;
	}

	public void setSeleccionConductor(String seleccionConductor) {
		this.seleccionConductor = seleccionConductor;
	}

	public ArrayList<String> getListaConductor() {
		return listaConductor;
	}

	public void setListaConductor(ArrayList<String> listaConductor) {
		this.listaConductor = listaConductor;
	}

	public String getSeleccionRuta() {
		return seleccionRuta;
	}

	public void setSeleccionRuta(String seleccionRuta) {
		this.seleccionRuta = seleccionRuta;
	}

	public ArrayList<String> getListaRuta() {
		return listaRuta;
	}

	public void setListaRuta(ArrayList<String> listaRuta) {
		this.listaRuta = listaRuta;
	}

}
