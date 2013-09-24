package com.entity;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Event {
	private String eventName;
	private Location location;
	private Timestamp startTime;
	private Timestamp endTime;
	private ArrayList<User> attendees;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public ArrayList<User> getAttendees() {
		return attendees;
	}
	public void setAttendees(ArrayList<User> attendees) {
		this.attendees = attendees;
	}
	
	
}