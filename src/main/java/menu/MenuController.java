package menu;

import dbconnection.HibernateUtils;

public class MenuController {

    public void start() {
        HibernateUtils.getSessionFactory().openSession();
    }
}
