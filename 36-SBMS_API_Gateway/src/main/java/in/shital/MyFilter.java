package in.shital;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		System.out.println("Filter executed.....");
		
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		for(String key:keySet) {
			System.out.println(key+"--");
			System.out.println(headers.getValuesAsList(key));
		}
		return chain.filter(exchange);
	}

}

//We are using API_Gateway for routing and filters
//We have to specify routes in application.yml file. For every REST-API there should be unique id and uri 

//We have implemented GlobalFilter here. 
//By using this interface we are getting headers and printing them in key-value format
//We can implement no of filters in API-Gateway