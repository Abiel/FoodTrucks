/**
 * 
 */
package com.uber.foodtrucks;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.codehaus.jettison.json.JSONException;
import org.jboss.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.uber.foodtrucks.custom_exception.AddressNotFoundException;
import com.uber.foodtrucks.domain.Truck;
import com.uber.foodtrucks.services.TruckService;

/**
 * @author abiel_m_woldu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class TruckServiceTest {
	@Autowired
	private TruckService truckService;
	private static Logger logger = Logger.getLogger(TruckServiceTest.class);
	
	public TruckServiceTest() {
	}
	
	@Test
	public void testGetNoTrucks() {
		List<Truck> trucks = null;
		try {
			trucks = truckService.getTrucks("3330 Cabrillo Ave, Santa Clara, Ca");
		} catch (JSONException e) {
			logger.error(e.getMessage());
		} catch (ClientProtocolException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		} catch (URISyntaxException e) {
			logger.error(e.getMessage());
		} catch (AddressNotFoundException e) {
			logger.error(e.getMessage());
		}
		Assert.assertTrue(trucks.isEmpty());
	}
	
	@Test
	public void testGetSomeTrucks() {
		List<Truck> trucks = null;
		try {
			trucks = truckService.getTrucks("Geary blvd and Divisadero st, sf, ca");
		} catch (JSONException e) {
			logger.error(e.getMessage());
		} catch (ClientProtocolException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		} catch (URISyntaxException e) {
			logger.error(e.getMessage());
		} catch (AddressNotFoundException e) {
			logger.error(e.getMessage());
		}
		Assert.assertTrue(trucks.size()==1);
	}
	
	@Test
	public void testInvalidAddress() {
		List<Truck> trucks = null;
		try {
			trucks = truckService.getTrucks("Foobar baz whazzzza");
		} catch (JSONException e) {
			logger.error(e.getMessage());
		} catch (ClientProtocolException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		} catch (URISyntaxException e) {
			logger.error(e.getMessage());
		} catch (AddressNotFoundException e) {
			logger.error(e.getMessage());
			Assert.assertSame("Sorry, the address is not found.", e.getMessage());
		}
	}

	public static void main(String[] args) {
	}

}
