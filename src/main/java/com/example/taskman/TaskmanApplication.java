package com.example.taskman;

import io.prometheus.client.hotspot.DefaultExports;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanApplication {

	public static void main(String[] args) {
		// Enable JVM metrics collection
		DefaultExports.initialize();
		SpringApplication.run(TaskmanApplication.class, args);
	}

}
