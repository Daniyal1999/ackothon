package com.acko.ackothon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableFeignClients(basePackages = {"com.acko.ackothon"})
public class AckothonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AckothonApplication.class, args);
	}

}
