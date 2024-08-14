package com.example.__WebClientUsageforAsyncCalls;

import com.example.__WebClientUsageforAsyncCalls.service.WebClientUsage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		WebClientUsage bean = context.getBean(WebClientUsage.class);
//		bean.syncCall();
		bean.aSyncCall();
	}

}
