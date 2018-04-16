/**
 * 
 */
package com.future.bigbazaar.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 364808
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMainApplication.class, args);
	}
}
