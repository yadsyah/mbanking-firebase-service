package id.co.diansetiyadi.firebaseservice;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class FirebaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirebaseServiceApplication.class, args);
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
