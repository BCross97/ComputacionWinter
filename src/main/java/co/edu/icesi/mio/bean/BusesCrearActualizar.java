package co.edu.icesi.mio.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.primefaces.component.inputnumber.InputNumber;
import org.primefaces.component.inputtext.InputText;

import co.edu.icesi.mio.logic.ITmio1_Buses_Logic;

@Named
@SessionScoped
public class BusesCrearActualizar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5296826575994619677L;

	private InputNumber capacidad;
	private InputText marca;
	private String seleccionModelo;
	private ArrayList<String> listaModelos;
	private InputText placa;
	private String seleccionTipo;
	private ArrayList<String> listaTipos;

	@EJB
	private ITmio1_Buses_Logic busesLogic;
	
	public BusesCrearActualizar() {
		
	}

	public void crear() {

	}

	public void actualizar() {

	}

	public void borrar() {

	}

	public InputNumber getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(InputNumber capacidad) {
		this.capacidad = capacidad;
	}

	public InputText getMarca() {
		return marca;
	}

	public void setMarca(InputText marca) {
		this.marca = marca;
	}

	public String getSeleccionModelo() {
		return seleccionModelo;
	}

	public void setSeleccionModelo(String seleccionModelo) {
		this.seleccionModelo = seleccionModelo;
	}

	public ArrayList<String> getListaModelos() {
		return listaModelos;
	}

	public void setListaModelos(ArrayList<String> listaModelos) {
		this.listaModelos = listaModelos;
	}

	public InputText getPlaca() {
		return placa;
	}

	public void setPlaca(InputText placa) {
		this.placa = placa;
	}

	public String getSeleccionTipo() {
		return seleccionTipo;
	}

	public void setSeleccionTipo(String seleccionTipo) {
		this.seleccionTipo = seleccionTipo;
	}

	public ArrayList<String> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(ArrayList<String> listaTipos) {
		this.listaTipos = listaTipos;
	}

}
