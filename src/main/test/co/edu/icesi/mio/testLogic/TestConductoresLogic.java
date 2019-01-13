package co.edu.icesi.mio.testLogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.icesi.mio.logic.ITmio1_Conductores_Logic;
import co.edu.icesi.mio.logic.ITmio1_Servicios_Logic;
import co.edu.icesi.mio.model.Tmio1Conductore;
import co.edu.icesi.mio.model.Tmio1Servicio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestConductoresLogic {

	@Autowired
	private ITmio1_Conductores_Logic conductoresLogic;

	@Test
	public void acorrectSaveTest() {
		assertNotNull(conductoresLogic);
		Tmio1Conductore tmioConductor = new Tmio1Conductore();
		tmioConductor.setCedula("12345");
		tmioConductor.setNombre("Jack");
		tmioConductor.setApellidos("Bauer");
		Calendar d1 = new GregorianCalendar(1998, 01, 20);
		tmioConductor.setFechaNacimiento(d1.getTime());
		Calendar d = new GregorianCalendar(2018, 01, 20);
		tmioConductor.setFechaContratacion(d.getTime());
		conductoresLogic.create(tmioConductor);
		
	}
//
//	@Test
//	public void nullSaveTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			conductoresLogic.save(null);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void cedulaNullTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
////		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void cedulaNoNumericaTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("A0014128");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void nombreNullTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
////		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void tamanoNombreMenor3Test() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("CJ");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void apellidosNullTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
////		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void tamanoApellidosMenor3Test() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Ba");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaNacimientoNullTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
////		Calendar d1 = new GregorianCalendar(1998, 01, 20);
////		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void mayorEdadTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(2008, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2018, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaContratacionNullTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
////		Calendar d = new GregorianCalendar(2018, 01, 20);
////		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaContratacionFuturoTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = new Tmio1Conductore();
//		tmioConductor.setCedula("12345");
//		tmioConductor.setNombre("Jack");
//		tmioConductor.setApellidos("Bauer");
//		Calendar d1 = new GregorianCalendar(1998, 01, 20);
//		tmioConductor.setFechaNacimiento(d1.getTime());
//		Calendar d = new GregorianCalendar(2050, 01, 20);
//		tmioConductor.setFechaContratacion(d.getTime());
//
//		try {
//			conductoresLogic.save(tmioConductor);
//			fail("Se agrego");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	// Update test
//	@Test
//	public void nullUpdate() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			conductoresLogic.update(null);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void cedulaNullUpdateTest() {
//		assertNotNull(conductoresLogic);
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setCedula(null);
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void cedulaNoNumericaUpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setCedula("A0014128");
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void cedulaCorrectaUpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setCedula("14128");
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void bnombreNullUpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setNombre(null);
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void nombreMenor3UpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setNombre("iv");
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void bnombreCorrectoUpdateTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//		assertNotNull(tmioConductor);
//		tmioConductor.setNombre("Mateo");
//		conductoresLogic.update(tmioConductor);
//		assertEquals("Mateo", conductoresLogic.findByCedula("12345").getNombre());
//	}
//
//	@Test
//	public void apellidosNullUpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setApellidos(null);
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void apellidosMenor3UpdateTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setApellidos("iv");
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void apellidosCorrectoUpdateTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//		assertNotNull(tmioConductor);
//		tmioConductor.setApellidos("Marin");
//		conductoresLogic.update(tmioConductor);
//		assertEquals("Marin", conductoresLogic.findByCedula("12345").getApellidos());
//	}
//
//	@Test
//	public void fechaNacimientoNullUpdateTest() {
//		assertNotNull(conductoresLogic);
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setFechaNacimiento(null);
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaNacimientoMenorUpdateTest() {
//		assertNotNull(conductoresLogic);
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setFechaNacimiento(new GregorianCalendar(2015, 01, 20).getTime());
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaNacimientoCorrectaUpdateTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//		assertNotNull(tmioConductor);
//		tmioConductor.setFechaNacimiento(new GregorianCalendar(1990, 01, 20).getTime());
//		conductoresLogic.update(tmioConductor);
//	}
//
//	@Test
//	public void fechaContratacionNullUpdateTest() {
//		assertNotNull(conductoresLogic);
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setFechaContratacion(null);
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaContratacionFuturoUpdateTest() {
//		assertNotNull(conductoresLogic);
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			tmioConductor.setFechaNacimiento(new GregorianCalendar(2050, 01, 20).getTime());
//			conductoresLogic.update(tmioConductor);
//			fail("Se actualizo");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void fechaContratacionCorrectaUpdateTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//		assertNotNull(tmioConductor);
//		tmioConductor.setFechaContratacion(new GregorianCalendar(2010, 01, 20).getTime());
//		conductoresLogic.update(tmioConductor);
//	}
//
//	// Find by name test
//	@Test
//	public void findBynombrenullTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			List<Tmio1Conductore> list = conductoresLogic.findByName(null);
//			fail("Busco");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void findByNombreMenor3Test() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			List<Tmio1Conductore> list = conductoresLogic.findByName("lo");
//			fail("Busco");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}
//
//	@Test
//	public void findByNombreCorrectoTest() {
//		assertNotNull(conductoresLogic);
//		Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//		assertNotNull(tmioConductor);
//		List<Tmio1Conductore> list = conductoresLogic.findByName("Jack");
//		assertNotEquals(0, list.size());
//		for (Tmio1Conductore tmio1Conductore : list) {
//			assertEquals("Nombres diferentes", "Jack", tmio1Conductore.getNombre());
//		}
//	}
//
//	// Find by lastname test
//	@Test
//	public void findByLastnameNullTest() {
//		assertNotNull(conductoresLogic);
//
//		try {
//			Tmio1Conductore tmioConductor = conductoresLogic.findByCedula("12345");
//			assertNotNull(tmioConductor);
//			List<Tmio1Conductore> list = conductoresLogic.findByLastName(null);
//			fail("Busco");
//		} catch (Exception e) {
//			assertEquals("error", e.getMessage());
//		}
//	}

	@Test
	public void findByLastnameMenorTest() {
		assertNotNull(conductoresLogic);

		try {
			Tmio1Conductore tmioConductor = conductoresLogic.searchByID("12345");
			assertNotNull(tmioConductor);
			List<Tmio1Conductore> list = conductoresLogic.searchByLastname("lo");
			fail("Busco");
		} catch (Exception e) {
			assertEquals("error", e.getMessage());
		}
	}

	@Test
	public void findByLastNameCorrectoTest() {
		assertNotNull(conductoresLogic);
		Tmio1Conductore tmioConductor = conductoresLogic.searchByID("12345");
		assertNotNull(tmioConductor);
		List<Tmio1Conductore> list = conductoresLogic.searchByLastname("Marin");
		assertNotEquals(0, list.size());
		for (Tmio1Conductore tmio1Conductore : list) {
			assertEquals("Nombres diferentes", "Marin", tmio1Conductore.getApellidos());
		}
	}

	// find by cedula test
	@Test
	public void findByCedulaNullTest() {
		assertNotNull(conductoresLogic);

		try {
			Tmio1Conductore tmioConductor = conductoresLogic.searchByID(null);
			fail("Busco");
		} catch (Exception e) {
			assertEquals("error", e.getMessage());
		}
	}

	@Test
	public void findByCedulanonumericaTest() {
		assertNotNull(conductoresLogic);

		try {
			Tmio1Conductore tmioConductor = conductoresLogic.searchByID("A0014128");
			fail("Busco");
		} catch (Exception e) {
			assertEquals("error", e.getMessage());
		}
	}

	@Test
	public void findByCedulaCorrectaTest() {
		assertNotNull(conductoresLogic);
		Tmio1Conductore tmioConductor = conductoresLogic.searchByID("12345");
		assertEquals("12345", tmioConductor.getCedula());
	}

	// Deletet Test
	@Test
	public void zdeleteTest() {
		assertNotNull(conductoresLogic);
		Tmio1Conductore tmioConductor = conductoresLogic.searchByID("12345");
		assertNotNull(tmioConductor);
		conductoresLogic.delete(tmioConductor);
	}

	@Test
	public void deleteNullTest() {
		assertNotNull(conductoresLogic);

		try {
			conductoresLogic.delete(null);
			fail("Elimino");
		} catch (Exception e) {
			assertEquals("error", e.getMessage());
		}
	}

}
