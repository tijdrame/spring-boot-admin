package com.boa.metrics.springbootadminserver;

import java.util.Base64;

import javax.security.auth.AuthPermission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import de.codecentric.boot.admin.server.web.client.HttpHeadersProvider;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminServerApplication.class, args);
	}

	/*@Bean
	public HttpHeadersProvider customHttpHeadersProvider() {
		return  instance -> {
			HttpHeaders httpHeaders = new HttpHeaders();
			String autho = "admin" + ":" + "admin";
            String basicAuth = new String(Base64.getEncoder().encode(autho.getBytes()));
			//httpHeaders.setBearerAuth(basicAuth);
			
			//httpHeaders.setBearerAuth(".eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTYzNjYyNTA1MH0.nHtxH7-ePFodjHMVX3hx8-3zr65Dm9aNRrXZRJMPfWoemrvqh5HM-V0hcruCcEZhMojuYl2jSJb30bRo9tN3tg");
			httpHeaders.add("Authorization", "Bearer "+basicAuth);
			return httpHeaders;
		};
	}*/

}
