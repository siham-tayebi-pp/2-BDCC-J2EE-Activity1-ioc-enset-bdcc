package net.tayebi.dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version1: Base de donne");
        double tmp=23;
        return tmp;
    }
}
