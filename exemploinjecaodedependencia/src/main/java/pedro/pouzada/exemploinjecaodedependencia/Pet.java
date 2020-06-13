package pedro.pouzada.exemploinjecaodedependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pedro.pouzada.exemploinjecaodedependencia.interfaces.AnimalInterface;
import pedro.pouzada.exemploinjecaodedependencia.model.Cat;

/**
 * @author Pedro
 * @version 1.0
 * @since  13/06/2020 - 13:32
 */

@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }


//  Modo errado
//    public void execute() {
//        animalInterface = new Cat();
//        animalInterface.comunicar();
//    }

}
