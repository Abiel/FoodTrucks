/**
 * 
 */
package com.uber.foodtrucks.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author abiel_m_woldu
 *
 */

@XmlRootElement
public class Location {
	private boolean needs_recoding;
	private double longitude;
	private double latitude;

	public Location() {
	}

	public Location(boolean needs_recoding, double longitude, double latitude) {
		super();
		this.needs_recoding = needs_recoding;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public boolean isNeeds_recoding() {
		return needs_recoding;
	}

	public void setNeeds_recoding(boolean needs_recoding) {
		this.needs_recoding = needs_recoding;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public static void main(String[] args) {

	}
}
