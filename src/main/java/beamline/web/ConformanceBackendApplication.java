package beamline.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"beamline.core"})
public class ConformanceBackendApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ConformanceBackendApplication.class, args);
	}
}
