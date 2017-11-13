package com.binarybayou.configs;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Joshua Eaton on 8/28/17.
 */
@Configuration
public class MainConfig {


    /*This enables the view of the h2 console. Go to http://localhost:8090/console to view*/
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
}
