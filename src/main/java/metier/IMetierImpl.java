package metier;

import dao.IIDao;

public class IMetierImpl implements IMetier {
   private IIDao dao;
    @Override
    public double calcul() {
double tmp= dao.getData();
double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(IIDao dao) {
        this.dao = dao;
    }
} 
