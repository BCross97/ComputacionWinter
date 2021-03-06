package co.edu.icesi.mio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import co.edu.icesi.mio.model.Tmio1Conductore;

public interface ITmio1_Conductores_DAO {

	public void save(EntityManager em, Tmio1Conductore conductor);

	public void update(EntityManager em, Tmio1Conductore conductor);

	public void delete(EntityManager em, Tmio1Conductore conductor);

	public List<Tmio1Conductore> findAll(EntityManager em);

	public List<Tmio1Conductore> findByName(EntityManager em, String name);

	public List<Tmio1Conductore> findByLastName(EntityManager em, String lastname);

	public Tmio1Conductore findByCedula(EntityManager em, String cedula);

	public List<Tmio1Conductore> findAllOrderedByBirthDate(EntityManager em);

	public List<Tmio1Conductore> driversWithServicesInMoreThanOneBus(EntityManager em);

	public List<Tmio1Conductore> driversThatAreFree(EntityManager em);
}
