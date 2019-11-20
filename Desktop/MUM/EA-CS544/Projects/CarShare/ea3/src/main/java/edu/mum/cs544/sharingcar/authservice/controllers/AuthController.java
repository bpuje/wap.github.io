package edu.mum.cs544.sharingcar.authservice.controllers;

import edu.mum.cs544.sharingcar.authservice.configs.JwtTokenUtil;
import edu.mum.cs544.sharingcar.authservice.configs.JwtUserService;
import edu.mum.cs544.sharingcar.authservice.entities.UserEntity;
import edu.mum.cs544.sharingcar.authservice.models.SignInCredentials;
import edu.mum.cs544.sharingcar.authservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserService userDetailsService;

    @GetMapping("/")
    public ResponseEntity<?> index() {
        String host = "Unknown host";
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>("auth-service. Host: " + host, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> saveUser(@RequestBody UserEntity userEntity) throws Exception {
        userEntity.setPassword(bcryptEncoder.encode(userEntity.getPassword()));
        userEntity.setEmail(bcryptEncoder.encode(userEntity.getEmail())); // maybe not need
        userRepository.save(userEntity);
        return ResponseEntity.ok("User added Successfully");
    }

    @PostMapping(value = "/sign-in")
    public ResponseEntity<String> signIn(@RequestBody SignInCredentials signInCredentials) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInCredentials.getEmail(), signInCredentials.getPassword()));
        } catch (DisabledException e){
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDETIALS", e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(signInCredentials.getEmail());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(token);
    }


}
