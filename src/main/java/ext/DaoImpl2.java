package ext;

import dao.IIDao;

public class DaoImpl2 implements IIDao {

    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=1000;
        return temp;
    }

}
