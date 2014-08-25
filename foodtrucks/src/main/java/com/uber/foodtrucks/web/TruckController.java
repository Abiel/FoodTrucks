/**
 * 
 */
package com.uber.foodtrucks.web;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uber.foodtrucks.custom_exception.AddressNotFoundException;
import com.uber.foodtrucks.domain.Location;
import com.uber.foodtrucks.domain.Truck;
import com.uber.foodtrucks.services.TruckService;

/**
 * @author abiel_m_woldu
 *
 */
@Controller
public class TruckController {
	@Autowired
	private TruckService truckService;
	private double sfLat = 37.7801490737255;
	private double sfLng = -122.422258184604;
	private static Logger logger = Logger.getLogger(TruckController.class);
	
	public TruckController() {
	}

	@RequestMapping("/welcome")
	public String welcome(@RequestParam(required = false) String address, Model model) 
	{
		List<Truck> truckList = new ArrayList<Truck>();
		Location addressLoc = new Location(false, this.sfLng , this.sfLat);
		int zoom = 14;
		try {
			if(address!=null){
				truckList = truckService.getTrucks(address);
				JSONObject latLng = truckService.getLatLng(address);
				addressLoc.setLatitude(latLng.has("lat")?latLng.getDouble("lat"):0);
				addressLoc.setLongitude(latLng.has("lng")?latLng.getDouble("lng"):0);
				zoom = 17;
			}
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
			model.addAttribute("addressError", e.getMessage());
		}
		model.addAttribute("truckList", truckList);
		model.addAttribute("address", addressLoc);
		model.addAttribute("zoom", zoom);
		return "welcome";
	}
	
	public static void main(String[] args) {
	}

}
