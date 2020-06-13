package pedro.pouzada.exemploescopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Pedro Pouzada
 * @version 1.0
 * @since  13/06/2020 - 14:34
 */
@Component
//1maneira
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//2maneira
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");
    }
}
