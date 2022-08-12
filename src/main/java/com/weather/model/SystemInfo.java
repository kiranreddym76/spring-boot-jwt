/**
 * 
 */
package com.weather.model;

import java.io.Serializable;

/**
 * @author Kiran_Molakala
 *
 */
public class SystemInfo  {

	/**
	 * 
	 */
	private String country;
	private long sunrise;
	private long sunset;
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the sunrise
	 */
	public long getSunrise() {
		return sunrise;
	}
	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}
	/**
	 * @return the sunset
	 */
	public long getSunset() {
		return sunset;
	}
	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
	
	

}
