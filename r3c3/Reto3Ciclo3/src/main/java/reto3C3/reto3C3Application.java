package reto3C3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//1. Modelo
//2. Interface
//3. Repositorio
//4. Servicios
//5. Controlador o Web

// Categoria, Finca,Cliente,Mensaje y Reservacion

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {" reto3C3.Modelo"})
public class reto3C3Application {

	public static void main(String[] args) {
		SpringApplication.run(reto3C3Application.class, args);
	}

}
