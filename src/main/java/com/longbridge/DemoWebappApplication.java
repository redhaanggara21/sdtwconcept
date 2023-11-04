package com.longbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoWebappApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder
  configure(SpringApplicationBuilder application) {
    return application.sources(DemoWebappApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoWebappApplication.class, args);
  }
}
