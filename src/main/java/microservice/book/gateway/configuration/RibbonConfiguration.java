package microservice.book.gateway.configuration;

import org.springframework.context.annotation.Bean;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;

/**
 * 서비스에 핑을 보내고 결과에 따라 로드밸런싱하는 기능
 * 리본은 로드밸런싱 전략을 제공 및 트래픽을 분산
 */
public class RibbonConfiguration {

    @Bean
    public IPing ribbonPing(final IClientConfig config) {
        return new PingUrl(false, "/health");
    }

    @Bean
    public IRule ribbonRule(final IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
