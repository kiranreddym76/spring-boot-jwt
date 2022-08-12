package com.weather.cache;

//import com.weather.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.weather.service.WeatherService;

@Component
public class WeatherCache {
    @Autowired
    WeatherService weatherService;

    @Cacheable(value="WeatherReport", key="#location")
    public String getWeather(String name){
        String weatherReport = null;
        try{
        	 weatherReport = weatherService.getWeather(name);
        }catch(Exception e){
            e.printStackTrace();
        }
        return weatherReport;
    }
   
}
