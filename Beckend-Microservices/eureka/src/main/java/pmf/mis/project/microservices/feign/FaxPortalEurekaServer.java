package pmf.mis.project.microservices.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FaxPortalEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(FaxPortalEurekaServer.class, args);
	}

}


