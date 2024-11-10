package dev.nickowen.deploy_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeployTestApplication extends SpringBootServletInitializer{
	
	@Override
	 protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
	    return builder.sources(DeployTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DeployTestApplication.class, args);
	}

}
