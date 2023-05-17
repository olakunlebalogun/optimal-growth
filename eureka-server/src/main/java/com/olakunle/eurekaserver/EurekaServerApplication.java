package com.olakunle.eurekaserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

	@Value("${eureka.instance.hostname}")
	public String hostName;

	@Override
	public void run(String... args) throws Exception {
		log.error("########################## {} #############################", hostName);
	}



}
