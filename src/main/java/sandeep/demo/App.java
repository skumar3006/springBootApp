package sandeep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author -- Sandeep kumar vishwakarma
 *
 */

@SpringBootApplication
@EnableTransactionManagement
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
