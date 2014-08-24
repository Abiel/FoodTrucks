/**
 * 
 */
package com.uber.foodtrucks.utils;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/**
 * @author abiel_m_woldu
 * Util to retrieve http content from httpResponse objects.
 */
public class HttpResponseHandler implements ResponseHandler<String> {

	public HttpResponseHandler() {
	}

	public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
		int status = response.getStatusLine().getStatusCode();
		if (status >= 200 && status < 300) {
			HttpEntity entity = response.getEntity();
			return entity != null ? EntityUtils.toString(entity) : null;
		} else {
			throw new ClientProtocolException("Unexpected response status: "+ status);
		}
	}

}
