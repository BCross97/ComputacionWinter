package co.edu.icesi.mio.bean;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import co.edu.icesi.mio.logic.ITmio1_Rutas_Logic;
import co.edu.icesi.mio.logic.ITmio1_Servicios_Logic;

@Named
@SessionScoped
public class ServicioBuscarBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2400581027304289624L;

	private Date desde;
	private Date hasta;
	
	@EJB
	private ITmio1_Servicios_Logic serviciosLogic;
	
	public ServicioBuscarBean() {
	}

	public void buscar() {

	}

	public void crear() {

	}

	public void actualizar() {

	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

}
