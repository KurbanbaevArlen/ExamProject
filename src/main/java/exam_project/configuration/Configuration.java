package exam_project.configuration;

import exam_project.models.Address;
import exam_project.models.Customer;
import exam_project.models.Order;
import exam_project.models.Supplier;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import javax.persistence.EntityManagerFactory;
import java.util.Properties;

public class Configuration {
    public static SessionFactory createSessionFactory() {
        // write configuration if you want use session factory
        // if you don't use this method then don't remove!
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER,"org.postgresql.Driver");
        properties.setProperty(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
        properties.setProperty(Environment.USER,"postgres");
        properties.setProperty(Environment.PASS,"arlen2002");
        properties.setProperty(Environment.HBM2DDL_AUTO,"create");
        properties.setProperty(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL,"true");

        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Supplier.class);

        return configuration.buildSessionFactory().unwrap(SessionFactory.class);
    }

    public static EntityManagerFactory createEntityManagerFactory() {
        // write entity manager configuration if you want use entity manager factory
        // if you don't use this method then don't remove!
        Properties properties = new Properties();
        properties.setProperty(Environment.DRIVER,"org.postgresql.Driver");
        properties.setProperty(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
        properties.setProperty(Environment.USER,"postgres");
        properties.setProperty(Environment.PASS,"arlen2002");
        properties.setProperty(Environment.HBM2DDL_AUTO,"create");
        properties.setProperty(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty(Environment.SHOW_SQL,"true");

        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Order.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Supplier.class);

        EntityManagerFactory entityManagerFactory =
                configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
     return entityManagerFactory;
    }
}
