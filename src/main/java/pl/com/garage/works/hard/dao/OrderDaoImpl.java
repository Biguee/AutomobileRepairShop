//package pl.com.garage.works.hard.dao;
//
//import org.aspectj.weaver.ast.Or;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import pl.com.garage.works.hard.model.Order;
//import pl.com.garage.works.hard.model.Part;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import java.util.List;
//
///**
// * Created by 8760w on 2017-07-04.
// */
//@Repository
//@Transactional
//public class OrderDaoImpl implements OrderDao {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public OrderDaoImpl(SessionFactory sessionFactory){
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public void saveOrder(Order order) {
//        sessionFactory.getCurrentSession().save(order);
//    }
//
//    @Override
//    public Order findOrderById(Integer id) {
//        return sessionFactory.getCurrentSession().find(Order.class, id);
//    }
//
//    @Override
//    public void updateOrder(int id, Order order) {
//        sessionFactory.getCurrentSession().update(String.valueOf(id), order);
//    }
//
//    @Override
//    public void deleteOrder(Order order) {
//        order.getId();
//        sessionFactory.getCurrentSession().delete(order);
//    }
//
//    @Override
//    public List<Order> findAllOrders() {
//        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
//        CriteriaQuery<Order> criteriaQuery = criteriaBuilder.createQuery(Order.class);
//        criteriaQuery.from(Order.class);
//        return getCurrentSession().createQuery(criteriaQuery).list();
//    }
//
//    private Session getCurrentSession(){
//        return sessionFactory.getCurrentSession();
//    }
//
//
//}
