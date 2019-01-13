package co.edu.icesi.mio.testDAO;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Conductores_DAO;
import co.edu.icesi.mio.model.Tmio1Conductore;
import co.edu.icesi.mio.model.Tmio1Servicio;
import co.edu.icesi.mio.model.Tmio1ServiciosSitio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestBusesDAO {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ITmio1_Conductores_DAO dao;

	@Test
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveTest() {
		assertNotNull("Dao null", dao);
		Tmio1Conductore tmioConductor = new Tmio1Conductore();
		tmioConductor.setCedula("12345");
		tmioConductor.setNombre("Jack");
		tmioConductor.setApellidos("Bauer");
		Calendar d = new GregorianCalendar(2018, 01, 20);
		tmioConductor.setFechaContratacion(d.getTime());
		Calendar d1 = new GregorianCalendar(1998, 01, 20);
		tmioConductor.setFechaNacimiento(d1.getTime());
		tmioConductor.setTmio1Servicios(new ArrayList<Tmio1Servicio>());
		tmioConductor.setTmio1ServiciosSitios(new ArrayList<Tmio1ServiciosSitio>());

		Tmio1Conductore tmioConductor1 = new Tmio1Conductore();
		tmioConductor1.setCedula("12349");
		tmioConductor1.setNombre("Jack");
		tmioConductor1.setApellidos("Melo");
		Calendar d2 = new GregorianCalendar(2018, 01, 20);
		tmioConductor1.setFechaContratacion(d2.getTime());
		Calendar d3 = new GregorianCalendar(1999, 01, 20);
		tmioConductor1.setFechaNacimiento(d3.getTime());
		tmioConductor1.setTmio1Servicios(new ArrayList<Tmio1Servicio>());
		tmioConductor1.setTmio1ServiciosSitios(new ArrayList<Tmio1ServiciosSitio>());

		dao.save(em, tmioConductor);
		dao.save(em, tmioConductor1);
	}
	
}
