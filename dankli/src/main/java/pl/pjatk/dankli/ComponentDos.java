package pl.pjatk.dankli;
import org.springframework.stereotype.Component;

@Component
public class ComponentDos {
    public ComponentDos(ComponentUno ComponentUno){
        System.out.println("witam w drugim pliczku");
        ComponentUno.helikoptery();
        helikoptery();
    }

    public void helikoptery(){
        System.out.println("helikoptery dwaa");
    }
}
