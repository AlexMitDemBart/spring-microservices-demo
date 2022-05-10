package azo.developer.servicedispatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDispatcherApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDispatcherApplication.class, args);
    }

}
