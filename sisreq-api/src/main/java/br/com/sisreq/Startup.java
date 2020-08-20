package br.com.sisreq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableConfigurationProperties({
//	FileStorageConfig.class
//})
@ComponentScan
public class Startup {
	
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
