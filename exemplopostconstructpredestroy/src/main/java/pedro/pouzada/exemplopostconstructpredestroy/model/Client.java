package pedro.pouzada.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Pedro Pouzada
 * @version 1.0
 * @since 13/06/2020 - 14:07
 */
//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//Springboot
@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe Cliente!");
    }
}
