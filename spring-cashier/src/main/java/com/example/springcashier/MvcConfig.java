package com.example.springcashier;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/home").setViewName("home");
    registry.addViewController("/").setViewName("home");
    registry.addViewController("/design").setViewName("design");
    registry.addViewController("/order").setViewName("order");
    registry.addViewController("/pay").setViewName("pay");
    registry.addViewController("/login").setViewName("login");
  }

}