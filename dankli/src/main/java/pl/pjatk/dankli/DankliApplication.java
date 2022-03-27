package pl.pjatk.dankli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:kompo.xml"})
public class DankliApplication {

	public static void main(String[] args) {
		SpringApplication.run(DankliApplication.class, args);
	}

}
