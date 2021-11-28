package ru.iway.admin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



import ru.iway.admin.user.UserRepository;
import ru.iway.entity.User;

public class IwayUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepo.getUserByEmail(email);
		if (user != null) {
			return new IwayUserDetails(user);
		}
		
		throw new UsernameNotFoundException("Could not find user with email: " + email);
	}

}
