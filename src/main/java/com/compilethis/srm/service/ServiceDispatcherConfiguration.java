package com.compilethis.srm.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { ServiceDispatcherConfiguration.class })
public class ServiceDispatcherConfiguration extends WebMvcConfigurerAdapter {


}
