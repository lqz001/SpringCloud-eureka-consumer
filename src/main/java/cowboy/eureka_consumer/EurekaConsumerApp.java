package cowboy.eureka_consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * eureka consumer
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApp 
{
	/**
	 * 开启客户端负载均衡
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "eureka consumer" );
        new SpringApplicationBuilder(EurekaConsumerApp.class).web(true).run(args);
    }
}
