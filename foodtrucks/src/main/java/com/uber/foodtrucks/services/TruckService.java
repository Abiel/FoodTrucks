/**
 * 
 */
package com.uber.foodtrucks.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;
import com.uber.foodtrucks.constants.Const;
import com.uber.foodtrucks.domain.Truck;

/**
 * @author abiel_m_woldu
 *
 */

@Service
public class TruckService {
		
	public TruckService() {
	}
	
	public List<Truck> getAllTrucks() throws JSONException, ClientProtocolException, IOException, URISyntaxException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(Const.URI.GEOCODE_API+"?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA");
		ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
            public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }

        };
        String responseBody = httpclient.execute(httpget, responseHandler);
        JSONObject responseJSON = new JSONObject(responseBody);
        //System.out.println(responseJSON);
        JSONArray resultsJSONArray = responseJSON.getJSONArray("results");
        JSONObject geometry = resultsJSONArray.getJSONObject(0).getJSONObject("geometry");
        JSONObject location = geometry.getJSONObject("location");
        //System.out.println(location.get("lat"));
        //System.out.println(location.get("lng"));
        
        //2. Pull all tracks around this lat, lng.
        URI uri = new URIBuilder().setScheme("http").setHost(Const.URI.FOOD_TRUCK_API).setPath(Const.URI.FOOD_TRUCK_PATH).setParameter("$where", "longitude > -122.395408901605 AND longitude < -122.394408901500").build();
        HttpGet httpgetTrucks = new HttpGet(uri);
        System.out.println(httpgetTrucks.getURI());
		ResponseHandler<String> responseHandlerTrucks = new ResponseHandler<String>() {
            public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }
        };
        String responseBodyTrucks = httpclient.execute(httpgetTrucks, responseHandlerTrucks);
        JSONArray responseJSONTrucks = new JSONArray(responseBodyTrucks);
        System.out.println(responseJSONTrucks);
        
		return null;
	}

	public static void main(String[] args) {

	}

}
