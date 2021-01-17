package cn.tedu.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableEurekaClient
//@SpringBootApplication
//@EnableCircuitBreaker
@EnableFeignClients
@SpringCloudApplication
public class Sp06FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp06FeignApplication.class, args);
	}

}
