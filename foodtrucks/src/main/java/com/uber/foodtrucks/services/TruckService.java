/**
 * 
 */
package com.uber.foodtrucks.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;
import com.uber.foodtrucks.constants.APP;
import com.uber.foodtrucks.custom_exception.AddressNotFoundException;
import com.uber.foodtrucks.domain.Truck;
import com.uber.foodtrucks.utils.HttpResponseHandler;

/**
 * @author abiel_m_woldu
 *
 */

@Service
public class TruckService {
	public static final double radius = 0.003; //approx: 300 meters
	private static Logger logger = Logger.getLogger(TruckService.class);
		
	public TruckService() {
	}
	
	/***
	 * 
	 * @param address address around which food trucks are searched.
	 * @return
	 * @throws JSONException
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws AddressNotFoundException 
	 */
	public List<Truck> getTrucks(String address) throws JSONException, ClientProtocolException, IOException, URISyntaxException, AddressNotFoundException {
		JSONObject latLng = getLatLng(address);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String longitudeSubQuery = "longitude > " + (latLng.getDouble("lng") - radius) + " AND longitude < " + (latLng.getDouble("lng") + radius);
		String latitudeSubQuery = " latitude > " + (latLng.getDouble("lat") - radius) + " AND latitude < " + (latLng.getDouble("lat") + radius);
        URI uri = new URIBuilder().setScheme("http").setHost(APP.URI.FOOD_TRUCK_API).setPath(APP.URI.FOOD_TRUCK_PATH).setParameter("$where", longitudeSubQuery + " AND " + latitudeSubQuery).build();
        HttpGet httpgetTrucks = new HttpGet(uri);
		ResponseHandler<String> responseHandlerTrucks = new HttpResponseHandler();
        String responseBodyTrucks = httpclient.execute(httpgetTrucks, responseHandlerTrucks);
        JSONArray responseJSONTrucks = new JSONArray(responseBodyTrucks);
        List<Truck> truckList = new ArrayList<Truck>();
        for(int i=0; i<responseJSONTrucks.length(); i++){
        	JSONObject currentTruck = responseJSONTrucks.getJSONObject(i);
        	Truck truck = new Truck();
        	truck.setLatitude((currentTruck.has("latitude"))?currentTruck.getDouble("latitude"):0);
        	truck.setLongitude((currentTruck.has("longitude"))?currentTruck.getDouble("longitude"):0);
        	truck.setApplicant((currentTruck.has("applicant"))?currentTruck.getString("applicant"):"");
        	truck.setFooditems((currentTruck.has("fooditems"))?currentTruck.getString("fooditems"):"");
        	truckList.add(truck);
        }
		return truckList;
	}
	
	/**
	 * Used to retrieve all tracks in SF using DataSF.
	 * @return
	 */
	public List<Truck> getAllTrucks(){
		return null;
	}
	
	
	/***
	 * Given an address returns lat, lng coordinates of the address.
	 * @param address
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws JSONException
	 * @throws URISyntaxException 
	 * @throws AddressNotFoundException 
	 */
	public JSONObject getLatLng(String address) throws ClientProtocolException, IOException, JSONException, URISyntaxException, AddressNotFoundException{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		URI uri = new URIBuilder().setScheme("https").setHost(APP.URI.GEOCODE_API).setPath(APP.URI.GEOCODE_PATH).setParameter("address", address).build();
		HttpGet httpget = new HttpGet(uri);
		ResponseHandler<String> responseHandler = new HttpResponseHandler();
        String responseBody = httpclient.execute(httpget, responseHandler);
        JSONObject responseJSON = new JSONObject(responseBody);
        JSONArray resultsJSONArray = responseJSON.getJSONArray("results");
        if(resultsJSONArray.length() == 0) {
        	logger.info("Address Not Found: " + address);
        	throw new AddressNotFoundException("Sorry, the address is not found.");
        }
        JSONObject geometry = resultsJSONArray.getJSONObject(0).getJSONObject("geometry");
        JSONObject location = geometry.getJSONObject("location");
        return location;
	}

	public static void main(String[] args) {
	}

}
