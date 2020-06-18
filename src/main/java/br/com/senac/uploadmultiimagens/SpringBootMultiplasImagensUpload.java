package br.com.senac.uploadmultiimagens;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackageClasses = { 
		SpringBootMultiplasImagensUpload.class,
		Jsr310JpaConverters.class 
})

@EnableTransactionManagement
public class SpringBootMultiplasImagensUpload {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultiplasImagensUpload.class, args);
	}
}
