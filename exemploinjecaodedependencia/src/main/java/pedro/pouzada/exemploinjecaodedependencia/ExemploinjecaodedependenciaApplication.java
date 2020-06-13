package pedro.pouzada.exemploinjecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pedro.pouzada.exemploinjecaodedependencia.model.Cat;
import pedro.pouzada.exemploinjecaodedependencia.model.Dog;

/**
 * @author Pedro
 * @version 1.0
 * @since 13/06/2020 - 13:35
 */
@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		//	 3 - Maneira
		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

//  1 - Maneira - acoplado, errado.
//		Pet pet = new Pet();
//		pet.execute();

//   2 -  maneira - menos acoplado.
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet1.execute();




	}

}
