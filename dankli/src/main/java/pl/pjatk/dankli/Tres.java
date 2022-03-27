package pl.pjatk.dankli;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Tres {
    private ApplicationContext ApplicationContext;

    public Tres(ApplicationContext ApplicationContext) {
        this.ApplicationContext = ApplicationContext;
        ComponentTresBean();

    }

    private void ComponentTresBean(){
        ApplicationContext.getBean("componentUno",ComponentUno.class).helikoptery();
        ApplicationContext.getBean("componentDos", ComponentDos.class).helikoptery();
    }


}
