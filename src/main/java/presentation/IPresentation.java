package presentation;

import dao.IDaoImpl;
import metier.IMetierImpl;

public interface IPresentation
{

//ici on faitt injection de depndance creer un obj de class
public static void main(String[] args) {
    // c pas bon car si ya modif on doit modifier en code c c instan statique
//    IDaoImpl dao = new IDaoImpl();
//    IMetierImpl metier = new IMetierImpl();
//    metier.setDao(dao);
//    System.out.println(metier.calcul());
//meth 2 inject avec constructeur
    IDaoImpl dao = new IDaoImpl();
    IMetierImpl metier = new IMetierImpl(dao);
    System.out.println(metier.calcul());
    //meth3 injection avec spring

}
}
