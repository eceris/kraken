package kr.co.eceris;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
//https://spring.io/guides/gs/routing-and-filtering/

//https://cloud.spring.io/spring-cloud-netflix/
//https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/
