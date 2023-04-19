package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("car");
		vehicle.setBrand("mercedes");
		vehicle.setColor("white");
		vehicle.setPrice(5000000);
		
		Chassis chassis=new Chassis();
		chassis.setChassis_number("242XY89BN67");
		chassis.setVehicle(vehicle);
		vehicle.setChassis(chassis);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chassis);
		entityTransaction.commit();
		
		
	}

}
