package exam_project.models;

import exam_project.enums.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "dateTime")
    private LocalDateTime date;

    @Column(name = "price")
    private int price;

    @Column(name = "status")
    private OrderStatus status;

    @OneToOne
    @Column(name = "pointA")
    private Address pointA;

    @OneToOne
    @Column(name = "pointB")
    private Address pointB;

   @OneToMany(cascade = CascadeType.ALL,mappedBy = "orders")
   @Column(name = "supplier")
    private List<Supplier> supplier;

   @OneToMany(cascade = CascadeType.ALL,mappedBy = "orders")
   private List<Customer> customers;

    public Order(LocalDateTime date, int price, OrderStatus status) {
        this.date = date;
        this.price = price;
        this.status = status;
    }

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                ", status=" + status +
                ", pointA=" + pointA +
                ", pointB=" + pointB +
                ", supplier=" + supplier +
                ", customers=" + customers +
                '}';
    }
}
