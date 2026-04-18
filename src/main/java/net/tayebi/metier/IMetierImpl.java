package net.tayebi.metier;

import net.tayebi.dao.IDao;

public class IMetierImpl implements IMetier {
    // si authowired c directement une fois il cree il linjecte si il existe deja
    private IDao dao;//couplage faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }
    public IMetierImpl() {

    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*2;
        return res;
    }
}
