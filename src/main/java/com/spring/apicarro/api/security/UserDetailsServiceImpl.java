package com.spring.apicarro.api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.apicarro.domain.UserRepository;
import com.spring.apicarro.domain.User_;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRep;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User_ user = userRep.findUserByLogin(username);

		if (user == null) {
			throw new UsernameNotFoundException("login not found");
		}
		return user;
	}
}