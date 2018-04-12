package cowboy.eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 基于Ribbon 的调用
 * @author ydzcowboy
 *
 */
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value = "/ribbon-consumer",method=RequestMethod.GET)
	public String helloConsumer(){
		System.out.println("eureka consumer say hello");
		return restTemplate.getForEntity("http://eureka-client/hello", String.class).getBody();
	}
}
