package com.weather.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Value("${jwt.secretNname}")
	private String secretNname;
	@Value("${jwt.key}")
	private String key;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (secretNname.equals(username)) {
			return new User(secretNname, key, new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}