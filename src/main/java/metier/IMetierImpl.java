package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// c comme c e qui est dna fich de config
//version 2 cree beans avec annotation
@Component("metier")
public class IMetierImpl implements IMetier {
//    @Autowired c pas recommande c mieux que constructeur
    private IDao dao;
    public IMetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }
    //injection avec setter
    //on suppr ca car injection veux avoir un seul
//    public IMetierImpl() {
//
//    }
    @Override
    public double calcul() {
        double t=dao.getData();
        double res = t*23;
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
