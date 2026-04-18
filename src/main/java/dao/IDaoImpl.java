package dao;

import org.springframework.stereotype.Component;

//pour travaviller avec version xml on ajoute
// cree ca en demarrage
@Component("dao")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double temp=25;
        return temp;
    }
}
