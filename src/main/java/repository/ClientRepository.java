package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ClientRepository {

    public void addClient(Client client) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for addClient: ");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(client);

        // end transaction
        transaction.commit();

        session.close();
    }

    public static List<Client> findAllClient() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAllClient()");

        Query findAllQuery = session.createQuery("FROM Client");
        List<Client> clientListList = findAllQuery.list();

        session.close();

        System.out.println("Client List Size:  " + clientListList.size());
        return clientListList;
    }
}
