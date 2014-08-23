/**
 * 
 */
package com.uber.foodtrucks.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author abiel_m_woldu
 *
 */


@XmlRootElement
public class Truck implements Serializable{

	private static final long serialVersionUID = 1L;
	private Location location;
	private String status;
	private Date expirationdate;
	private String permit;
	private int block;
	private Date received;
	private String facilitytype;
	private int blocklot;
	private String locationdescription;
	private int cnn;
	private int priorpermit;
	private Date approved;
	private String schedule;
	private String address;
	private String applicant;
	private String lot;
	private String fooditems;
	private double longitude;
	private double latitude;
	private int objectid;
	private double y;
	private double x;
	
	public Truck() {
	}
	
	public Truck(Location location, String status, Date expirationdate,
			String permit, int block, Date received, String facilitytype,
			int blocklot, String locationdescription, int cnn, int priorpermit,
			Date approved, String schedule, String address, String applicant,
			String lot, String fooditems, double longitude, double latitude,
			int objectid, double y, double x) {
		super();
		this.location = location;
		this.status = status;
		this.expirationdate = expirationdate;
		this.permit = permit;
		this.block = block;
		this.received = received;
		this.facilitytype = facilitytype;
		this.blocklot = blocklot;
		this.locationdescription = locationdescription;
		this.cnn = cnn;
		this.priorpermit = priorpermit;
		this.approved = approved;
		this.schedule = schedule;
		this.address = address;
		this.applicant = applicant;
		this.lot = lot;
		this.fooditems = fooditems;
		this.longitude = longitude;
		this.latitude = latitude;
		this.objectid = objectid;
		this.y = y;
		this.x = x;
	}	

	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getExpirationdate() {
		return expirationdate;
	}


	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	}


	public String getPermit() {
		return permit;
	}


	public void setPermit(String permit) {
		this.permit = permit;
	}


	public int getBlock() {
		return block;
	}


	public void setBlock(int block) {
		this.block = block;
	}


	public Date getReceived() {
		return received;
	}


	public void setReceived(Date received) {
		this.received = received;
	}


	public String getFacilitytype() {
		return facilitytype;
	}


	public void setFacilitytype(String facilitytype) {
		this.facilitytype = facilitytype;
	}


	public int getBlocklot() {
		return blocklot;
	}


	public void setBlocklot(int blocklot) {
		this.blocklot = blocklot;
	}


	public String getLocationdescription() {
		return locationdescription;
	}


	public void setLocationdescription(String locationdescription) {
		this.locationdescription = locationdescription;
	}


	public int getCnn() {
		return cnn;
	}


	public void setCnn(int cnn) {
		this.cnn = cnn;
	}


	public int getPriorpermit() {
		return priorpermit;
	}


	public void setPriorpermit(int priorpermit) {
		this.priorpermit = priorpermit;
	}


	public Date getApproved() {
		return approved;
	}


	public void setApproved(Date approved) {
		this.approved = approved;
	}


	public String getSchedule() {
		return schedule;
	}


	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getApplicant() {
		return applicant;
	}


	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}


	public String getLot() {
		return lot;
	}


	public void setLot(String lot) {
		this.lot = lot;
	}


	public String getFooditems() {
		return fooditems;
	}


	public void setFooditems(String fooditems) {
		this.fooditems = fooditems;
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


	public int getObjectid() {
		return objectid;
	}


	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public static void main(String[] args) {
	}

}
