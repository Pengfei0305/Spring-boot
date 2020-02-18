package com.example.demo.config;//package com.cognizant.fijpostcrud.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true) //Enables perAuthorize to work, otherwise preAuthoized on the controllers and test will not work
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    public void configure(final WebSecurity web) {
//        web.ignoring()
//                .antMatchers(HttpMethod.GET, "/**");
//    }
//}
//
