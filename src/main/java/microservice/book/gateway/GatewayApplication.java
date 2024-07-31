package microservice.book.gateway;

import microservice.book.gateway.configuration.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
// 로드밸런싱 설정을 달리한 여러 리본 클라이언트를 설정 할 수 있음
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
