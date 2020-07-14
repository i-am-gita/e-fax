package pmf.it.mis.project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan({"pmf.it.mis.project.app"})
@EnableJpaRepositories("pmf.it.mis.project.app.repository")
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

	}

}
