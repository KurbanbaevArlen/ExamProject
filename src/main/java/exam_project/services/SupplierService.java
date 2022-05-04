package exam_project.services;

import exam_project.configuration.Configuration;
import exam_project.enums.OrderStatus;
import exam_project.models.Customer;
import exam_project.models.Order;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


public class SupplierService {
    public void save(Customer newCustomer) {
        // save a newCustomer to database

        EntityManagerFactory entityManagerFactory = Configuration.createEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Transaction transaction = (Transaction) entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newCustomer);
        transaction.commit();
    }

    public void makeAnOrder(Long customerId, Order newOrder) {
        // find customer and give order to customer
    }

    public void cancelOrder(Long customerId, Long orderId) {
        // find customer with :customerId and find customer's order with id = :orderId
        // and setOrder status CANCELED
    }

    public void update(Long customerId, Customer newCustomer) {
        // update customer with id = :customerId to newCustomer
    }

    public List<Order> findAllOrders(Long customerId, OrderStatus orderStatus) {
        // find all orders by :orderStatus where customer id = :customerId
        return null;
    }

    public List<Customer> findAll() {
        // return all customers from database
        return null;
    }

    public Customer findById(Long customerId) {
        // find customer with id = :customerId from database and return it
        return null;
    }

    public void deleteById(Long customerId) {
        // delete customer from database
    }
}
