package com.springrest.springrest.entities;

public class Trip {

	private long tripId;
	private long boatId;
	private String startingTime;
	private String EndingTime;
	private long id;
	private Float avgRating;
	private Long totalpeople;
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trip(long tripId, long boatId, String startingTime, String endingTime, long id, Float avgRating,
			Long totalpeople) {
		super();
		this.tripId = tripId;
		this.boatId = boatId;
		this.startingTime = startingTime;
		EndingTime = endingTime;
		this.id = id;
		this.avgRating = avgRating;
		this.totalpeople = totalpeople;
	}
	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", boatId=" + boatId + ", startingTime=" + startingTime + ", EndingTime="
				+ EndingTime + ", id=" + id + ", avgRating=" + avgRating + ", totalpeople=" + totalpeople + "]";
	}
	public long getTripId() {
		return tripId;
	}
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	public long getBoatId() {
		return boatId;
	}
	public void setBoatId(long boatId) {
		this.boatId = boatId;
	}
	public String getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	public String getEndingTime() {
		return EndingTime;
	}
	public void setEndingTime(String endingTime) {
		EndingTime = endingTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}
	public Long getTotalpeople() {
		return totalpeople;
	}
	public void setTotalpeople(Long totalpeople) {
		this.totalpeople = totalpeople;
	}
	
	
	
}
