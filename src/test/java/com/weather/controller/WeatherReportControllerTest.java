package com.weather.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.weather.model.JwtRequest;

/**
 * 
 */

/**
 * @author kiran
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WeatherReportControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void getWeatherReport() throws Exception {
		mockMvc.perform(get("/weatherReport/Nellore")).andExpect(status().is4xxClientError());
	}
	@Test
	public void getjwttoken() throws Exception {
		String jsonString = "{\n" +
                "\"userName\":\"kiranreddy\",\n" +
                "\"password\":\"password\"\n" +
                "}";
		mockMvc.perform(post("/authenticate").contentType(MediaType.APPLICATION_JSON).content(jsonString)).andExpect(status().is2xxSuccessful());
	}

}
