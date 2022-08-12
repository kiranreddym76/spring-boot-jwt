/**
 * 
 */
package com.weather.model;

import java.io.Serializable;

/**
 * @author Kiran_Molakala
 *
 */
public class WeatherReport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Coordinates scoord;
	private Weather[] weather;
	private String base;
	private MainInfo main;
	private int visibility;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private System sys;
	private int timezone;
	private int id;
	private String name;
	private int cod;
	/**
	 * @return the scoord
	 */
	public Coordinates getScoord() {
		return scoord;
	}
	/**
	 * @param scoord the scoord to set
	 */
	public void setScoord(Coordinates scoord) {
		this.scoord = scoord;
	}
	
	/**
	 * @return the base
	 */
	public String getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(String base) {
		this.base = base;
	}
	/**
	 * @return the main
	 */
	public MainInfo getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(MainInfo main) {
		this.main = main;
	}
	/**
	 * @return the visibility
	 */
	public int getVisibility() {
		return visibility;
	}
	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}
	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}
	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	/**
	 * @return the dt
	 */
	public long getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(long dt) {
		this.dt = dt;
	}
	/**
	 * @return the sys
	 */
	public System getSys() {
		return sys;
	}
	/**
	 * @param sys the sys to set
	 */
	public void setSys(System sys) {
		this.sys = sys;
	}
	/**
	 * @return the timezone
	 */
	public int getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	
	

}
