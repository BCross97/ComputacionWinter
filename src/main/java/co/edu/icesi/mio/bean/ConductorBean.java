package co.edu.icesi.mio.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import co.edu.icesi.mio.dao.ITmio1_Conductores_DAO;
import co.edu.icesi.mio.logic.ITmio1_Buses_Logic;
import co.edu.icesi.mio.logic.ITmio1_Conductores_Logic;

@Named("conductor")
@SessionScoped
public class ConductorBean implements Serializable {


	public static final String ID = "Cédula";
	public static final String NAME = "Nombre";
	public static final String LASTNAME = "Apellido";
	private static final long serialVersionUID = 8380058001086340360L;
	private String input;
	private String nombre;
	private String cedula;
	private String apellido;
	private String console;

	@EJB
	private ITmio1_Conductores_Logic conductoresLogic;

	public void crear() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Conductores/CrearActualizar.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String searchBy() {
		String ret = "No se encontró ningún conductor";
		if (input == null || input == "") {
			switch (console) {
			case NAME:
				ret = conductoresLogic.searchByName(nombre).get(0).getNombre();
				break;
			case LASTNAME:
				ret = conductoresLogic.searchByLastname(apellido).get(0).getNombre();
				break;
			case ID:
				ret = conductoresLogic.searchByID(cedula).getCedula();
				break;
			default:

				break;
			}
		}
		return ret;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
