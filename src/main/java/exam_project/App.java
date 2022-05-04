package exam_project;

import exam_project.enums.SupplierStatus;
import exam_project.models.Address;
import exam_project.models.Customer;
import exam_project.models.Supplier;
import exam_project.services.CustomerService;
import exam_project.services.SupplierService;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        CustomerService service = new CustomerService();
        SupplierService supplierService = new SupplierService();

        Address address = new Address("KGZ","Osh city","Kara-Kulja","Motornaya");
        Customer customer = new Customer("Arlen",92348234);
        service.save(customer);
        Supplier supplier = new Supplier("arlen",22234234, SupplierStatus.BUSY);
//        supplierService.save(supplier);
    }
}
