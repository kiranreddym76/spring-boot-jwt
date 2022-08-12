/**
 * 
 */
package com.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author Kiran_Molakala
 *
 */
@Service
public class WeatherService {
	RestTemplate restTemplate = new RestTemplate();
	@Value("${appid}")
	private String appid;
	@Value("${token}")
	private String token;
	@Value("${baseurl}")
	private String baseurl;
	@Value("${and}")
	private String and;
	
	private RedisTemplate<String, String> redisTemplate;
	private HashOperations hashOperations;
	

	public WeatherService(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}

	public String getWeather(String location) {
		HttpHeaders headers = new HttpHeaders();
		headers.set(appid,token);
		String  url = baseurl.concat(location).concat(and).concat(appid).concat("=").concat(token);
		HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
				requestEntity, String.class);
		System.out.println(responseEntity.getBody());
		hashOperations.get("WeatherReport",location);
		return responseEntity.getBody();
	}

}
