package co.edu.icesi.mio.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named
@SessionScoped
public class HeaderBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1482016987638093183L;

	public HeaderBean() {

	}

	public String redirectToRutas() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Rutas/RutasMain.xhtml");
			return "";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return "";
		}
	}
	
	public String redirectToBuses() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Buses/BusesMain.xhtml");
			return "";
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			return "";
		}
	}
	
	public String redirectToServicios() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(request.getContextPath() + "/pages/Servicios/ServiciosMain.xhtml");
			return "";
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			return "";
		}
	}

}
