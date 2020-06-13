package pedro.pouzada.exemploescopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pedro.pouzada.exemploescopo.dao.ClassDao;
import pedro.pouzada.exemploescopo.dao.ClassJDBC;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC objJDBC  = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1  = applicationContext.getBean(ClassJDBC.class);


		ClassDao objDAO  = applicationContext.getBean(ClassDao.class);
		ClassDao objDAO1  = applicationContext.getBean(ClassDao.class);

		System.out.println("Objeto da classe JDBC: " + objJDBC);
		System.out.println("Objeto da classe JDBC1: " + objJDBC1);

		System.out.println("Objeto da classe DAO: " + objDAO);
		System.out.println("Objeto da classe DAO1: " + objDAO1);

	}

}
