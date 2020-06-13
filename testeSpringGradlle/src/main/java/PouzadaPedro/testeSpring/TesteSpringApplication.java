package PouzadaPedro.testeSpring;

import PouzadaPedro.testeSpring.Modelo.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class TesteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringApplication.class, args);

	 Calculadora calculadora = new Calculadora();

	 calculadora.setNumero1(10);
	 calculadora.setNumero2(5);
	 System.out.println(calculadora);






	}

}
