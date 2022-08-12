package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weather.cache.WeatherCache;

@RestController
@CrossOrigin()
public class WeatherReportController {

	 @Autowired
	    WeatherCache weatherCache;
	    @GetMapping("/weatherReport/{name}")
	    @ResponseBody
	    public ResponseEntity<String> getWeather(@PathVariable String name){
	    	String weatherReport = weatherCache.getWeather(name);
	        return new ResponseEntity<String>(weatherReport, HttpStatus.OK);
	    }
}
