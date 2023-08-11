// package com.furlencoapp.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.provisioning.UserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class WebConfig {

//     //authentication using inmemory authentication
//     @Bean
//     public UserDetailsManager userDetailsManager() {
// 		UserDetails user1 = User.withUsername("Mahesh")
// 				.password(encoder().encode("Mahesh123"))
// 				.roles("ADMIN")
// 				.build();
		
// 		UserDetails user2 = User.withUsername("Bishnoi")
// 				.password(encoder().encode("Bishnoi@123"))
// 				.roles("USER")
// 				.build();
		
// 		return new InMemoryUserDetailsManager(user1,user2);
// 	}

//     @Bean
//     public PasswordEncoder encoder() {
// 		return new BCryptPasswordEncoder();
// 	}

//     // authorization bean
//     @Bean
//     public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//     	System.out.println("Auth");
// 		// authorize http requests based on the roles
    	
// 		return http.cors().and().csrf().disable().authorizeHttpRequests(request -> {
			
// 			request.requestMatchers("/api/customer/add").hasRole("ADMIN");
// 			request.requestMatchers("/api/customer/update").hasRole("ADMIN");
// 			request.requestMatchers("/api/customer/delete/**").hasRole("ADMIN");
// 			request.requestMatchers("/api/customer/all").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/customer/name/**").hasAnyRole("ADMIN","USER");
			
// 			request.requestMatchers("/api/furniture/add").hasRole("ADMIN");
// 			request.requestMatchers("/api/furniture/update").hasRole("ADMIN");
// 			request.requestMatchers("/api/furniture/delete/**").hasRole("ADMIN");
// 			request.requestMatchers("/api/furniture/furnitures").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/name/**").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/price/**").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/type/**").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/size/**").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/review-star/**").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/name-price").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/name-size").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/name-review-star").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/price-size").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/price-type").hasAnyRole("ADMIN","USER");
// 			request.requestMatchers("/api/furniture/price-review-star").hasAnyRole("ADMIN","USER");
// 		})
// 		.httpBasic()
// 		.and()
// 		.build();
// 	}
// } 
