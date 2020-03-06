package br.com.frsiqueira.zuulstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulStudyApplication.class, args);
	}

}
