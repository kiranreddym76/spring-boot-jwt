/**
 * 
 */
package com.weather.model;

import java.io.Serializable;

/**
 * @author Kiran_Molakala
 *
 */
public class Wind {
	/**
	 * 
	 */
	private float speed;
	private int deg;
	private float gust;
	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	/**
	 * @return the deg
	 */
	public int getDeg() {
		return deg;
	}
	/**
	 * @param deg the deg to set
	 */
	public void setDeg(int deg) {
		this.deg = deg;
	}
	/**
	 * @return the gust
	 */
	public float getGust() {
		return gust;
	}
	/**
	 * @param gust the gust to set
	 */
	public void setGust(float gust) {
		this.gust = gust;
	}
	
	
}
