package pl.pjatk.dankli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

@Configuration
public class Konfa {

    @Bean
    public Pojo obiekcik1(@Value("${my.custom.property: profil drugi}") String q){
        System.out.println(q);
        return new Pojo();
    }//stara wersja

    @Bean
    public Pojo obiekcik2(@Value("${obiekt.ktorego.nie.ma:wow to dziala}") String q){
        System.out.println(q);
        return new Pojo();
    }//nowa wersja

    @Bean
    @ConditionalOnProperty(prefix = "my.custom", name = "zmienna")
    public Pojo obiekcik3(@Value("${my.custom.zmienna}") Boolean q){
        System.out.println(q);
        return new Pojo();
    }




    @Bean
    public List<String> defaultData(){
        List<String> lista = new LinkedList<String>();
        lista.add("lolo");
        lista.add("kolo");
        lista.add("bolo");
        lista.add("lobo");
        lista.add("mobo");
        return lista;

    }
}
