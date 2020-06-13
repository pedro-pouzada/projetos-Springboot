package pouzada.pedro.exemplolombok.model;

import lombok.*;

/**
 * @author Pedro
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return
     */
    public int calculateAgeInMonths() {
        return this.age *12;
    }
}
