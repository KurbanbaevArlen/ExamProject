package exam_project.services;

import exam_project.configuration.Configuration;
import exam_project.enums.OrderStatus;
import exam_project.models.Customer;
import exam_project.models.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public void save(Customer newCustomer) {
        // save a newCustomer to database
//        Session session = Configuration.createSessionFactory().openSession();
//        session.beginTransaction();
//        session.save(newCustomer);
//        session.getTransaction().commit();
//        session.close();
        EntityManagerFactory entityManagerFactory = Configuration.createEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Transaction transaction = (Transaction) entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newCustomer);
        transaction.commit();
    }

    public void makeAnOrder(Long customerId, Order newOrder) {
        // find customer and give order to customer
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();
        session.get(Customer.class,customerId);
        session.getTransaction().commit();
        session.close();

    }

    public void cancelOrder(Long customerId, Long orderId) {
        // find customer with :customerId and find customer's order with id = :orderId
        // and setOrder status CANCELED
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();


        session.getTransaction().commit();
        session.close();

    }

    public void update(Long customerId, Customer newCustomer) {
        // update customer with id = :customerId to newCustomer
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class,customerId);
        session.delete(customer);
        session.saveOrUpdate(newCustomer);
//        session.save(newCustomer,)
        session.getTransaction().commit();
        session.close();
    }

    public List<Order> findAllOrders(Long customerId, OrderStatus orderStatus) {
        // find all orders by :orderStatus where customer id = :customerId
        ArrayList<Order> orders = new ArrayList<>();
         Session session = Configuration.createSessionFactory().openSession();
         session.beginTransaction();
         while (orders.iterator().hasNext())

         session.getTransaction().commit();
         session.close();
        return null;
    }

    public List<Customer> findAll() {
        // return all customers from database
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();
        session.createSQLQuery("select c from customer").executeUpdate();
        session.getTransaction().commit();
        session.close();
        return null;
    }

    public Customer findById(Long customerId) {
        // find customer with id = :customerId from database and return it
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();
        session.get(Customer.class,customerId);
        session.getTransaction().commit();
        session.close();
        return null;
    }

    public void deleteById(Long customerId) {
        // delete customer from database
        Session session = Configuration.createSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class,customerId);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }

}
