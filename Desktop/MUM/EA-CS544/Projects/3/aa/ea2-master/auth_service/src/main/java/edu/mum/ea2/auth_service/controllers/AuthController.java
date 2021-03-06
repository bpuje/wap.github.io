package edu.mum.ea2.auth_service.controllers;

import edu.mum.ea2.auth_service.configs.JwtTokenUtil;
import edu.mum.ea2.auth_service.configs.JwtUserService;
import edu.mum.ea2.auth_service.entities.UserEntity;
import edu.mum.ea2.auth_service.models.SignInCredentials;
import edu.mum.ea2.auth_service.repos.UsersRepo;
import edu.mum.shared.models.Order;
import edu.mum.shared.models.Result;
import edu.mum.shared.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	UsersRepo usersRepo;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserService userDetailsService;

	@PostMapping(value = "/sign-in")
	public ResponseEntity<String> singIn(@RequestBody SignInCredentials signInCredentials) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInCredentials.getEmail(), signInCredentials.getPassword()));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(signInCredentials.getEmail());
		final String token = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(token);
	}


}
