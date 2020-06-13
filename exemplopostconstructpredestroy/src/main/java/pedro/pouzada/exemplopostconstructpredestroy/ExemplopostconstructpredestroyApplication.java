package pedro.pouzada.exemplopostconstructpredestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pedro.pouzada.exemplopostconstructpredestroy.dao.ClientDao;
import pedro.pouzada.exemplopostconstructpredestroy.model.Client;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDao clientDao = applicationContext.getBean(ClientDao.class);

		clientDao.setClient(new Client("Pedro","Pouzada"));

		System.out.println("ClientDAO: " + clientDao);
		System.out.println("Client: " + clientDao.getClient().toString());



	}

}
