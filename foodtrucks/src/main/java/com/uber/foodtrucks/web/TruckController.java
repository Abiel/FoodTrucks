/**
 * 
 */
package com.uber.foodtrucks.web;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.uber.foodtrucks.services.TruckService;

/**
 * @author abiel_m_woldu
 *
 */
@Controller
public class TruckController {
	@Autowired
	private TruckService truckService;
	
	public TruckController() {
	}
	
	/*public TruckService getTruckService() {
		return truckService;
	}

	public void setTruckService(TruckService truckService) {
		this.truckService = truckService;
	}*/

	@RequestMapping("/welcome")
	public String welcome(Model model) 
	{
		System.out.println("welcome controller.");
		try {
			truckService.getAllTrucks();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return "welcome";
	}

	public static void main(String[] args) {

	}

}
