package pedro.pouzada.exemploescopo.dao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Pedro
 * @version 1.0
 * @since  13/06/2020 - 14:35
 */
//Lombook
@Getter @Setter


//Spring
@Component
//1maneira
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//2maneira
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassDao {

    @Autowired
    private ClassJDBC classJDBC;

}
