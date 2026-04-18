package presentation;

import metier.IMetier;
import metier.IMetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXml implements IPresentation {
    public static void main(String[] args) {
        //aller cherche un fich config.xml pour commencer a creer le sobjets au demarrage  spring qui le fiat
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        IMetierImpl metier = (IMetierImpl) context.getBean("metier");  reccup le bean avec son nom dans fich config
        IMetierImpl metier = (IMetierImpl) context.getBean(IMetier.class);//recup le bean avec son interface cad lobj qui implement cette interface
        System.out.println("RES="+metier.calcul());

    }
}
