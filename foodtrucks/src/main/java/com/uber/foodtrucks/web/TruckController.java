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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	public TruckController() {
	}

	@RequestMapping("/welcome")
	public String welcome(@RequestParam(required = false) String address, Model model) 
	{
		List<Truck> truckList = new ArrayList<Truck>();
		Location addressLoc = new Location();
		try {
			if(address!=null){
				truckList = truckService.getTrucks(address);
				JSONObject latLng = truckService.getLatLng(address);
				addressLoc.setLatitude(latLng.has("lat")?latLng.getDouble("lat"):0);
				addressLoc.setLongitude(latLng.has("lng")?latLng.getDouble("lng"):0);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		model.addAttribute("truckList", truckList);
		model.addAttribute("address", addressLoc);
		return "welcome";
	}
	
	

	public static void main(String[] args) {

	}

}
