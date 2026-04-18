package presentation;

import metier.IMetier;
import metier.IMetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringVersion2Annotation implements IPresentation {
    public static void main(String[] args) {
        //aller chercher dans ces packges si ya des classes avec annotations componenets cree les
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","ext");
        //Il va creer les bean on les demande ici
       IMetierImpl metier = (IMetierImpl) context.getBean(IMetier.class);
       System.out.println("RES="+metier.calcul());

    }
}
