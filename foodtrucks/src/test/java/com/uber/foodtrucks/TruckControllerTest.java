package com.uber.foodtrucks;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.uber.foodtrucks.entities.User;
import com.uber.foodtrucks.services.TruckService;
import com.uber.foodtrucks.services.UserService;
import com.uber.foodtrucks.web.TruckController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class TruckControllerTest
{
	@Autowired
	private TruckController truckController;
	
	@Test
	public void testValidAddress() {
		String view = truckController.welcome("Geary blvd and Divisadero st, sf, ca", new ExtendedModelMap());
		Assert.assertTrue(view=="welcome");
	}
}
