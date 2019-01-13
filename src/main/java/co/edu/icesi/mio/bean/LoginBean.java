package co.edu.icesi.mio.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Named("login")
@SessionScoped
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8380058001086340360L;
	private String user;
	private String pwd;
	private String msg;
	private boolean isLoggedIn;

	public LoginBean() {
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	// validate and login
	public String validateUsernamePassword() {
		System.out.println("pasaaa");
		isLoggedIn = user.equals(pwd) && !user.equals("");
		if (isLoggedIn) {
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext()
					.getSession(false);
			session.setAttribute("user", user);
			try {
				FacesContext context = FacesContext.getCurrentInstance();
				HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(request.getContextPath() + "/pages/Conductores/ConductoresMain.xhtml");
			} catch (IOException e) {
				System.out.println("ERROR");
				System.out.println(FacesContext.getCurrentInstance() == null);
				e.printStackTrace();
			}
			return "";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect information", "Please enter correct username/Password"));
			user = null;
			FacesContext context = FacesContext.getCurrentInstance();
			HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(request.getContextPath() + "/login.xhtml");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		}
	}

	// logout
	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return "login";
	}

	// getIsLoggedIn()
	public boolean getIsLoggedIn() {
		return isLoggedIn;
	}

}
