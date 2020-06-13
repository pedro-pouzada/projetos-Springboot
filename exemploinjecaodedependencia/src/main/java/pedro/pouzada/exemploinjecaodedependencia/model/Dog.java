package pedro.pouzada.exemploinjecaodedependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pedro.pouzada.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author Pedro
 * @version 1.0
 * @since 13/06/2020 - 13:30
 */

@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au auuu!");
    }
}
