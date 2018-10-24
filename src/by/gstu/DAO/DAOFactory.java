/*
 * Creator: Ivanov Stanislav
 *
 * Last modification 14.11.2018
 *
 */

package by.gstu.DAO;

import by.gstu.DAO.MySQLDAO.MySQLDAOFactory;


/**
 * Abstract class of Data Access Object
 *
 * @Author Stanislav Ivanov
 */
public abstract class DAOFactory {
    public static final int MYSQL = 1;

    public abstract ChildrenDAO getChildrenDAO();
    public abstract ChildGroupDAO getChildGroupDAO();
    public abstract LessonDAO getLessonDAO();

    public static DAOFactory getDAOFactory(int factory) {
        switch (factory) {
            case MYSQL:
                return new MySQLDAOFactory();

            default:
                return null;
        }
    }
}
