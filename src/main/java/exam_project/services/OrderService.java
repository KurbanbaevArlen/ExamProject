package exam_project.services;

import exam_project.models.Order;

import java.util.List;

public class OrderService {
    public void save(Order newOrder) {
        // save a newOrder
    }

    public void update(Long orderId, Order newOrder) {
        // update order with id = orderId
    }

    public List<Order> findAllOrders() {
        // find all orders
        return null;
    }

    public Order findById(Long orderId) {
        // find order by id from database and return it!
        return null;
    }

    public void deleteById(Long orderId) {
        // delete order from database where id = :orderId
    }
}
