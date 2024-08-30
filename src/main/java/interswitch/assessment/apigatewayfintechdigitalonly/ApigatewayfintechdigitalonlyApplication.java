package interswitch.assessment.apigatewayfintechdigitalonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//the annotation discovery client is use to register this service as a client to the discovery server eureka
@EnableDiscoveryClient
public class ApigatewayfintechdigitalonlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigatewayfintechdigitalonlyApplication.class, args);
    }

}
