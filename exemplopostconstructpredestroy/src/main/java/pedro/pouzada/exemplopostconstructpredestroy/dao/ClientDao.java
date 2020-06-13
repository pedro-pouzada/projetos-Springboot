package pedro.pouzada.exemplopostconstructpredestroy.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pedro.pouzada.exemplopostconstructpredestroy.model.Client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Pedro Pouzada
 * @version 1.0
 * @since 13/06/2020 - 14:11
 */
//Lombok
@Getter @Setter


//SpringBoot
@Component
public class ClientDao {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("objeto foi criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado!");
    }



}
