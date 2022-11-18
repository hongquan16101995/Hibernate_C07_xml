package com.example.demo.repository;

import com.example.demo.model.Person;
import com.example.demo.model.Product;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HibernateProduct {
    //sử dụng config xml tạo entitymanager dựa và sessionfactory, được dẫn ra từ file xml
    //đặt trong resource
//    private static EntityManager entityManager;
//    private static SessionFactory sessionFactory;

    //sử dụng class Java kết hợp tiêm phụ thuộc bean
    @Autowired
    private EntityManager entityManager;

//    static {
//        try {
//            sessionFactory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
//            entityManager = sessionFactory.createEntityManager();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }

//    public List<Product> findAll() {
//        String queryStr = "SELECT p FROM Product AS p";
//        TypedQuery<Product> query = entityManager.createQuery(queryStr, Product.class);
//        return query.getResultList();
//    }

    public List<Person> findAll() {
        String queryStr = "SELECT p FROM Person AS p";
        TypedQuery<Person> query = entityManager.createQuery(queryStr, Person.class);
        return query.getResultList();
    }
}
