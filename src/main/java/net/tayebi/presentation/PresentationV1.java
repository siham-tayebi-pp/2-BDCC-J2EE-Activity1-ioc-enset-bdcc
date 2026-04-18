package net.tayebi.presentation;

import net.tayebi.metier.IMetier;
import net.tayebi.dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.Scanner;

public class PresentationV1 {
    public static void main(String[] args)  {
        //meth 1
        //Injectio des dependance aevc meth dynamique
        try {
            Scanner sc = new Scanner(new File( "config.txt"));
//            Scanner sc = new Scanner(new File(Paths.get("").toAbsolutePath().toString()+ "config.txt"));
            Class cDaoSelected= Class.forName(sc.nextLine());
            IDao dao= (IDao) cDaoSelected.getConstructor().newInstance();
            Class cMetierSelected= Class.forName(sc.nextLine());
            IMetier metier=(IMetier) cMetierSelected.getConstructor(IDao.class).newInstance(dao);
            System.out.println("RES:"+metier.calcul());
            //Meth2 Injection via meth statique cad via constructeur
            Scanner sc2 = new Scanner(new File("config.txt"));
            Class daoSelected=Class.forName(sc2.nextLine());//classe charge en memoire
            //instancitaion de classe
            IDao dao2= (IDao) daoSelected.getConstructor().newInstance();
            Class cMetier2Selected= Class.forName(sc2.nextLine());
            IMetier metier2=(IMetier) cMetier2Selected.getConstructor().newInstance();
            Method setDao=cMetier2Selected.getDeclaredMethod("setDao", net.tayebi.dao.IDao.class);
            setDao.invoke(metier2,dao2);
            System.out.println(metier2.calcul());

//            Method setDao=cDaoSelected.getMethod("setDao", IDao.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
