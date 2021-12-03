package MadaEss.MadaEss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MadaEssApplication {

	@GetMapping("/message")
	public String helloController(){
		return "Welcome dear";
	}
	public static void main(String[] args) {
		SpringApplication.run(MadaEssApplication.class, args);
	}

}
