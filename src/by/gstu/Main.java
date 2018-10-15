package by.gstu;

import by.gstu.DAO.ChildGroupDAO;
import by.gstu.DAO.ChildrenDAO;
import by.gstu.DAO.DAOFactory;
import by.gstu.Entities.ChildGroup;
import by.gstu.Entities.Children;

public class Main {
    public static void main(String[] args) {
        DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            ChildGroupDAO childGroupDAO = mysqlFactory.getChildGroupDAO();

        } catch (NullPointerException e) {
            System.out.println("Подходящей информации не найдено!");
        }
    }
}
